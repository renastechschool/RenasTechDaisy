package code.studyhalls.st17_12_2021;

import java.util.Scanner;

public class ScannerSwitch {
    /*
    1) Write a user driven program(using switch-case) to calculate the areas of the following three shapes.
-Area of a rectangle is length*breadth. Enter length and breadth of a rectangle and print its area.
-Area of a square is its side*side (or side*side). Enter the side of a square through user and print its area.
-Area of a circle is π*r^2 (π*r*r)<==>(3.14*r*r). Where π=3.14 and r is the radius of the circle.
Enter the radius of a circle through user and print its area.
     */
    public static void main(String[] args) {
        System.out.println("**********AREA CALCULATOR**********");

        Scanner scan = new Scanner(System.in);
        System.out.println("1. Area of rectangle\n" +
                "2. Area of a square\n" +
                "3. Area of a circle");
        System.out.println("Choose an option number from above");
        byte option = scan.nextByte();
        switch (option) {
            case 1: //To find the area of a rectangle
                System.out.println("Enter the length and breadth of the rectangle:");
                double length = scan.nextDouble();
                double breadth = scan.nextDouble();
                System.out.println("Area of the rectangle : " + (length*breadth));
                break;

            case 2:  //To find the area of a square
                System.out.println("Enter the side of a square:");
                double side = scan.nextDouble();
                System.out.println("Area of the square : " + (side*side));
                break;

            case 3:// To find the area of a circle
                System.out.println("Enter the radius of the circle: ");
                double radius = scan.nextDouble();
                System.out.println("Area of the circle : " + (3.14*radius*radius));
                break;

            default:
                System.out.println("Invalid option! Please try again!");
                break ;
        }


        }
    }

