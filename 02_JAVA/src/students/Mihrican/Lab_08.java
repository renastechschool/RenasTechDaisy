package students.Mihrican;

public class Lab_08 {

    //    Write a return method that returns the Fibonacci of any given number

    public static int fib(int num){

        int result=0;
        int a=0;
        int b=1;

        for(int i=1; i<num; i++){

            result=a+b;
            a=b;
            b=result;
        }
        return result;
    }
}
