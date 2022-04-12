package students.Mihrican;

public class Lab_04 {

    //    String -- Frequency of Characters
    //    Write a return method that can find the frequency of characters
    //
    //    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String FrequencyOfChars(String str) {

        String str1 = "";

        for(int i=0; i < str.length(); i++)

            if(!str1.contains(""+str.charAt(i)))

                str1+= ""+str.charAt(i);

        String expectedResult = "";

        for( int j=0;j < str1.length(); j++) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == str1.charAt(j))

                    count++;
            }
            expectedResult +=str1.charAt(j)+"" + count;
        }
        return expectedResult;

    }

}
