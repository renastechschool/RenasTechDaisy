package students.zelal.practice;

public class Lab07 {

    public static void main(String[] args) {

//
//        ### 1) WAP to print the following pattern
//```
//        54321
//        5432
//        543
//        54
//        5

        int number=5;
        for (int i = 1 ; i <= number; i++){
            for (int j=number; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//### 2) WAP to print the following pattern
//        1
//        22
//        333
//        4444
//        55555

        for (int i = 1; i <= 5; i++) { // 1 2 3 4 5

            for (int j = 1; j <= i; j++) {


                System.out.print(i);
            }

            System.out.println();

   }
//
//
//        Difficult questions for bonus
//                -----------------------------
//### 3) WAP to print the following pattern
//        *
//       ***
//      *****
//     *******
//    *********
//   ***********
//  *************
// ***************
            for (int x = 0; x < 10; x++) {
                for (int j = 0; j < 10 - x; j++)
                    System.out.print(" ");
                for (int k = 0; k < (2 * x + 1); k++)
                    System.out.print("*");
                System.out.println();
            }
//### 4) WAP to print the following pattern
//*        *
//**      **
//***    ***
//****  ****
//**********

            int i, j, row=10;
            for(i=0; i<row; i++)
            {
                for(j=1; j<=i; j++)
                {
                    System.out.print("*");
                }
                for (j=2*(row-i); j>=0; j--)
                {
                    System.out.print(" ");
                }
                for (j=1; j<=i; j++ )
                {
                    System.out.print("*" );
                }
                System.out.println();
            }



        }
    }

