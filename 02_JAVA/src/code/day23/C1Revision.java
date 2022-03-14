package code.day23;

public class C1Revision {
    /*
    Challenge: Represent An Employee

    Create an Employee class
    Attributes: name, age, salary, location
    Behavior: raiseSalary
    Get creative! (Whether behavior has parameter or not. up to you!)
    As a part of this Challenge you'll have to determine Which numbers if any, should be static versus non-static

 Create a Main class for building Employee instances
• Build two Employee instances
• Give one Employee a raise
• Display the salaries of both Employees
     */
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom", (byte)25, 65000, "NYC") ;
        Employee e2 = new Employee("Jerry", (byte)23, 60000, "Austin") ;
        e2.raiseSalary(1.2);

        System.out.println("NAME:"+e1.getName() + "\nAGE:"+e1.getAge()+ "\nSALARY:"+e1.getSalary()
        +"\nLOCATION:"+e1.getLocation());

        System.out.println("NAME:"+e2.getName() + "\nAGE:"+e2.getAge()+ "\nSALARY:"+e2.getSalary()
               + "\nLOCATION:"+e2.getLocation());
    }
}

class Employee{
    private String name;
    private byte age;   private double salary; private String location ;

    public Employee(String name, byte age, double salary, String location){
        this.name = name;
        this.age = age;
        this.salary = salary  ;
        this.location = location ;
    }

    void raiseSalary(double raise_percent){
        this.salary = this.salary + (raise_percent / 100 * this.salary) ;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }





}
