package code.day20;

public class C7CompoundAssignment {

    public static void main(String[] args) {

        /*int i = 10 ;
        System.out.println(i);
        i = i + 10 ;
        System.out.println(i);

        //+= compound assignment OR Augmented assignment
        i+=10 ;// short hand of i = i+10
        System.out.println(i);

        System.out.println(i-=20);
        //System.out.println(i=i-20);
        */
       /*
       +=
       -=   i-=10 ;  shorthand of i=i-10;
       *=   i*=10;                i=i*10
       /=   i/=10;                  i=i/10
       %=   i%=10;                 i=i%10
        */

        int k=10;
        k*=10+20/2;
        //k = k*10+20/2
        System.out.println(k);
    }
}
