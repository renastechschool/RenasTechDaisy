package students.Yasemin;

public class Lab14 {
    public static void main(String[] args) {
        Person ps = new Person("Yasemin");
        System.out.println(ps.getName());
        Employee emp = new Employee(6000,2021,"13456793212","Yasemin");
        System.out.println(emp);
    }
}
class Person{
    private String name;
    Person(String name ){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
class Employee extends Person{
    double annualSalary;
    int startDate;
    String sinNumber;

    Employee(double annualSalary,int startDate, String sinNumber,String name){
        super(name);
        this.annualSalary = annualSalary;
        this.startDate = startDate;
        this.sinNumber = sinNumber;
    }
    public double getSalary(){
        return this.annualSalary;
    }
    public int getStartDate() {
        return startDate;
    }
    public String getSinNumber() {
        return sinNumber;
    }
    public String toString(){
        return "Name " + getName() + " Salary " + getSalary() + " StartDate " + getStartDate() +
                " SinNumber " +  getSinNumber();
    }
}

