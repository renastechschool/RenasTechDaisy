package code.day8;

public class C2Revision {
    /*
    Salary$					    Designation
	<1000					     Not an employee
	>=1000 and <=10000			Software Tester
	>10000 and <=25000			Software Developer
	>25000 and <=50000			Project manager
	>50000 and <=100000		    Team Leader
	else					    HR Manager
     */

    public static void main(String[]ao){
        int sal = 50000;
        if(sal<1000)  System.out.println("Not an employee");

        else if(sal>=1000 && sal<=10000) System.out.println("Software Tester");

        else if(sal>10000 && sal<=25000) System.out.println("Software Developer");

        else if(sal>25000 && sal<=50000)    System.out.println("Project Manager");

        else if(sal>50000 && sal<=100000)    System.out.println("Team Leader");
        else System.out.println("HR Manager");
    }
}
