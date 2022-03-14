package code.day19;

public class C13Anonymous2DArray {

    public static void main(String[] args) {

        print2DArray(

                new int[][]{
                        {10,20,30},
                        {40,50,60},
                        {70,80,90 }
                }
        );
    }

    static void print2DArray(int arr[][]){

       for(int i=0; i<arr.length; i++){

           for(int j=0; j<arr[i].length; j++){
               System.out.print(arr[i][j]+"  ");
           }
           System.out.println();
        }
    }

}

