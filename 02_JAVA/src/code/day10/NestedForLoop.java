package code.day10;

public class NestedForLoop {


    public static void main(String[] args) {

        for(int i=1; i<=5; i++) {

            for (int j=1; j<=5; j++){

                System.out.print("*");
            }
            //below println moves the cursor to the next row
            System.out.println();

        }

    }
}
