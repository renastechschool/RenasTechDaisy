package code.codereview.CodeReview2ndFeb;
public class SingletonDemo {
    public static void main(String[] args) {
       // new Car() ; error : the constructor is private
        //System.out.println(Car.myCar); error: myCar has private access
        Car c = Car.getCar() ;
        System.out.println(c);
        Car c2 = Car.getCar() ;
        System.out.println(c);
    }
}

//If we want a class should only have one single object during the lifetime
//of an application, then we use an industry practice(a design pattern) called
//Singleton.
/*
Using Singleton pattern we ensure that a class only has one single instance.
This is achieved by making:
- a private constructor; so that the class cannot be instantiated outside its code
- one single private static instance of that class; its private so that it cannot be changed or dereference outside its class
- a public getter method of the above instance
 */
class Car{

    private static Car myCar = new Car();
    private Car(){ }

    public static Car getCar(){   return myCar ;  }

}
