package students.Yasemin;

public class Lab04 {
    public static void main(String[] args) {

        System.out.println(" Question 1 ");
        System.out.println("************");
        int number = 5;
        if (number>=0) System.out.println("Number is positive ");
        else if (number<= 0) System.out.println("Number is negative");

        System.out.println(" Question 2 ");
        System.out.println("************");
        int n = 3;
        if (n % 2 == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");


        System.out.println(" Question 3 ");
        System.out.println("************");
        int marks = 75;
        {
            if (marks < 40) System.out.println("Grade = " + "E");
            if (marks >= 40 && marks < 60) System.out.println("Grade = " + "D");
            if (marks >= 60 && marks < 75) System.out.println("Grade = " + "C");
            if (marks >= 75 && marks < 90) System.out.println("Grade = " + "B");
            if (marks >= 90 && marks < 100) System.out.println("Grade = " + "A");
            if (marks == 100) System.out.println("Grade = " + "O");
        }

        System.out.println(" Question 4 ");
        System.out.println("************");
        int salary = 50000;
        if (salary < 1000) System.out.println("Unemployed");
        if (salary >= 1000 && salary <= 10000) System.out.println("Software Tester");
        if (salary <= 10000 && salary <= 25000) System.out.println("Software Developer");
        if (salary >= 25000 && salary <= 50000) System.out.println("Project Manager");
        if (salary >= 50000 && salary <= 100000) System.out.println("Team Leader");
        else if (salary > 100000) System.out.println("HR Manager");
    }
}

