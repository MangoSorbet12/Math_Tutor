import java.util.Scanner;

public class Triangles  
{
    private double base;
    private double height;

    private double side1;
    private double side2;

    Scanner tri_Input= new Scanner(System.in);
    /**
     * This is the first method for the Triangles class. It's for solving the area of a triangle.
     * The formula is (b*h)/2.
     */
    public double tri_Area()
    {
        System.out.println("Please input the base of the triangle");
        base= tri_Input.nextDouble();
        System.out.println("Please input the height of the triangle");
        height= tri_Input.nextDouble();


        return (base*height)/2;
       
    }

    /**
     * This is the second method for the Triangles class. It's for Pythagorean Theorem.
     * This one is only for finding the hypotenuse, not the 2 shorter sides.
     */
    public double pythagorean_Theorem()
    {
        System.out.println("Please note that this method is only meant to compute the longest side of the triangle, or the hypotenuse, meaning the two shortest sides must be given as input");

        System.out.println("Please input the first side");
        side1= tri_Input.nextDouble();
        System.out.println("Please input the second side");
        side2= tri_Input.nextDouble();


        return Math.sqrt(Math.pow(side1,2)+ Math.pow(side2,2));

    }
}