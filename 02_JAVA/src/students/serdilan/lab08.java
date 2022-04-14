package students.serdilan;

public class lab08 {
    //    Write a return method that returns the Fibonacci of any given number
    public static void main(String[] args) {
    int number=55;
        System.out.println(isFibonacci(number) ?  number +  " is a Fibonacci Number" :  number + " is a not Fibonacci Number");
    }
   public static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    public static boolean isFibonacci(int n)
    {
        return isPerfectSquare(5*n*n + 4) ||
                isPerfectSquare(5*n*n - 4);
    }
}
