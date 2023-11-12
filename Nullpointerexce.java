public class Nullpointerexce {
    public static void main(String[] args) {
        String s = null;
        try{
            if(s.equals("hello"))
            System.out.println("a");
            else
            System.out.println("sasikiran");
        } catch(NullPointerException e)
        {
            System.out.println("m");
        }
        finally{
            System.out.println("mg");
        }
    }
}
