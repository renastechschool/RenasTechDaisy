package code.day7;

/*
VACATION PROGRAM
-----------------
SALARY
<10000 go to Park
10k to 50k go to California
50k to 90k go to Europe
>90k go on a World Tour
* */

public class C4IfElse {
    public static void main(String[]ap){

        int salary = 100000;
        if(salary<10000) {
            System.out.println("Go to the Park");
        }
        //else block will run only if salary is greater than 10000
        else{

           if(salary<50000) {
               System.out.println("Go to California");
           }
           else{
               if(salary < 90000) {
                   System.out.println("Go to Europe");
               }
               else {
                   System.out.println("Go on a world tour");
               }

           }

        }


    }
}
