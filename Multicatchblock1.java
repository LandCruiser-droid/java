public class Multicatchblock1 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("arithmetic exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException f)
        {
            System.out.println("ArrayIndexBoundsException occurs");
        }
        catch(Exception h)
        {
            System.out.println("super class exception occurs");
        }
        System.out.println("last statement executed");
    }
    
}
