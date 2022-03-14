package code.day14;

public class C2StringDemo {


    public static void main(String[] args) {

       /* String str = "Hello" ;

        System.out.println(str.length());
        System.out.println();

        String str2 = new String("Hi");
        System.out.println(str2.length());

        System.out.println("slav".length());//4
        System.out.println("slav".charAt(3));//v
        */


        String s1 = "Shakira";//pool object
        String s2 = new String("Shakira") ;// heap object
        String s3 = "Shakira";//pool object


        System.out.println(s1==s3);//true

        System.out.println(s1==s2);//false
        String s4  = "Shakira";
        String s5 = "Shakira";

        System.out.println(s1==s4);
        System.out.println(s4==s5);
        System.out.println(s5==s1);





    }
}
