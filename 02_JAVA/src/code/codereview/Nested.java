package code.codereview;

/*Nested Loops
        Like all other programming languages, Java allows loops to be nested. That is, one loop
        may be inside another. For example, here is a program that nests for loops:
        */

// Loops may be nested.
class Nested {
    public static void main(String args[]) {
        int i, j;
        for(i=1; i<=5; i++) {

            for( j=i; j<=5; j++) {
                System.out.print(".");
            }

            System.out.println();
        }
    }
}