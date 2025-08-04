import java.util.*;
public class Calculator {
    public static double addition( double num1, double num2)
    {
        return num1+num2;
    }
    public static double subtraction( double num1, double num2)
    {
        return num1-num2;
    }
    public static double multiplication( double num1, double num2)
    {
        return num1*num2;
    }
    public static double division( double num1, double num2)
    {
        if(num2 ==0)
        {
            System.out.println("Error can divide by 0");
        }
        return num1/num2;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean continuee = true;
        while(continuee)
        {
            System.out.println("Operations In The Calculator....!!");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Choose from 1 to 5:");

            int choice = sc.nextInt();
            if(choice==5)
            {
                continuee = false;
                System.out.println("You Are Exiting The Calculator...Byeeee..!");
                break;
            }
            System.out.println("Enter the  first number:");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number:");
            double num2 = sc.nextDouble();

            double result=0;
            if(choice == 1)
            {
                result = addition(num1,num2);
                System.out.println("Result:" +result);
            }
            else if (choice == 2)
            {
            result = subtraction(num1,num2);
            System.out.println("Result:" +result);
            }
            else if (choice == 3)
            {
                result = multiplication(num1,num2);
                System.out.println("Result:" +result);
            }
            else if (choice == 4)
            {
                result = division(num1,num2);
                System.out.println("Result:" +result);
            }
            else
            {
                System.out.println("Invalid Choice,Please choose accordingly");
            }

        }
    }
}
