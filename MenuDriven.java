import java.util.*;

public class MenuDriven
{
    public static void main(String args[])
    {

        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Sub");
        System.out.println("Press 3 for Mul");
        System.out.println("Press 4 for Div");
        System.out.println("Press 5 for Modulo");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        switch(choice)
        {
            case 1:
                int n1,n2;
                System.out.println("Enter n1 : ");
                n1 = sc.nextInt();
                System.out.println("Enter n2 : ");
                n2 = sc.nextInt();
                System.out.println("Sum is"+ (n1+n2));
                break;

            case 2:
                int n3,n4;
                System.out.println("Enter n1 : ");
                n3 = sc.nextInt();
                System.out.println("Enter n2 : ");
                n4 = sc.nextInt();
                System.out.println("Sub is"+ (n3-n4));
                break;

            default:
                System.out.println("wrong choice");
                
        }
    
    }
}