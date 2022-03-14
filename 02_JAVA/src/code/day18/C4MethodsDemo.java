package code.day18;

public class C4MethodsDemo {

    //public and static are modifiers
    //public : access modifier
    //static : non-access modifier
    //void: return type
    //main: name of the method
    //String[] : argument type or parameter type ; args is a variable of String[] type
    //{} : body of the method or method definition
    public static void main(String[] args) { }

    //a method can be declaring a method
    //below method only have return type and method name
    void display(){
        return ; //returning statememt without a  returning value -> OPTIONAL
    }


    //modifier is static, return type is int, method name is getSalary
    //one int parameter
    static int getSalary(int days_worked){
        return 100000000;//returning statement
    }


}
