package students.Elif.Practice;

public class Lab04 {
    public static void main(String[] args) {
//## Lab 04 - Switch-case
//                ___
//
//                        Write a program using switch-case logic
//
//## Objective
//        Learn how to write a switch-case
//
//
//### 2. WAP to check that will take numbers between 1-12
//        //and print months name depends on number
//        //ex
//        //1 -- jan
//        //5 -- may
        int number=10;
        String  monthName ;

        switch (number) {
            case 1:
                monthName = "Jan";
                break;
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "May";
                break;
            case 9:
                monthName = "Sep";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "Aug";
                break;
            case 10:
                monthName = "Oct";
                break;
            case 11:
                monthName = "Now";
                break;
            case 12:
                monthName = "Dec";
                break;
            default:
                monthName = " Invalid number entered Please check number";
        }
        System.out.println(number + " -- " + monthName);

        }
}
