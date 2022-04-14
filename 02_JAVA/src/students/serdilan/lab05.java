package students.serdilan;
//    Write a method that can return the sum of the digits in a string
public class lab05 {
    public static void main(String[] args) {
// input alphanumeric string
        String str = "sd4l3s5sf1";

        // Function call
        System.out.println(getSumOfDigit(str));
    }
    public static int getSumOfDigit(String str){
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch))
                temp += ch;
            else {

                sum += Integer.parseInt(temp);

                // reset temporary string to empty
                temp = "0";
            }
        }

        return sum + Integer.parseInt(temp);
    }
}
