package exceptions;

class DynamicFieldException extends Exception{}

public class DynamicFields {

    /**
     * Каждый объект содержит пары Object-Object. Первый Object-идентификатор
     * поля String. Второй Object-значение поля любого поля.
     * GПри создании объекта в качестве аргумента передается переменная int для
     * указания колличества полей.
     */
   private Object[][] fields;
   public  DynamicFields(int initialSize){
       fields=new Object[initialSize][2];
       for(int i=0; i<initialSize; i++){
           fields[i]=new Object[]{null, null};
       }

   }

   public String toString(){
       StringBuffer result=new StringBuffer();
       for (Object[] obj:fields) {
           result.append(obj[0]);
           result.append(":");
           result.append(obj[1]);
           result.append("\n");
       }

       return result.toString();
   }

    /**
     * При вызове метода setField() он находит уде сушествующее поле по имени,
     * либо создает новое поле и помещает в него новое значение.
     */
   private int hasField(String id){
       for (int i=0; i<fields.length; i++){
           if (id.equals(fields[i][0])){
               return i;
           }
       }
       return -1;
   }

   private int getFieldNumber(String id) throws NoSuchFieldException{
       int fieldNum=hasField(id);
       if (fieldNum==-1){
           throw new NoSuchFieldException();
       }
       return fieldNum;
   }

   /**
    * Когда пространство для полей заканчивается, данный метод наращивает его на
    * 1 больше предыдущего и копирует в него старые элементы
   */
   private int makeField(String id){
       for (int i=0; i<fields.length; i++){
           if (fields[i][0] == null) {
               fields[i][0]=id;
               return i;
           }
       }

       Object[][] tmp=new Object[fields.length+1][2];
       for (int i=0; i<fields.length; i++){
           tmp[i]=fields[i];
       }
       for (int i=fields.length; i<tmp.length; i++){
           tmp[i]=new Object[]{null, null};
       }
       fields=tmp;
       //рекурсивный вызов с новыми полями
       return makeField(id);
   }

   /**
    * Метод возвращает значение, возвращенное методом setField()
   */
    public Object getField(String id) throws NoSuchFieldException{
       return fields[getFieldNumber(id)][1];
   }

    /**
     * При вызове метода находит существующие поля либо создает новое поле
     * и помещает в него значение.
     */
   public Object setField(String id, Object value) throws DynamicFieldException{
       if (value==null){
           DynamicFieldException dfe=new DynamicFieldException();
           dfe.initCause(new NullPointerException());
           throw dfe;
       }

       int fieldNumber=hasField(id);
       if (fieldNumber==-1){
           fieldNumber=makeField(id);
           }
       Object result=null;

       try {
           result=getField(id);
       }catch(NoSuchFieldException e){
           throw new RuntimeException(e);
       }
       fields[fieldNumber][1]=value;
       return result;
   }


    public static void main(String[] args) {
        DynamicFields df=new DynamicFields(3);
        System.out.println(df);
        try{
            df.setField("A", "Значение А");
            df.setField("number", 47);
            df.setField("number2", 48);
            df.setField("d", "Новое значение d");
            df.setField("number3", 11);
            System.out.println(df);
            System.out.println("df.getField(\"d\") : " + df.getField("d"));
            /**
             * Если поместить в значение поля null то это возбудит исключение
             * DynamicFieldException(), создавая объект нужного типа и передавая его
             * методу initCause() в качестве причины икслючение NullPointerException()
            */
             Object field = df.setField("d", null); // Исключение
        }catch (NoSuchFieldException e){
            e.printStackTrace(System.out);
        }catch (DynamicFieldException dfe){
            dfe.printStackTrace(System.out);
        }
   }
}
/**
 * Для построения результата toString() используется объект StringBuffer().
 * Этот класс используется в общем случае при описании работы со строками.
 */