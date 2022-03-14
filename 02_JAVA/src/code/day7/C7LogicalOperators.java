package code.day7;

public class C7LogicalOperators {

    /*
   BOOLEAN LOGICAL OPERATORS (Binary Operators)
   -------------------------
   &&   Boolean AND operator
   ||   Boolean OR operator
   !    Boolean INVERT/ NOT operator

   NOTE: a Boolean Logical operator can only be appiled
   to a boolean value
    * */

    public static void main(String[]ap){

        /*System.out.println(10.5>6);
        System.out.println('n'=='n');
        //System.out.println(false>true); ERROR
        System.out.println(false==false);
        System.out.println("hello"=="hellO");
        */

        /*
        AND
        && will evaluate to true iff both the conditions
        on the left and the right side of the &&
        operator are true otherwise it will evaluate to false

            true && true = true
            true && false = false
            false && true = false
            false && false  = false

        * */
        /*System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        */

        /*OR
        || will evaluate to true if atleast one condition is true
        otherwise it will evaluate to false

               true || true  = true
               true || false = true
               false || true = true
               false || false = false

        * */
        //System.out.println(true || false);

        //System.out.println(  10<9  || 5>6);// false || false

        //System.out.println(false || false) ; //false

        //System.out.println( true || false && true);



        System.out.println(

                true || (true && false) && (6*6==30+6) || true


        ) ;
    }
}
