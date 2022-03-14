package code.day30Exceptions;

public class C8Multicatch {
        public static void main(String[] args) {

            try {
                System.out.println(10/0);//ArithmeticException // uncheked
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("array excep");
            }
            catch (ArithmeticException e){
                System.out.println("arithmetic exccep");
            }
            catch (RuntimeException e){
                System.out.println("runtime");
            }
            catch (Exception e){
                System.out.println("exception");
            }

            //to be able to catch exception you need use same level exception or parents of exceptions
            //for ex : handling arithmetic exceptions will be handled with arithmetic,runtime,exception

            //in multi catch as soon as a block catches the exception it won't check other catch blocks


        }
}
