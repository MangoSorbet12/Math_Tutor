import java.util.Scanner;
public class Lines
{
    //these 4 variables are for the slope() method
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    //these 2 variables are for the midpoint() method
    private double coordinate_x1;
    private double coordinate_x2;
    private double coordinate_y1;
    private double coordinate_y2;

    Scanner linesInput= new Scanner(System.in);

    /**
     * This is my first method of the Lines class. It finds the slope by averaging 2 coordinates.
     */
    public double slope()
    {
        System.out.println("Please input the x coordinate of your first coordinate set");
        x1= linesInput.nextDouble();
        System.out.println("Please input the y coordinate of your first coordinate set");
        y1= linesInput.nextDouble();

        System.out.println("Please input the x coordinate of the second coordinate set");
        x2= linesInput.nextDouble();
        System.out.println("Please input the y coordinate of the second coordinate set");
        y2= linesInput.nextDouble();


        
        double result= (y2-y1)/(x2-x1);
        return result;

    }

    /**
     * This is the second method of the Lines class. 
     * It finds the midpoint of a line by averaging the two x coordinates.
     * Then it averages the two y coordinates, so the midpoint coordinate is found
     */
    public void midpoint()
    {
        System.out.println("Please type in your first coordinate");
        coordinate_x1= linesInput.nextDouble();
        System.out.println("Please type in your second coordinate");
        coordinate_x2= linesInput.nextDouble();
        
        System.out.println("Please type in the first y-coordinate");
        coordinate_y1= linesInput.nextDouble();
        System.out.println("Please type in the second y-coordinate");
        coordinate_y2= linesInput.nextDouble();

        double xResult= (coordinate_x1+coordinate_x2)/2;
        double yResult= (coordinate_y1+coordinate_y2)/2;

        System.out.println("The midpoint of the line is ("+xResult+","+yResult+")");

        
    }

}