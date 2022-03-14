package code.studyhalls.studyHall1;

public class IncrementDecrementDemo {

    public static void main(String[]ap){

        int i = 5;

        //++i pre increment : first increment, then use
        //i++ post increment: first use, then increment
        //--i pre decrement: first decrement, then use
        //i-- post decrement: first use then decrement

        int r = ++i + i++ - --i;



        System.out.println(r);
        System.out.println(i);
    }

}
