public class ConsOver
{
    ConsOver(int l)
    {
        System.out.println(l*l*l);
    }
    ConsOver(int l , int b)
    {
        System.out.println(l*b);
    }
    ConsOver(int l , int b , int h)
    {
        System.out.println(l*b*h);
    }

    public static void main(String args[])
    {
        ConsOver one = new ConsOver(10);
        ConsOver two = new ConsOver(10,20);
        ConsOver three = new ConsOver(10,20,30);
    }
}