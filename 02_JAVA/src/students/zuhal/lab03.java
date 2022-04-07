package src.students.zuhal;

public class lab03 {
    /**
     *   //    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
     *             //
     *             //            if the number can be divisible by 3, 5 and 15,
     *             then it should only be displayed in DivisibelBy15' section
     *
     *             //
     *             //            if the number can be divisible by 3 but cannot be divisible by 15,
     *             then it should only be displayed in DivisibelBy3' section
     *             //
     *             //            if the number can be divisible by 5 but cannot be divisible by 15,
     *             then it should only be displayed in DivisibelBy5' section
     *             //
     */
    public static void main(String[] args) {

        divisible();
    }

    public static void divisible(){

        String DivisibelBy15="";
        String DivisibelBy3="";
        String DivisibelB5="";

        //can print the numbers between 1 ~ 100
        for (int i = 1; i <100 ; i++) {

            //   if the number can be divisible by 3, 5 and 15,
            if ( i % 3==0  && i %5 ==0 && i%15==0){

                // then it should only be displayed in DivisibelBy15' section

                DivisibelBy15 += i +" ";
            }

            // if the number can be divisible by 3 but cannot be divisible by 15,
            if ( i % 3==0  && i%15 !=0 ){

                //   then it should only be displayed in DivisibelBy3' section

                DivisibelBy3+=i+" ";
            }

            //if the number can be divisible by 5 but cannot be divisible by 15,

            if (i %5==0  && i%15 !=0){

                // then it should only be displayed in DivisibelBy5' section
                DivisibelB5 += i+" ";

            }
        }

        System.out.println("DivisibelBy15 = " + DivisibelBy15);
        System.out.println("DivisibelBy3 = " + DivisibelBy3);
        System.out.println("DivisibelB5 = " + DivisibelB5);

    }
}

