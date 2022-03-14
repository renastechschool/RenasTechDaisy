package code.day14;

public class C4StringDemo {

    public static void main(String[] args) {

        String s1 = "Rihana";//pool object
        String s2 = new String("Rihana") ;// heap object

        //references s1 and s2 are referring to two different
        // objects in the memory, hence below results to  false
        System.out.println(s1 == s2);//false

        System.out.println(s1.length());
        System.out.println(s2.length());

        //intern method returns the pool object
        System.out.println(s1 == s2.intern());//true

        //equals method of the string class only checks the
        // equality of the sequence of characters
        System.out.println(s1.equals(s2));//true



    }
}
