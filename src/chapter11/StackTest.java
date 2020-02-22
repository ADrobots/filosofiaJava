package chapter11;


public class StackTest {
    public static void main(String[] args) {
        chapter11.Stack<String> stack=new chapter11.Stack<String>();

        for (String s:"Hello world i am happy".split(" ")) {
            stack.push(s);
        }

        while(!stack.empty()){
            System.out.print(stack.pop()+" ");
        }

        System.out.println();

    /**
     * При создании объекта типа Stack<T> необходимо указать полный путь пакета или выбрать другое
     * имя Объекта(то, которое бы не конфликтовало с импортированым из пакета java.util.*(Stack)/
     * Т.е. для предотвращения конфликтов придется использовать имена пакетов
     * */

    //Stack collision - столкновение стека

    chapter11.Stack<String> stack1=new chapter11.Stack<String>();
        for (String s:"Pleace give me a cup of tea".split(" ")) {
            stack1.push(s);
        }
        while(!stack1.empty()){
            System.out.print(stack1.pop()+" ");
        }

        System.out.println();

     java.util.Stack<String> stack2=new java.util.Stack<String>();
        for (String s:"Thanks for the help".split(" ")) {
            stack2.push(s);
        }
        while (!stack2.empty()){
            System.out.print(stack2.pop()+" ");
        }

        /**
         * для выбора реализации Stack возможно воспользоваться импорированием:
         * import chapter11.Stack
         */

    }
}
