package code.studyhalls.studyHall3;

public class LoopPattern {
    /*
     1
     12
     123
     1234
     12345
     */
    public static void main(String[] args) {

        //outer loop is for the number of rows
        for(int i=1; i<=5 ; i++){

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }


            System.out.println();
        }
    }
}
