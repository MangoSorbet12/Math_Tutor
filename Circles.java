import java.util.Scanner;
public class Circles
{
    private double radius;

    private double height;
    
    
    Scanner circlesInput= new Scanner(System.in);
 
    public double circle_Area()
    {
        System.out.println("Please input the radius of the circle");
        radius= circlesInput.nextDouble();

        return Math.PI*Math.pow(radius,2);
        
    }

    public double sphere_Area()
    {
        System.out.println("Please input the radius of the base of the sphere");
        radius= circlesInput.nextDouble();
        System.out.println("Please input the height of the sphere");
        height= circlesInput.nextDouble();

        return Math.PI*radius*height;
    }


}

