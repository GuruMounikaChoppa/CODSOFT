import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        int sub1=takeInput("Enter Your Marks Out Of 100 In MATHS:");
        int sub2=takeInput("Enter Your Marks Out Of 100 In C LANGUAGE:");
        int sub3=takeInput("Enter Your Marks In Out Of 100 C++ LANGUAGE:");
        int sub4=takeInput("Enter Your Marks In Out Of 100 JAVA LANGUAGE:");
        int sub5=takeInput("Enter Your Marks In Out Of 100 PYTHON LANGUAGE:");
        int sub6=takeInput("Enter Your Marks In Out Of 100 SOFTWARE ENGINEERING:");
        int Total_Marks=(sub1+sub2+sub3+sub4+sub5+sub6);
        float Average_Percentage=(Total_Marks/6);
        char Grade=Grade_Calculation(Average_Percentage);
        System.out.println("Total Marks of the Student: "+Total_Marks);
        System.out.println("Average Percentage of the Student: "+Average_Percentage);
        System.out.println("Grade of the Student: "+ Grade);
    }
    public static int takeInput(String s)
    {
        System.out.println(s);
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>100)
        {
            System.out.println("Enter Valid Input...!!!");
        }
        return marks;
    }
    public static char Grade_Calculation(float Average_Percentage)
    {
        char grade='\0';
        if(Average_Percentage>=90)
        {
            grade='A';
        }
        else if(Average_Percentage>=70 && Average_Percentage<90)
        {
            grade= 'B';
        }
        else if(Average_Percentage>=55 && Average_Percentage<70)
        {
            grade= 'C';
        }
        else if(Average_Percentage>=35 && Average_Percentage<55)
        {
            grade= 'D';
        }
        else
        {
            grade='F';
        }
        return grade;
    }
    
}
