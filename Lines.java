import java.util.Scanner;
public class lines
{
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private String coordinate1;
    private String coordinate2;

    Scanner linesInput= new Scanner(System.in);
    public double slope()
    {
        System.out.println("Please input the x coordinate of your first coordinate set");
        x1= linesInput.nextInt();
        System.out.println("Please input the y coordinate of your first coordinate set");
        y1= linesInput.nextInt();

        System.out.println("Please input the x coordinate of the second coordinate set");
        x2= linesInput.nextInt();
        System.out.println("Please input the y coordinate of the second coordinate set");
        y2= linesInput.nextInt();
        
        double result= (y2-y1)/(x2-x1);
        return result;
        linesInput.close();
    }

    public double midpoint()
    {
        System.out.println("Please type in your first coordinate");
        coordinate1= linesInput.nextInt();
        System.out.println("Please type in your second coordinate");
        coordinate2= linesInput.nextInt();
        return (coordinate1+coordinate2)/2;

        linesInput.close();
    }

}