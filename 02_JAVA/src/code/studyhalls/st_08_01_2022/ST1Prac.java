package code.studyhalls.st_08_01_2022;

public class ST1Prac {

    public static void main(String[] args) {

        Apple myApple = new Apple() ;
        System.out.println(myApple.price);//0
        System.out.println(myApple.getPrice());//0
        myApple.setPrice(12);
        System.out.println(myApple.getPrice());

    }
}

//a class is the blueprint or template for the object.
//Think of the class like a cookie cutter or the drawing of the building
class Apple{
    //state or properties or instance variable
    int price ;

    //to access the state or properties of the object we use behaviour or functionalities or methods
    //Apple class has two instance methods or baviour or instance member functions
    //getPrice
    int getPrice( ){ return this.price;   }

    //setPrice
    void setPrice(int price ){ this.price = price ;   }

}