import java.util.*;
public class ATMInterface {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.select();
    }
    
}
class Customer
{
    public static void select()
    {
        int amount=1000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Select an Option:");
        System.out.println("1.DEPOSIT");
        System.out.println("2.WITHDRAW");
        System.out.println("3.CHECK BALANCE");
        int option=sc.nextInt();
        switch(option)
        {
            case 1:
               deposit(amount);
               break;
            case 2:
               withdraw(amount);
               break;
            case 3:
                checkBalance(amount);
                break;
            default:
                System.out.println("Please Enter Correct Input");

        }
    }
    
    public static void deposit(int amount)
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Amount You Want To Deposit:");
        int amt=sc.nextInt();
        amount=amt+amount;
        System.out.println("Amount Deposited Successfully...");
        System.out.println("Do You Want To Check Balance YES/NO :");
        String choice=sc1.nextLine();
        switch(choice)
        {
            case "YES":
            {
                checkBalance(amount);
                break;
            }
            case "NO":
            {
                System.out.println("THANK U FOR YOUR RESPONSE VISIT AGAIN...!");
                break;
            }
            default:
            System.out.println("Enter Correct Choice");

        }
    }
    public static void withdraw(int amount)
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Amount TO Withdraw:");
        int amt=sc.nextInt();
        if(amt>amount)
        {
            System.out.println("YOUR ACCOUNT HAS INSUFFICIENT BALANCE");
            System.out.println("Transaction Failed...!!!");
        }
        else{
        amount=amount-amt;
        System.out.println("Amount Withdrawn Successfully...");
        System.out.println("Do You Want To Check Balance YES/NO :");
        String choice=sc1.nextLine();
        switch(choice)
        {
            case "YES":
            {
                checkBalance(amount);
                break;
            }
            case "NO":
            {
                System.out.println("THANK U FOR YOUR RESPONSE VISIT AGAIN...!");
                break;
            }
            default:
            System.out.println("Enter Correct Choice");

        }
    }

    }
    public static void checkBalance(int amount)
    {
        System.out.println("YOUR ACCOUNT BALANCE IS: "+amount);
        System.out.println("THANK U FOR YOUR RESPONSE VISIT AGAIN...!");


    }

}
