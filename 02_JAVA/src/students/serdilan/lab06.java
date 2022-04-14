package students.serdilan;

public class lab06 {
   // Write a return method that returns the factorial number of any given number
   public static void main(String[] args) {
   int number=4;
       System.out.println(findFactorial(4));
   }
   public static int findFactorial(int n){
       if (n == 0)
           return 1;

       return n * findFactorial (n - 1);
   }
}
