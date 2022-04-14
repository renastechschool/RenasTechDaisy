package students.mahir;

public class Lab02 {
    /**
     * //    Write a method that can find the maximum number
     *    from an int Array
     */

    public static void main(String[] args) {

        int [] arr={1,2,3,90,0,-90,4}; // expected => 90
        //          0 1 2 3 4 5 6

        System.out.println(maxNumber(arr));

    }



    public static int  maxNumber(int[] arr){
                                 //  {1,2,3,90,0,-90,4}

        int max= arr[0]; // I assume that this is max number;

        for (int i = 0; i < arr.length ; i++) { // i=0 , i=1; 1++> 2 , i=3 , i=4 ...

            //logic
            //   1 > 1
            //  2 > 1
            // arr[2]=> 3 > 2
            // arr[3] => 90 > 3
            // arr[4] => 0 > 90
            if ( arr[i] > max){

                max= arr[i]; // max = 90
            }

        }

        return  max;

    }



}
