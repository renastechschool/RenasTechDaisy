package students.HasanTasdemir.labs;

public class lab01 {


    public static void main(String[] args) {
        String str = "AABBCCDDEFG";
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int a = 0;
            for (int j = 0; j < str.length(); j++) {
                if (arr[i] == arr[j] && i != j) {
                    a = 1;
                    break;
                }
            }
            if(a==0)
                System.out.println(arr[i]);
        }
    }
}