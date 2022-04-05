package students.Yasemin;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Answer 1: ");
        System.out.println("1. Area of a rectangle \n" + "2. Area of a square \n" + "3. Area of a circle");

        System.out.println("Choose an option number from above  ");
        byte option = scan.nextByte();
        switch (option) {

            case 1:
                System.out.println("Enter length and breadth of a rectangle ");
                double length = scan.nextDouble();
                double breadth = scan.nextDouble();
                System.out.println("Area of a rectangle is : " + length * breadth);
                break;

            case 2:
                System.out.println("Enter the side of a square ");
                double side = scan.nextDouble();
                System.out.println("Area of a square is :" + side * side);
                break;

            case 3:
                System.out.println("Enter the radius of a circle ");
                double radius = scan.nextDouble();
                double π = 3.14;
                System.out.println("Area of a circle is : " + (π * radius * radius));

                break;
        }
        System.out.println(" =======================");

        System.out.println("Write your Georgian grades");
        double Georgian = scan.nextDouble();

        System.out.println("Write your English grades");
        double English = scan.nextDouble();

        System.out.println("Write your Maths grades");
        double Maths = scan.nextDouble();

        System.out.println("Write your Science grades");
        double Science = scan.nextDouble();

        System.out.println("Write your Computer grades");
        double Computer = scan.nextDouble();

        double percentage = (((Georgian + English + Maths + Science + Computer) / 500) * 100);

        System.out.println("Average is =" + percentage);


        String result = (percentage < 40 ? "fail" : percentage >= 40 && percentage < 50 ? "Third"
                : percentage >= 50 && percentage < 60 ? "second"
                : percentage >= 60 && percentage < 75 ? " first" : "FIRST WITH DISTINCTION");
        System.out.println("Result =" + result);

        System.out.println("====================================================");


        System.out.println("Answer 3.  ");

        System.out.println("Enter km  ");
        int km = scan.nextInt();
        int m = km * 1000;
        int cm = m * 100;
        double ft = m * 3.3;
        double in = ft * 12;

        System.out.println(km + " km " + ", " + m + "m " + " ," + " " + cm + "cm " + " ," + " " + ft + "ft " +
                " ," + " " + in + " int");

        System.out.println("=============================================================================");

        System.out.println("Answer 4. ");

        System.out.println(" Enter a number");

        StringBuilder number = new StringBuilder(scan.next());

        System.out.println("Reverse number " + number.reverse());


        System.out.println("Answer 5 palindrome");
        System.out.println(number);

        System.out.println(number.reverse());

        String res = (number != number.reverse() ? "no palindrome" : " palindrome ");
        System.out.println(res);


        System.out.println("6) WAP to enter two numbers and swap them using a third variable and print them");


        int temp;
        Scanner No = new Scanner(System.in);
        System.out.println("Enter first number ");
        int firstnumber = No.nextInt();

        System.out.println("Enter second number");
        int secondnumber = No.nextInt();

        System.out.println("before swap first number :" + firstnumber + " " + " before swap second number : " + secondnumber);

        temp = firstnumber;
        firstnumber = secondnumber;
        secondnumber = temp;


        System.out.println("after swap first number :" + firstnumber + " " + " after swap second number : " + secondnumber);


        System.out.println("7 WAP to enter a number and swap and print them without using a third variable.");

        Scanner Ze = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = Ze.nextInt();

        System.out.println("Enter second number");
        int b = Ze.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swap first number :" + a + " " + " after swap second number : " + b);


        System.out.println("8)WAP to enter a number and check if its an even number or an odd number");

        System.out.println("enter a number ");

        int k = scan.nextInt();

        if (k % 2 == 0) {
            System.out.println("k is even number");
        } else System.out.println("k is odd number ");

        System.out.println("9) WAP to enter any year from the user and check if it's a leap year or not.");

        System.out.println("Enter a year");
        int year = scan.nextInt();

        if (year % 100 == 0 && year % 400 == 0 || year % 2 == 0) {
            System.out.println(" This year leap year");

        } else System.out.println("This year is not leap year");


        System.out.println("10) WAP to enter three numbers from the keyboard and print the smallest and largest of those numbers.");

        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("\n The Smallest number is: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("\n The Smallest number is: " + num2);
        } else {
            System.out.println("\n The Smallest number is: " + num3);
        }
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("\n The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("\n The largest number is: " + num2);
        } else {
            System.out.println("\n The largest number is: " + num3);
        }

        System.out.println("11) WAP to enter marks in 5 subjects out of 100. If marks in" +
                "any subject is less than 33 then it's a failure. Your program should output the no. " +
                "of subjects the person is failing in else it should print PASS");

        System.out.println("enter marks in 5 subjects out of 100 ");
        int mark1 = scan.nextInt();
        int mark2 = scan.nextInt();
        int mark3 = scan.nextInt();
        int mark4 = scan.nextInt();
        int mark5 = scan.nextInt();


        if (mark1 <33 ){
            System.out.println("MARK1 NO");
        }else System.out.println("MARK2 PASS");

        if (mark2 <33 ){
            System.out.println("MARK2 NO");
        }else System.out.println("MARK2 PASS");

        if (mark3 <33 ){
            System.out.println("MARK3 NO");
        }else System.out.println("MARK3 PASS");

        if (mark4 <33 ){
            System.out.println("MARK4 NO");
        }else System.out.println("MARK4 PASS");

        if (mark5 <33 ){
            System.out.println("MARK5 NO");
        }else System.out.println("MARK5 PASS");

    }


}
