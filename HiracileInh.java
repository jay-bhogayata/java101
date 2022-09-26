class Animal
{
    void eat()
    {
        System.out.println("Eating...");
    }
}


class dog extends Animal
{
    void barking()
    {
        System.out.println("Bhow Bhow");
    }
}

class human extends Animal
{
    void speak()
    {
        System.out.println("Speking");
    }
}

public class HiracileInh
{
    public static void main(String args[])
    {
        human obj = new human();
        obj.speak();
        obj.eat();
    }
}