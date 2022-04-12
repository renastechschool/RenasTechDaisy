package students.Mihrican;

public class Lab_06 {

    //   Write a return method that returns the
    //   factorial number of any given number

    public static int factorialNumber(int n){

        int result = 1;

        for(int i = 1; i <= n; i++){

            result = result * i;
            //res=res+i   -->sum
        }
        return result;}

    public static void main(String[] args) {

        int num = 1234, reverse = 0;


        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reverse = reverse * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}
