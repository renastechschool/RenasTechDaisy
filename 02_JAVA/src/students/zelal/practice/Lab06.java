package students.zelal.practice;

public class Lab06 {

//    Create a program that categorizes grades
//
//## Objective
//
//### Question 1 ) Consider the marks of following five subjects  and print the Percentage and result based on that percentage.
//            Georgian, English, Maths, Science, Computers. Marks should be out of 100.
//    Percentage=(Total Marks of all 5 subjects/500)*100.
//    Percentage 		   Result
//<40			           FAIL
//>=40 and <50           THIRD
//>=50 and <60	   SECOND
//>=60 and <75	   FIRST
//>75			           FIRST WITH DISTINCTION
//
//

//
//
//### Question 3 ) WAP to enter a number and swap and print them without using a third variable.

    public static void main(String[] args) {





       int Georgian = 90;
       int English= 85;
       int Maths = 75;
       int Science = 90;
       int Computers= 80;

       int Percentage = (( (Georgian+English + Maths + Science + Computers) /5));

       String result= ((Percentage < 40) ? "failed" : ( Percentage>=40 && Percentage <50 )? "THIRD" : (Percentage>=50 && Percentage <60) ? "SECOND":
                (Percentage>=60 && Percentage<75) ? "FIRST" : (Percentage>75 )? "FIRST WITH DISTINCTION" : "NOT VALID");
        System.out.println(result);



        //### Question 2 ) WAP to enter two numbers and swap them using a third variable and print them .

        int a= 10;
        int b=15;
        int c;

        c=a;
        a=b;
        b=c;

        System.out.println(" a = " +a + " "+ " b= " + b);


        int d=10;
        int e=15;
        d=d+e;
        e=d-e;
        d=d-e;
        System.out.println(a);
        System.out.println(b);

        System.out.println(" d = " +d + " "+ " e= " +e);
    }
}
