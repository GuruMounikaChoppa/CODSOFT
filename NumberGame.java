import java.util.*;
public class NumberGame
{
    public static void main(String args[])
    {
        System.out.println("Hello User...!");
        System.out.println("Welcome to Number Game...!!");
        System.out.println("Let's Start...!!!");
        Random r=new Random();
        int random_number=r.nextInt(100);
        int i=3,count=0;
        Game(random_number,i,count);
    }
    public static void Game(int random_number,int i,int count ) 
    {
        if(i<=0)
        {
           return;
        }
        if(count==3)
        {
            System.out.println("!!!...AMAZING...!!!");
            System.out.println("YOU WON 3 ROUNDS...");
            System.out.println("YOU GOT 300 POINTS..");
            return;
        }
        Scanner sc=new Scanner(System.in);
        int Guess_Number;
        System.out.println("Enter Your Guess Number:");
        Guess_Number=sc.nextInt();
        if(Guess_Number==random_number)
        {
            count++;
            if(count<3)
            {
            System.out.println("Great...!!!");
            System.out.println("YOU ARE CORRECT");
            System.out.println("WOW...!!! You Entered Into Next Round...");
            }
            Random r=new Random();
            int random_number1=r.nextInt(100);
            Game(random_number1,3,count);
            
        }
        else if(Guess_Number>random_number)
        {
            System.out.println("Sorry You're Guess is WRONG");
            if(i>1)
            {
                System.out.println("You're Guess Answer is Too High...");
                System.out.println("Don't Worry..!!!");
                System.out.println("You have "+ (i-1)+ " Chances left...");
            }
             i--;
             Game(random_number, i,count);
        }
        else
        {
            System.out.println("Sorry You're Guess is WRONG"); 
            if(i>1)
            {
                System.out.println("You're Guess Answer is Too Low...");
                System.out.println("Don't Worry..!!!");
                System.out.println("You have "+(i-1)+" Chances left...");
            }
            i--;
            Game(random_number, i,count);
        
        }
        if(i==0)
        {
            System.out.println("YOU LOST THE GAME...");
            System.out.println("Better Luck For Next Time...!!!");
        }
    }
    
}
        
    
