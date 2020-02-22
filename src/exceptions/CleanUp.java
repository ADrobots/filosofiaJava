package exceptions;

public class CleanUp {
    public static void main(String[] args) {
        //конструирование происходит в собственном блоке try
        try{
            InputFile in=new InputFile("C://Users//tony//IdeaProjects//filosofiajava//src//exceptions//intro//introduction.txt");
            //если конструирование проходит успешно ...
            try {
                String s;
                int i=0;
                while ((s=in.getLine())!=null);
                //обработка данных по строкам

                System.out.println(s);
            }catch (Exception e){
                System.out.println("Перехвачено исключение Exception в main");
                e.printStackTrace();
                //... выполняются завершающие действия
            }finally {
                in.dispose();
            }
         //при ощибке программа входит в внешний блок
        }catch (Exception e){
            System.out.println("Ошибка при конструировании файла");
        }
    }

    /**
     * эта идиома завершения должна использоваться, если котруктор не возбуждает исключения
     * next {@link CLeanUpIdiom}
     */
}
