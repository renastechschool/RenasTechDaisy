package students.serdilan;

public class lab02 {
    //    Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        int array[] = new int[]{34, 45, 55, 2, 233, 23};
        int max = getMax(array);
        System.out.println("Maximum Value is: "+max);
    }
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
}
