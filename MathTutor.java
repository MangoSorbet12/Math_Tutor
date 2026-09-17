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
        Scanner userInput= new Scanner(System.in);
        MathTutor tutor= new MathTutor();

        System.out.println("Welcome to the Math Tutor Program! This program can solve 6 problems 
        total sorted into three types: circles, triangles, and lines; to choose your problem
        type, type (lowercase for all 3) \"c\", \"t\", or \"l\".");
        userInput= input.nextLine();

        if(userInput=="c");
        {
            System.out.println("The two problems in the circle class are 
            finding the area of a circle and area of a sphere; type in \"circle\" or \"sphere\"");
            userInput= input.nextLine();
            if(userInput=="circle")
            {
              tutor.circleArea();
            }
            else if(userInput=="sphere")
            {
                tutor.sphereArea();
            }
        }
        else if(userInput=="t")
        {
            System.out.println("The two types of problems in the triangles class are
                pythagorean theorem and area of a triangle: please type in \"pytha\" or \"area\" to proceed"); 
            
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
        else if(userInput=="l")
        {
            System.out.println("The two types of problems in the lines class are find the slope
            of a line and the midpoint on a line; please type in \"slope\" or \"midpoint\"");
        }
        else
        {
          System.out.println("Please type in \"c\", \"t\", or \"l\", as your previous input
          was invalid");
          userInput= input.nextLine();
        }
        input.close();
    }
}