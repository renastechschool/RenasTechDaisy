package students.Yasemin;

public class Lab03 {
    public static void main(String[] args) {
        System.out.println("Question 1 ");
        System.out.println(-5 +8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        System.out.println("********************");

        System.out.println("Question 2");



        int n= 2;

        int i=0;
        for (i=1; i<=10; i++){

            System.out.println(n + "*" + i + "=" + ( i * n ));
        }
        System.out.println("Question 3");
        int point=85;
        if(point>=91 && point<100) System.out.println("A");
        if(point>=75 && point<90) System.out.println("B");
        if(point>=60 && point<74) System.out.println("C");
        if(point>=40 && point<59) System.out.println("D");
        else if (point<40) System.out.println("E");

    }
}
