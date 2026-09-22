/*
* Build A Math Tutor
* Grace Han
* To be able to make a simple tutoring tool that can solve multiples types of math problems
*
* 
*
 */
import java.util.Scanner;

public class MathTutor
{
    public static void main(String[] args)
    {
        Errors error= new Errors();

        Scanner userInput= new Scanner(System.in);
        int reader;
        int circleReader=0;
        int triReader=0;
        int lineReader=0;
    

        System.out.println("Welcome to the Math Tutor Program! This program can solve 6 problems total sorted into three types: circles (1), triangles (2), and lines (3); to choose your problem type, type in 1, 2, or 3.");
        reader=userInput.nextInt();
    for(var i=1; i>=1;) 
    {    
        if(reader==1)
        {
            System.out.println("The two problems in the circle class are finding the area of a circle (1) and area of a sphere (2); type in 1 or 2");
            Circles circle_tutor= new Circles();
            i=0;

            circleReader=userInput.nextInt();

            if(circleReader==1)
            {
              System.out.println("The area of the circle is "+circle_tutor.circle_Area());
              
            }
            else if(circleReader==2)
            {
                System.out.println("The area of the sphere is "+circle_tutor.sphere_Area());
            
            }
            else
            {
                error.errorLooper();
            }
        }
        

        if(reader==2)
        {
            System.out.println("The two types of problems in the triangles class are pythagorean theorem (1) and area of a triangle (2): please type in 1 or 2 to proceed"); 
            triReader=userInput.nextInt();
            i=0;

            Triangles tri_tutor= new Triangles();
            if(triReader==1)
            {
                System.out.println("The hypotenuse of the triangle is "+tri_tutor.pythagorean_Theorem());
                
            }
            else if(triReader==2)
            {
                System.out.println("The area of the triangle is "+tri_tutor.tri_Area());
                
            }
            else
            {
                error.errorLooper();
            }
            
        }
        if(reader==3)
        {
            System.out.println("The two types of problems in the lines class are find the slope of a line (1) and midpoint of a line (2). Please type in 1 or 2");

            lineReader=userInput.nextInt();
            i=0;

            Lines line_tutor= new Lines();
        for(var l=1; l>=1;)
         {
            if(lineReader==1)
            {
                System.out.println("The slope of the line is "+line_tutor.slope());
                l=0;
                
            }
            else if(lineReader==2)
            {
                System.out.println("The midpoint of the line is "+line_tutor.midpoint());
                l=0;
                
            }
            else
            {
                error.errorLooper();
                l++;
            }
         }

        }
        else
        {
            i++;
        }
    }    
        // else
        // {
        //   for(int checker1=1; checker1>=1;)
        //     {
        //         if(reader==1 || reader==2 || reader==3)
        //         {
        //             checker1=0;
        //         }
        //         else
        //         {
        //             checker1++;
        //             System.out.println("Please type in 1,2,or 3 only to choose between the three different types of problems");
        //             reader= userInput.nextInt();
        //         }
          
        //     }
        // }
    
        userInput.close();
    }
}