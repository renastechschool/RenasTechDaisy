package code.fundamentals;

public class DataTypesPrac {

    public static void main(String[]ap){
        /*
        Any variable declared inside a method is called a local variable.
        A local variable must be initialized before it can be used.
        * */

        //below statement declares and initializes the variable x in the same statement
        //int x = 10;

        //Declaraion: Specify the name and data type of the variable
        // declaration of a variable OR declaring a variable dollars
        int dollars ;

        //initialization of the variable dollars
        //initialization means giving the very first value to the variable
        //Initialization: assigning the first value to a variable
        dollars = 10 ;
        System.out.println("dollars=" + dollars);
        dollars = 20;
        System.out.println(dollars);    dollars = 50 + 10 ;
        System.out.println(dollars);
        System.out.println(dollars + dollars);
        System.out.println(dollars);//60 OR 120

    }
}
