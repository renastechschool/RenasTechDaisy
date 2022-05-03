package students.serkan.Lab;


public class Lab03 {

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
    }
}
