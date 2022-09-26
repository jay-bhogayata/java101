class main
{
    double Area(double r)
    {
        return 3.14*r*r;
    }

    int  Area(int l)
    {
        return l*l;
    }

    int Area(int l , int b)
    {
        return l*b;
    }
}

public class MethodOverloading
{
    public static void main(String args[])
    {
        main obj = new main();
        double a1 = obj.Area(3.14);
        int a2 = obj.Area(10);
        int a3 = obj.Area(10,20);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
    }
}