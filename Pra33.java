public class Pra33 extends Thread
{
    public void run()
    {
        System.out.println("Thraed is running......");
    }

    public static void main(String args[])
    {
        Pra33 t1 = new Pra33();
        t1.start();
    }
}