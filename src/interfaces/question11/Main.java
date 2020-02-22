package interfaces.question11;

public class Main {
    public static String mainMethod(String s) {
       /* String massivSimvolov = Arrays.toString(s.split(""));*/
        char[] s1=new char[s.length()];
        char[] s2=s.toCharArray();

        int j=0;
        String res="";
        for (int i=s2.length-1; i>=0; i--){

            s1[j]=s2[i];

            /*System.out.println(s1[j]);*/

            j++;
        }
        for (char x: s1) {
            /*System.out.println(x);*/
            res+=""+x;
        }

        return res;

    }


    public static void main(String[] args) {
        System.out.println(mainMethod("hello"));
        System.out.println(mainMethod("bye"));
    }
}