package code.day19;

public class C9MethodDemo {


    public static void main(String[] args) {

        int arr[]  = { 10, 20, 30, 5} ;
        //passing array as the argument
        printArray(  arr    ) ;

        int arr2[] ={3, 9, 8};
        System.out.println("\nSecond array");
        printArray(arr2);
        System.out.println("\nThird Array");
        //anonymous array(an array with no name) as the argument
        printArray(  new int[]{9,8,4,2,10,-9,0,2}   );
    }

    //printArray method takes int type array as argument
    static void printArray(int[] arr ){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
