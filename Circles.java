import java.util.Scanner;
public class Circles
{
    private double radius;

    private double height;
    
    //private int counter;
    
    Scanner circlesInput= new Scanner(System.in);
 
    public double circle_Area()
    {
        System.out.println("Please input the radius of the circle");
        radius= circlesInput.nextDouble();
      /**  
        for(counter=1; counter>=1;)
        {
            if(radius>0)
            {
                counter=0;
             return Math.pow(radius,2)*Math.PI;
            }
            else
            {
            counter++;

            System.out.println("Please input your value again; it seems like you put in a negative number or zero");
            radius=circlesInput.nextDouble();
            
            }
        }
      **/
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

