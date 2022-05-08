package study;

public class lab8 {
    public static void main(String[] args) {

       int num=10;
        int previousnum= 0;;
        int nextnum= 1;
        int i =1;
         while(i<=num){
         System.out.print(previousnum+" ");
             int sum= previousnum+nextnum;
             previousnum=nextnum;
             nextnum=sum;
             i++;

         }
       /*  int maxNumber = 10, previousNumber = 0, nextNumber = 1;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        int i=1;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;*/
        }

    }


