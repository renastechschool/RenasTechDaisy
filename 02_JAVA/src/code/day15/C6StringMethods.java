package code.day15;

public class C6StringMethods {

    public static void main(String[] args) {

        //anything in doule quotes in java ia a pool string object
        String s1 = "Hello-slav";
        String s2 = "Hello-slav" ;
        s2 = new String(s2) ;
        System.out.println(s1.contentEquals(s2));
        System.out.println(s1==s2);//checks the equality of the references
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
