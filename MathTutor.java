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
        //Errors error= new Errors();

        Scanner userInput= new Scanner(System.in);

        // all of these are for storing the Scanner's info
        int reader;
        int circleReader=0;
        int triReader=0;
        int lineReader=0;
        int restart=0;

    //This loop is for restarting the program without re-running the program    
    for(var i=1; i>=1;) 
    {    
        System.out.println("Welcome to the Math Tutor Program! This program can solve 6 problems total sorted into three types: circles (1), triangles (2), and lines (3); to choose your problem type, type in 1, 2, or 3.");
        reader=userInput.nextInt();
        //This first big if statement is for the circle class problems
        if(reader==1)
        {
            System.out.println("The two problems in the circle class are finding the area of a circle (1) and area of a cylinder (2); type in 1 or 2");
            Circles circle_tutor= new Circles();
            

            circleReader=userInput.nextInt();
            //each nested conditional statement is for a method (also prompts user to restart program)
            //this one is for area of a circle
            if(circleReader==1)
            {
              System.out.println("The area of the circle is "+circle_tutor.circle_Area());
              System.out.println("Would you like to solve for another problem? Yes is 1, no is 2.");
              restart= userInput.nextInt();

              //this is for restarting the program; it's in every mini conditional btw
              if(restart==1)
              {
                i++;
              }
              else
              {
                i=0;
                
              }
              
            }
            //this is area of a cylinder
            else if(circleReader==2)
            {
                System.out.println("The area of the cylinder is "+circle_tutor.cylinder_Area());
                System.out.println("Would you like to solve for another problem? Yes is 1, no is 2.");
              restart= userInput.nextInt();

              if(restart==1)
              {
                i++;
              }
              else
              {
                i=0;
                
              }
              
            
            }
        
        }
        
        //this conditional is for the triangle class problems
        if(reader==2)
        {
            System.out.println("The two types of problems in the triangles class are pythagorean theorem (1) and area of a triangle (2): please type in 1 or 2 to proceed"); 
            triReader=userInput.nextInt();
            

            Triangles tri_tutor= new Triangles();
            if(triReader==1)
            {
                System.out.println("The hypotenuse of the triangle is "+tri_tutor.pythagorean_Theorem());
                System.out.println("Would you like to solve for another problem? Yes is 1, no is 2.");
              restart= userInput.nextInt();
              if(restart==1)
              {
                i++;
              }
              else
              {
                i=0;
                
              }
              
                
            }
            else if(triReader==2)
            {
                System.out.println("The area of the triangle is "+tri_tutor.tri_Area());
                System.out.println("Would you like to solve for another problem? Yes is 1, no is 2.");
              restart= userInput.nextInt();
              if(restart==1)
              {
                i++;
              }
              else
              {
                i=0;
                userInput.close();
              }
              
                
            }
            
            
        }

        //this conditional is for the lines class problems.
        if(reader==3)
        {
            System.out.println("The two types of problems in the lines class are find the slope of a line (1) and midpoint of a line (2). Please type in 1 or 2");

            lineReader=userInput.nextInt();

            Lines line_tutor= new Lines();
       
            if(lineReader==1)
            {
                System.out.println("The slope of the line is "+line_tutor.slope());
                System.out.println("Would you like to solve for another problem? Yes is 1, no is 2.");
              restart= userInput.nextInt();
              if(restart==1)
              {
                i++;
              }
              else
              {
                i=0;
                
              }
              
                
            }
            else if(lineReader==2)
            {
                line_tutor.midpoint();
                
                System.out.println("Would you like to solve for another problem? Yes is 1, no is 2.");
              restart= userInput.nextInt();
              if(restart==1)
              {
                i++;
              }
              else
              {
                i=0;
                
              }
              
                
            }
          

        }
        
    }   //closes the Scanner once user chooses to end the program
         userInput.close(); 
  
    }
}