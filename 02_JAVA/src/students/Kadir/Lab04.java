package students.Kadir;
//    String -- Frequency of Characters
//    Write a return method that can find the frequency of characters
//
//    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

public class Lab04 {
    public static void main(String[] args) {
        String str="AAABBCDD";
        frequencyOfChars(str);
    }

    public static void frequencyOfChars(String str){
        int num=0;
        int num1=0;
        int num2=0;
        int num3=0;

        char ch='A';
        char ch1='B';
        char ch2='C';
        char ch3='D';
        for (int i=0 ;i<str.length();i++) {
            if (ch==str.charAt(i)){
               ++num;
            }else if(ch1==str.charAt(i)){
                ++num1;
            }else if(ch2==str.charAt(i)){
                ++num2;
            }else if ((ch3==str.charAt(i))){
                ++num3;
            }
        }
        System.out.println(ch+""+num+""+ch1+num1+""+ch2+num2+""+ch3+num3);


    }
}
