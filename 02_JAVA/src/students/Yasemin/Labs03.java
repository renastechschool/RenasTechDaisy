package students.Yasemin;

public class Labs03 {
    public static void main(String args[]) {
        System.out.println("\nDivisibelBy3: ");
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%15!=0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivisibelBy5 ");
        for (int i=1; i<100; i++) {
            if (i%5==0 && i%15!=0) System.out.print(i +", ");
        }

        System.out.println("\n\nDivisibelBy15 ");
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0 && i%15==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }
}


