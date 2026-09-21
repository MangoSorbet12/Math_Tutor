import java.util.Scanner;
public class circles
{
    private double radius;

    private double height;
    
    private int counter;
    
    Scanner circlesInput= new Scanner(System.in);
 
    public double circle_Area()
    {
        System.out.println("Please input the radius of the circle");
        radius= circlesInput.nextDouble();
        
        for(counter=1; counter>=1;)
        {
            negativeNum(radius);
        }
        
    }

    public double sphere_Area()
    {
        System.out.println("Please input the radius of the base of the sphere");
        radius= circlesInput.nextDouble();
        System.out.println("Please input the height of the sphere");
        height= circlesInput.nextDouble();
        return Math.PI*radius*height;
    }

    public void negativeNum(double value)
    {
        if(value>0)
        {
            counter=0;

        }
        else
        {
            counter++;

            System.out.println("Please input your value again; it seems like you put in a negative number or zero");
            value=circlesInput.nextDouble();
            
        }
    }
}

