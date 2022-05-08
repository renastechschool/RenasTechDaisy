package students.Mihrican;

public class Lab_03 {

    public static void main(String[] args) {

        divisible();
        //  Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
        //  if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
        //  if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
        //  if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
    }
    public static void divisible(){

        String DivisibleBy15="";
        String DivisibleBy3="";
        String DivisibleBy5="";

        for (int i = 1; i<100 ; i++){

            if ( i % 3 == 0 && i %5 ==0 && i %15==0){

                DivisibleBy15 += i + " " ;
            }

            if (i % 3==0 && i%15 !=0){
                DivisibleBy3+=i+" ";
            }
            if (i % 5 == 0 && i % 15 != 0) {

                DivisibleBy5 += i+" ";
            }
        }
        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);
        System.out.println("DivisibleB5 = " + DivisibleBy5);
    }
}
