interface pritable
{
    void print();
}

class Pra30 implements pritable
{
    public void print()
    {
        System.out.println("Printing");

    }

    public static void main(String args[])
    {
        Pra30 obj = new Pra30();
        obj.print();
    }
}