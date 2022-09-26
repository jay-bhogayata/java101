public class Largest
{
    public static void main(String args[])
    {
        int a = 100;
        int b = 11;
        int c = 12;

        if(a > b && a > c )
        {
            System.out.println(a+"is largest");
        }
        else if(b > a && b > c)
        {
            System.out.println(b+"is largest");
        }
        else
        {
            System.out.println(c+"is largest");
        }
    }
}