package students.Okan;

public class lab04 {
    //    String -- Frequency of Characters
    //    Write a return method that can find the frequency of characters
    //
    //    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static void main(String[] args) {
        char ch1='A';
        char ch2='B';
        char ch3='C';
        char ch4=(char) 'D';
        String str="AAABBCDD";
        int n1=0,n2=0,n3=0,n4=0;

        for (int i=0;i<str.length();i++){
            if(ch1==str.charAt(i)){
                n1++;
            }
            else if(ch2==str.charAt(i)){
                n2++;
            }
            else if(ch3==str.charAt(i)){
                n3++;
            }
            else if(ch4==str.charAt(i)){
                n4++;
            }
        }
        System.out.println(Character.toString(ch1)+n1+String.valueOf(ch2)+n2+Character.toString(ch3)+n3+ch4+n4);

    }
}
