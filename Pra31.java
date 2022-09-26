class a
{
    String color = "white";
}

class b extends a
{
    String color = "black";

    public void show()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}

class Pra31 extends b
{
    public static void main (String args[])
    {
        b obj = new b();
        obj.show();
    }
}