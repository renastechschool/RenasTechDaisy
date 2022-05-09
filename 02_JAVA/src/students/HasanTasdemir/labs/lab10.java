package students.HasanTasdemir.labs;

public class lab10 {
    public static void main(String[] args) {

        int[] intArray = new int[]{62, 45, 32, 64, 12, 87, 78, 98, 23, 7};
        int temp = 0;

        System.out.println("Original array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        System.out.println("Array sorted in descending order: ");
        for (int i = 9; i >= 0 ; i--) {
            System.out.print(intArray[i] + " ");
        }
    }

}
