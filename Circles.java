import java.util.Scanner;
public class circles
{
    private double radius;
    private boolean isPositive;
    private double height;
    
    Scanner input= new Scanner(System.in);
 
    public double circle_Area()
    {
        System.out.println("Please input the radius of the circle");
        radius= input.nextDouble();
        return Math.PI*radius;
    }

    public double sphere_Area()
    {
        System.out.println("Please input the radius of the base of the sphere");
        radius= input.nextDouble();
        System.out.println("Please input the height of the sphere");
        height= input.nextDouble();
        return Math.PI*radius*height;
    }
}

