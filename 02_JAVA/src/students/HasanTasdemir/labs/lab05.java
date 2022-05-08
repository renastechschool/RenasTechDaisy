package students.HasanTasdemir.labs;

public class lab05 {
    public static void main(String[] args) {

        int sum = 0;
        String str = "1903";
        char arr []= str.toCharArray();
        for(int i = 0; i<str.length(); i++) {
            int s = Integer.parseInt(String.valueOf(arr[i]));
            sum = sum + s;
        }
        System.out.println(sum);
        }
    }

