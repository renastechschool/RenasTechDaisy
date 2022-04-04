package students.Kadir;

////    Write a return method that returns the
//            Fibonacci of any given number

public class Lab08 {

    //1,2,3,5,8,13,21,34

    public static void main(String[] args) {

        System.out.println(fib(10));
    }

    public static int fib(int num){

        int previousNumber=0;
        int nextNumber=1;

             int sum=0;
        for(int i=0; i<=num; i++){
            System.out.print(previousNumber + " ");
            sum=previousNumber + nextNumber;
           previousNumber=nextNumber;
           nextNumber=sum;

        }

        return sum;

    }
}
