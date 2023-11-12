public class NumberformatException {
  public static void main(String[] args) {
    String i = "123.33";
         {
            try{
                int a = Integer.parseInt(i);
            } catch(NumberFormatException e)
            {
                System.out.println("Invalid String argument");
            }
         }
  }
}
      
    
    

