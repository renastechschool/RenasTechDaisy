package code.day8;

public class C10SwitchCaseSeasons {
        public static void main(String...ar){
            String season;
            int month=9;
            switch (month) {
                case 12:
                case 1:
                case 2:System.out.println("Get you coat!");
                         season = "Winter"; break;

                case 3:System.out.println("Lets go movies!");
                case 4:
                case 5: season = "Spring";    break;

                case 6:
                case 7:
                case 8: season = "Summer";   break;

                case 9:
                case 10:
                case 11: season = "Autumn";   break;

                default:
                    season = " Not a season of Earth. Go to Mars";
            }
            System.out.println("Season is "+ season);
        }
    }

