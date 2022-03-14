package code.day15;

public class C4StringMethods {

    public static void main(String[] args) {

        String str = "HumptyDumpty";
        boolean b = str.contains("mpty");

        System.out.println(b);

        System.out.println("HelloFelloRello".contains("Fell"));

        //trim() trims the spaces at the beginning and end
        //of a string
        String s2 = "    hello guys      !      !         ";
        System.out.println(s2.trim());

        System.out.println("slav_chao$NAMASTE".toLowerCase());
        System.out.println("slav_chao$NAMASTE".toUpperCase());

    }
}
