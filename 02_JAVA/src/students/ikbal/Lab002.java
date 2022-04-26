package students.ikbal;
//MAX number
public class Lab002 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,0};
        maximumNumber(arr);
    }
    public static int  maximumNumber(int[]arr){
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        return max;
    }
}
