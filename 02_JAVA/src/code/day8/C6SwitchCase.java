package code.day8;

public class C6SwitchCase {

    public static void main(String[]sp){

        int option = 6;

        switch(option){
            case 1:
                System.out.println("Hello"); break;

            case 2:
                System.out.println("slav"); break;

            default:
                System.out.println("Eat noodles!"); break;

            case 3:
                System.out.println("Salam");
                break;

            case 4:
                System.out.println("Chao"); break;
        }


        /*

        int option = 6;
        if (option == 1) System.out.println("Hello");
        else if (option == 2) System.out.println("Slav");
        else if (option == 3) System.out.println("Eat Noobles");
        else if (option == 4) System.out.println("Salam");
        else System.out.println("Chao");

        */
    }
}
