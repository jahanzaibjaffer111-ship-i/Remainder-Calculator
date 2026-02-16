import java.util.Scanner;
public class Remainder_calculator
{
    public static void main(String[] args)
    {
        try (Scanner read = new Scanner(System.in)) 
        {
            System.out.println("Hello");
            System.out.println("Welcome to the Remainder Calculator");
            System.out.println();
            while(true)
            {
                System.out.println("Type Divident");
                double a=read.nextDouble();
                read.nextLine();
                System.out.println();
                if(a>0)
                {
                    System.out.println("Type Divisor");
                    double b=read.nextDouble();
                    read.nextLine();
                    System.out.println();
                    if(b<=a)
                    {
                        if(b==0)
                        {
                            System.out.println("Divisor can't be Zero");
                            System.out.println("Try again");
                            System.out.println();
                        }
                        else if(b<0)
                        {
                            System.out.println("Divisor can't be Negative");
                            System.out.println("Try again");
                            System.out.println();
                        }
                        else if(b>0)
                        {
                            double c=(a%b);
                            System.out.println( "   ______");
                            System.out.println(b+")"+ a  +"(");
                            System.out.println("X(Remainder)= "+c);
                            System.out.println();
                        }
                    }
                    else if (b>=a)
                    {
                        System.out.println("Divisor must be smaller than than or equal to divident");
                        System.out.println("Try again");
                        System.out.println();
                    }
                }
                else if (a==0)
                {
                    System.out.println("Divident can't be Zero");
                    System.out.println("Try again");
                    System.out.println();
                }
                else if (a<0)
                {
                    System.out.println("Divident can't be Negative");
                    System.out.println("Try again");
                    System.out.println();
                }
                System.out.println("Do you want to leave Remainder Calculator then Type exit");
                System.out.println("If you want to Continue then Type anything to Restart");
                String ans=read.nextLine();
                System.out.println();
                if(ans.equalsIgnoreCase("exit"))
                {
                    break;
                }
            }
        }
    }
}