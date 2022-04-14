package students.Yasemin;

public class Lab7 {
    public static void main(String[] args) {

        System.out.println("Answer 1.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Answer 2.");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("Answer 3.");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Answer 4.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // System.out.println("");
        System.out.println("Answer 5.");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("Answer 6.");

        int b = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                b++;

                System.out.print(b + " ");
            }
            System.out.println();
        }

        System.out.println("Answer 7.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("Answer 8.");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("Answer 9.");
        for (int i = 1; i < 8; i++) {
            for (int j = 7; j > i; j--)
                System.out.print(" ");

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Answer 10.");
        for ( int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 8; j >= (i * 2) - 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

