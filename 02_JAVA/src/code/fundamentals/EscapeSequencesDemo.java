package code.fundamentals;

public class EscapeSequencesDemo {
    /*
    Escape character        USAGE
        \n               new line character
        \t              gives a tab space
        \"              to print a double quote
        \\              to print a backslash
        \'              to print a single quote
        \f
        \r
    * */
    public static void main(String[]ap){

        System.out.println("Hello\tSalam\nNamaste\tHola/n");
        System.out.println("   \"\"\"\"   ");
        System.out.println("hello java people" +
                "hi " +
                ""
        );

        System.out.println("😂  \uD83E\uDDD8️");

        int a = 10, b=20, c=30, d=40;
        System.out.println((a+b) + "\t\t\t" + (c*d) );
    }
}
