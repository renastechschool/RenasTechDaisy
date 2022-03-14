package code.day10;

public class C1Revision {

    public static void main(String[] args) {



        //every number has atleast 2 factors
        //first is the number itself
        //second is number 1

        int n = 8;
        //flag variable assumes that the number is a prime number
        boolean flag = true ;
        /*
            below for loop checks if the given number n is
            divisible by any other number apart from number itself
            and number 1
       */
        for(int i=2; i<n; i++){

            //if the number is divisible by any other number then
            // flag becomes false
            if(n%i == 0){
                flag = false;
                break ;
            }
        }

        if(flag)
             System.out.println(" Prime Number");
        else
            System.out.println("Not prime");


    }
}
