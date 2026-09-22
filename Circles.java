import java.util.Scanner;
public class Circles
{
    private double radius;

    private double height;
    
    
    Scanner circlesInput= new Scanner(System.in);
 /**
  * This is my first method. It finds the area of the circle using the formula A= PI*r^2
  */
    public double circle_Area()
    {
        System.out.println("Please input the radius of the circle");
        radius= circlesInput.nextDouble();

        return Math.PI*Math.pow(radius,2);
        
    }
/**
 * This is my second method for the circle class. It finds the area of the sphere by finding
 * the area of the base (circle area), and then multiplying it by the height.
 */

    public double sphere_Area()
    {
        System.out.println("Please input the radius of the base of the sphere");
        radius= circlesInput.nextDouble();
        System.out.println("Please input the height of the sphere");
        height= circlesInput.nextDouble();

        return Math.PI*radius*height;
    }


}

