package students.HasanTasdemir.labs;

public class lab07 {
    public static void main(String[] args) {

        int num = 54321;
        int rev = 0;
        while (num != 0) {
            int i = num % 10;
            rev = rev * 10 + i;
            num /= 10;
        }
        System.out.println(rev);

    }
}