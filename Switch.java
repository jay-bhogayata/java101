import java.util.*;  
public class Switch
{
    public static void main(String args[])
    {
    
        System.out.println("Press 1  for Hello");
        System.out.println("Press 2  for Namste");
        System.out.println("Press 3  for Bonjour");


        System.out.println("Enter your choice : ");
        Scanner sc= new Scanner(System.in);


        int a = sc.nextInt();

        switch(a)
        {

        case 1:
            System.out.println("Hello");
            break;

        case 2:
            System.out.println("Nameste");
            break;
        case 3:
            System.out.println("Bonjour");
            break;
        default:
            System.out.println("Jayyy");
    
        }
    }
}