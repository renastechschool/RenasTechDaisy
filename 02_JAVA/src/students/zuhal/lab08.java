package src.students.zuhal;

public class lab08 {
    /*
## Lab 08 -  (Numbers) Fibonacci numbers
             Write a return method that returns the
             Fibonacci of any given number
 */

    public static void main(String[] args) {
        int num1 = 0, nu2=1,nu3,i,count =10;
        System.out.println(num1+""+nu2);
        for(i=2; i<count; i++){
            nu3=nu2;
            System.out.println(""+nu3);
            num1 = nu2;
            nu2=nu3;
        }
    }
}

