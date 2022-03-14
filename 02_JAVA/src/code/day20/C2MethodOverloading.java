package code.day20;

public class C2MethodOverloading {
    //technically we can overload main method
    //but to be able to run other main methods
    //we will need to call them in String [] main method

    public static void main(String[] args) {
        System.out.println("String Main");

        int [] numbers ={1,2,3,4};
        main(numbers);
    }

    public static void main(double [] args){
        System.out.println("Double main");
    }

    public static void main(int [] args){
        //main(new double[]{1.2, 2.3, 6.5 });
        System.out.println("Int main");
    }
}
