package students.ikbal;

public class Lab006 {
    //    Write a return method that returns the
    // factorial number of any given number
    public static void main(String[] args) {

        int n = 6;

        int factorial = 1;

        for (int i =1; i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
