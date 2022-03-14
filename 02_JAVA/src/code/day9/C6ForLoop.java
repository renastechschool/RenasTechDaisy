package code.day9;

public class C6ForLoop {

    public static void main(String[] args) {

        int n = 100;

        //Print Even numbers from 1 to n

        /*for(int i=0; i<=n ;  i=i+2  ) {
            System.out.println(i + " cheetah");
            System.out.println("Panda");
        }
        */
        System.out.println("EVEN\t\tODD");
        for(int i=0; i<=100; ++i ){

            System.out.println(i+"\t\t\t"+ ++i);
        }

    }
}
