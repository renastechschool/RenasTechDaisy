package code.day10;

public class C5NestedForLoop {

    /*
    *
    **
    ***
    ****
    */

    public static void main(String[] args) {

        for(int r=1; r<=4; r++){

            for(int c=1; c<=r; c++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

}
