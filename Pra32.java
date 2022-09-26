public class Pra32
{
  public static void main(String args[])
  {
    try
    {
      int a = 5 / 0;
      System.out.println("arthjkd");
    }
    catch(ArithmeticException e)
    {
      System.out.println("exception : " + e.getMessage());
    }
  }
}