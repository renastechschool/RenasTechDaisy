package students.Yasemin;

public class Lab13 {
    public static void main(String[] args) {
        Student stud= new Student();
        stud.setStudDetails(123123,"Nur",60,85,100);
        stud.calculateTotal();
        System.out.println(stud);
        //---------------------------------------------------------------------------------------------//

        Account ac = new Account();
        ac.setAccountDetails(34241713,"PrivateAccount",60000);
        ac.withdraw(25000);
        ac.deposit(700);
        System.out.println(ac);

        //---------------------------------------------------------------------------------------------//
        Rectangle rec = new Rectangle(15,10);
        System.out.println(rec);
        //---------------------------------------------------------------------------------------------//
        Customer cus = new Customer("5223153","Yasemin","USA");
        cus.display();
    }
}
class Student{

    private int rollNumber;
    private String studNumber;
    private int mark1,mark2,mark3;
    private int totalMarks;

    public void setStudDetails(int rollNumber,String studNumber,int mark1,int mark2,int mark3){
        this.rollNumber=rollNumber;
        this.studNumber=studNumber;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    public void  calculateTotal(){
        totalMarks = mark3 + mark2 + mark1;
    }

    public String toString(){
        return "rollNumber : " + rollNumber + " StudName : " + studNumber + " TotalMarks : " + totalMarks;
    }
}

class Account{
    private int accountNo;
    private String accountType;
    private int accountBalance;
    void setAccountDetails(int accountNo, String accountType,int accountBalance){
        this.accountNo=accountNo;
        this.accountType = accountType;
        this.accountBalance=accountBalance;
    }
    int withdraw(int amount){
        accountBalance=accountBalance-amount;
        return accountBalance;
    }
    int deposit(int amount){
        accountBalance=accountBalance+amount;
        return accountBalance;
    }

    public String toString(){
        return "AccountNo : " + accountNo + " accountType : " + " Account Balance : " + accountBalance;
    }
}

class Rectangle {
    private int lenght, breadth;
    Rectangle(int lenght,int breadth){
        this.lenght=lenght;
        this.breadth=breadth;
    }
    public int area(){
        return lenght*breadth;
    }

    public String toString(){
        return "Area is " + area();
    }
}

class Customer{
    String custId;
    String custName;
    String custAddress;

    Customer(String custId, String custName, String custAddress){
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    public void display(){
        System.out.println(custId + " " + custName + " " + custAddress);
    }

}

