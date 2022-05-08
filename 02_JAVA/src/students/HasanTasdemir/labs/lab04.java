package students.HasanTasdemir.labs;

public class lab04 {
    public static void main(String[] args) {
        String str = "AAABBCCCCD";
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[0] == str.charAt(i)) {
                count ++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (ch[3] == str.charAt(i)) {
                count1 ++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (ch[5] == str.charAt(i)) {
                count2 ++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (ch[9] == str.charAt(i)) {
                count3 ++;
            }
        }

        System.out.println( ch[0]+""+count+""+ch[3]+""+count1+""+ch[5]+""+count2+""+ch[9]+""+count3);
    }
}