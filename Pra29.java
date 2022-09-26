abstract class bike
{
    abstract void run();
}

public class Pra29 extends bike
{
    public void run()
    {
        System.out.println("running .....");
    }

    public static void main(String args[])
    {
        Pra29 obj = new Pra29();
        obj.run();
    }
}