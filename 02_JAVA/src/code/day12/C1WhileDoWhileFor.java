package code.day12;

class C1WhileDoWhileFor {

    public static void main(String[] args) {

        System.out.println("Using while loop");
        int j= 1;
        while(j<=5){
            System.out.println(j++);
        }

        System.out.println("\nusing for loop");
        for(int i=1; i<=5;  ){
            System.out.println(i++);
        }

        System.out.println("\nusing do while loop");
        int k=1;
        do{
            System.out.println(k++);
        }while(k<=5);

    }
}
