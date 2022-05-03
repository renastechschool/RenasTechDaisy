package students.serkan.Lab;

public class Lab08 {
    public static void main(String[] args) {
        //    ## Lab 08 - (Numbers) Fibonacci numbers
        //    Write a return method that returns the
        //    Fibonacci of any given number
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
