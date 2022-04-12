package students.Mihrican;

public class Lab_02 {
    //    Write a method that can find the maximum number from an int Array


    public static void main(String[] args) {

        int [] arr={1,2,3,90,0,-90,4};

        System.out.println(maxNumber(arr)); }

    public static int  maxNumber(int[] arr){

        int maxnum= arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if ( arr[i] > maxnum){

                maxnum= arr[i];
            }

        }

        return  maxnum;

    }
}

