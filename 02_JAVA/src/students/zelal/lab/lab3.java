package students.zelal.lab;

public class lab3 {

    //            ## Lab 03 -    (Numbers) Divisible by 3, 5, 15
//            Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
//
//            if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
//
//            if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
//
//            if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
//



        public static void main(String[] args) {

            int N = 100;
            {
                System.out.print("Divisible by 3: ");
                for (int num = 0; num < N; num++) {
                    if (num % 3 == 0 && num % 15 != 0) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                System.out.print("Divisible by 5: ");
                for (int num = 0; num < N; num++) {
                    if (num % 5 == 0 && num % 15 != 0) {
                        System.out.print(num + " ");
                    }

                }
                System.out.println();
                System.out.print("Divisible by 15: ");
                for (int num = 0; num < N; num++) {
                    if (num % 15 == 0) {
                        System.out.print(num + " ");
                    }
                }
            }
            System.out.println();
            divisible();
        }


        // with methods
    public static void divisible(){

        String DivisibelBy15="";
        String DivisibelBy3="";
        String DivisibelBy5="";


        for (int i = 1; i <100 ; i++) {


            if ( i % 3==0  && i %5 ==0 && i%15==0){


                DivisibelBy15 += i +" ";
            }


            if ( i % 3==0  && i%15 !=0 ){

                DivisibelBy3+=i+" ";
            }


            if (i %5==0  && i%15 !=0){


                DivisibelBy5 += i+" ";

            }


        }

        System.out.println("DivisibelBy15 = " + DivisibelBy15);
        System.out.println("DivisibelBy3 = " + DivisibelBy3);
        System.out.println("DivisibelBy5 = " + DivisibelBy5);


    }
    }

