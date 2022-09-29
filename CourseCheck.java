package com.ThurstdayLabTest;
import java.util.Scanner;

public class CourseCheck {

    public static void main(String args[])
    {
        Scanner src = new Scanner(System.in);
        
        System.out.println("Enter no of course: ");
        int number = src.nextInt();
        
        if(number>0 && number<=20)
        {
            String[] course = new String[number+1];
        
            System.out.println("Enter course names:");
            for(int i=0; i<=number; i++)
            {
                course[i] = src.nextLine();
            }
        
            System.out.println("Enter the course to be searched: ");
            String searchitem = src.nextLine();
            
            int count = 0;
            
            for(int i=0;i<=number;i++)
            {
                if(course[i].equals(searchitem))
                {
                    count++;
                    break;
                }
            }
            if(count==1)
                System.out.println(searchitem + " course is available");
            else
                System.out.println(searchitem + " course is not available");
        }
        else
        {
            System.out.println("Invalid Range");
        }
    
}

}

