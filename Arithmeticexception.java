public class Arithmeticexception {
    public static void main(String args[]){
        try{
            int data=100/0;
            System.out.println("hello");
        }catch(ArithmeticException e)
        {
            System.out.println("hello");
        }
        finally
        {
            System.out.println("finally block");
        }
    }
}
