package students.serkan.Lab;

public class Lab01 {
    public static void main(String[] args) {

                String str="AAABBBCCCDEF";
                uniqueCharacters(str);

            }

            public static void uniqueCharacters(String str) {
                char findunique = 0;
                for (int i=0;i<str.length();i++){
                    findunique=str.charAt(i);
                    if (str.indexOf(findunique) != str.lastIndexOf(findunique)){
                    }else
                        System.out.print("" + findunique);
                }
            }
}
