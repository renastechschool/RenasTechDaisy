package code.day19;

public class C1Revision {

    public static void main(String[] args) {

       int myArray[] =  show() ;

       for(int i=0; i<myArray.length; i++){
           System.out.println(myArray[i]);
       }
    }


    //return type of show method is an int array
    static int[]   show(){

        System.out.println("Hello");
        int arr[]  = {10, 20, 30 , 40 };
        return arr ;
    }

}
