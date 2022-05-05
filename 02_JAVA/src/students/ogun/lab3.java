package study;

public class lab3 {

    public static void main(String[] args) {


        int num = 100;
        System.out.print("DivisibelBy15");
        for (int i = 1; i < num; i++) {
            if ((i % 15 == 0) && (i % 5 == 0) && (i % 3 == 0)) {
                System.out.print("  " + i);
            }
        }
            System.out.print("\nDivisibelBy3");
        for (int i=1; i<num; i++){
            if ((i%3==0)&&(i%15!=0)){
                System.out.print("  "+i);
            }
        }
        System.out.print("\nDivisibelBy5");
        for (int i=1; i<num;i++){
            if ((i%5==0)&&(i%15!=0)){
                System.out.print("  "+i);
            }}}}