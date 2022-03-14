package code.day15;

public class C5StringMethods {


    public static void main(String[] args) {

        String s1 = "New York to Chicago" ;
        /*System.out.println(s1.startsWith("New"));

        System.out.println(s1.startsWith("new"));

        System.out.println(s1.endsWith("cago"));

        System.out.println("hell ogo".endsWith("o go"));*/

        //s2 is an empty string because it
        //does not contain any characters.
        //En empty string is a valid string in Java
        String s2 = ""  ;
        System.out.println(s2.length());
        System.out.println(s2.isEmpty());
        System.out.println(s1.isEmpty());
        System.out.println(s1.length());

    }
}
