package code.day11;

public class C2RevisionNestedLoop {


    public static void main(String[] args) {

        /*
        54321
        5432
        543
        54
        5
         */

        for(int i=1; i<=5; i++){

            for(int j=5; j>=i; j--){
                System.out.print(j);
            }

            System.out.println();

        }
    }
}
