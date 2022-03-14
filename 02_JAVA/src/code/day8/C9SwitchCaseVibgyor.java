package code.day8;

public class C9SwitchCaseVibgyor {

    public static void main(String[] args) {
        //Convert the below piece of code to switch case
        char color='I';
        /*if(color== 'i' || color=='I' )System.out.println(" color is Indigo");
        else if(color=='v' || color=='V')System.out.println(" color is Voilet");
        else if(color=='b' || color=='B') System.out.println(" color is Blue");
        else System.out.println("No color");*/

        switch(color){

            case 'i':
            case 'I': System.out.println(" color is Indigo"); break;

            default:  System.out.println("No color");
        }


    }
}
