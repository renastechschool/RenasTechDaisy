package students.Mihrican;

public class Lab_07 {

    //    Write a return method that can reverse number and return it as int

    public static void main(String[] args) {

        System.out.println("reverseInt( 54) = " + reverseInt(54));
        System.out.println("reverseInt(6721) = " + reverseInt(6721));
    }

    public static int reverseInt(int number){
        int result=0;
        while (number!=0){

            int lastDigit= number % 10;
            result= result *10 +lastDigit;
            number /=10;

        }
        return result;

    }
}


