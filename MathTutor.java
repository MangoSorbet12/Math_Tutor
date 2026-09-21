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
    public static void main(String[] args) throws IOException
    {
        int checker;

        Scanner userInput= new Scanner(System.in);
        String reader="";

        System.out.println("Welcome to the Math Tutor Program! This program can solve 6 problems 
        total sorted into three types: circles, triangles, and lines; to choose your problem
        type, type in (lowercase for all 3 only ) \"c\", \"t\", or \"l\".");
        reader=userInput.nextLine();

        if(reader=="c");
        {
            System.out.println("The two problems in the circle class are 
            finding the area of a circle and area of a sphere; type in \"circle\" or \"sphere\"");
<<<<<<< HEAD
            userInput= input.nextLine();
            if(userInput=="circle")
=======
            circles circle_tutor= new circles();

            reader=userInput.nextLine();

            if(reader=="circle")
>>>>>>> 62d95f3 (made all 4 classes)
            {
              circle_tutor.circleArea();
            }
            else if(reader=="sphere")
            {
                circle_tutor.sphereArea();
            }
            else
            {
                errorLooper("\"sphere\"", "\"circle\"");
            }
        }
        else if(reader=="t")
        {
            System.out.println("The two types of problems in the triangles class are
                pythagorean theorem and area of a triangle: please type in \"pytha\" or \"area\" to proceed"); 
            reader=userInput.nextLine();

            Triangles tri_tutor= new Triangles();
            if(reader=="pytha")
            {
                tri_tutor.pythagorean_Theorem();
            }
            else if(reader=="area")
            {
                tri_tutor.tri_Area();
            }
            else
            {
                errorLooper("\"pytha\"","\"area\"");
            }
            
            userInput= input.nextLine();
            if(userInput=="pytha")
            {

            }
            else if(userInput=="area")
            {

            }
            else
            {
                System.out.println("Your input is not valid; please type in \"pytha\" or \"area\" ");
            }
        }
        else if(reader=="l")
        {
            System.out.println("The two types of problems in the lines class are find the slope
            of a line and the midpoint on a line; please type in \"slope\" or \"midpoint\"");

            reader=userInput.nextLine();

            lines line_tutor= new lines();

            if(reader=="slope")
            {
                line_tutor.slope();
            }
            else if(reader=="midpoint")
            {
                line_tutor.midpoint();
            }
            else
            {
                errorLooper("\"midpoint\"","\"slope\"");
            }

        }
        else
        {
          for(checker=1; checker>=1;)
            {
                if(userInput==choice1 || userInput==choice2 || userInput==choice3)
                {
                    checker=0;
                }
                else
                {
                    checker++;
                    errorMessage("\"c\", \"t\", or \"l\"");
                }
          
        }
    

        public void errorMessage(String message)
        {
            System.out.println("Please choose to type in "+message+" only, as
            your previous input was invalid");
            reader=userInput.nextLine();
        }

        public void errorLooper(String choice1, String choice2)
        {
            for(checker=1; checker>=1;)
            {
                if(userInput==choice1 || userInput==choice2)
                {
                    checker=0;
                }
                else
                {
                    checker++;
                    errorMessage(choice1+" or "+choice2);
                }
            }
        }
        

    }
}