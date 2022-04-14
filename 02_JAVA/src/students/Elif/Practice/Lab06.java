package students.Elif.Practice;

public class Lab06<c> {
    public static void main(String[] args) {
//        ## Lab 06 - Grades
//        ___
//
//        Create a program that categorizes grades
//
//## Objective
//
//### Question 1 ) Consider the marks of following five subjects  and print the Percentage and result based on that percentage.
//                Georgian, English, Maths, Science, Computers. Marks should be out of 100.
//        Percentage=(Total Marks of all 5 subjects/500)*100.
//        Percentage 		   Result
//<40			           FAIL
//                >=40 and <50           THIRD
//                >=50 and <60	   SECOND
//                >=60 and <75	   FIRST
//                >75			           FIRST WITH DISTINCTION
//
//
//        String Class1="Georgian";
//        String Class2="English";
//        String Class3="Maths";
//        String Class4="Science";
//        String Class5="Computers";
        int Class1Grade = 65;
        int Class2Grade = 76;
        int Class3Grade = 80;
        int Class4Grade = 70;
        int Class5Grade = 78;
        int percentage = (Class1Grade + Class2Grade + Class3Grade + Class4Grade + Class5Grade) / 5;
        if (percentage < 40) {
            System.out.println("FAIL");
        } else if (percentage >= 40 && percentage < 50) {
            System.out.println("THIRD");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("SECOND");
        } else if (percentage >= 60 && percentage < 75) {
            System.out.println("FIRST");
        } else if (percentage >= 75 && percentage <= 100) {
            System.out.println("FIRST WITH DISTINCTION");
        } else System.out.println("Invalid Grade Percentage");


        //### Question 2 ) WAP to enter two numbers and swap them using a third variable and print them .
//
//
        int number1 = 29;
        int number2 = 50;
        int swap;
        swap =number1;
        number1 = number2;
        number2 = swap;
        System.out.println(number1);
        System.out.println(number2);

//### Question 3 ) WAP to enter a number and swap and print them without using a third variable.
//
//
//
        int a=45;
        int b=65;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }

}