package code.operatorsPrac;

public class Operators {
    /*
    3 Types of Operators:
    1) Unary Operator: operators that act on one operand
    2) Binary operators: operators that act on 2 operands
    3) Ternary OR Tertiary: operators that act on 3 operands
    */

    /*ARITHMETIC OPERATORS (all are binary)
    -   Subtraction
    +   Addition
    *   multiplication
    /   division
    %   modulus- to get the remainder
    */

    /*
    Sequence of Arithmetic Operations
            B	Brackets , paranthesis in programming ()
            E  	Exponents
            MD	Multiplication and Division , left to right associativity
            AS	Addition and Subtraction +-, left to right associativity
   */
    public static void main(String[]ap){
        int i = 10 - 2 * 5 / 5 + 3 ;
        //i = 10 - 10 / 5 + 3
        //i = 10 - 2 + 3
        //i = 8 + 3
        //i = 11
        /*System.out.println(i);

        System.out.println(10/2);

        System.out.println(10%2);

        System.out.println("11/2="+(11/2));
        System.out.println("11%2=" + (11%2));

        System.out.println(11.0/10);
        System.out.println(11.0/2);
        */

        System.out.println(1/2);

        System.out.println(1%2);

        System.out.println(1.0/2.0);
        System.out.println(1.0/2);
        System.out.println(1/2.0);




    }
}