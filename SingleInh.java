class a
{
    void m1()
    {
        System.out.println("Hello");
    }

}

class b extends a
{
    void m2()
    {
        System.out.println("Namste");
    }
}

class c extends b
{
    void m3()
    {
        System.out.println("Bonjuor");
    }
}

public class SingleInh
{
    public static void main(String args[])
    {
        c obj = new c();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}