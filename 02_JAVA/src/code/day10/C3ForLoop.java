package code.day10;

public class C3ForLoop {

    public static void main(String[] args) {

        //print the following series using for loop
        //1/2  2/3  3/4  4/5  ...... n-1/n

        int n = 2058566 ;
        for(int i = 1; i<n; i++){

            System.out.print(i+"/"+(i+1)+"   ");
        }

    }
}
