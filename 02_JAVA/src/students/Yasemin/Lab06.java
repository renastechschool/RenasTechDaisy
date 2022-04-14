package students.Yasemin;

public class Lab06 {
    public static void main(String[] args) {
        System.out.println(" Question 1 ");
        System.out.println("************");
        double Georgian = 91, English=77, Maths =88, Science = 88, Computers =76;
        double  percentage = (((Georgian + English +  Maths + Science + Computers) /500)*100);
        System.out.println("Average is =" + percentage);
        String result = (percentage <40 ? "fail" : percentage>=40 && percentage < 50 ? "Third"
                : percentage >= 50 && percentage <60 ?"second"
                : percentage>=60 && percentage <75 ? " first" :  "FIRST WITH DISTINCTION" );
        System.out.println("Result =" + result);

        System.out.println(" Question 2 ");
        System.out.println("************");
        int a=10, b=20;
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println(" Question 3 ");
        System.out.println("************");

        int c=10, d=20;
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("c=" +c);
        System.out.println("d=" +d);

        System.out.println(" Question 3 ");
        System.out.println("************");

         double    km=10, m=km*1000, ft=m*3.3, in=ft*12, cm=m*100;
        System.out.println(" km=" +km + " m="+m + ft + " in+" +in + " cm="+cm);

        }
}



