import java.util.Scanner;
public class Errors
 {
     String errorReader="";
    private int choiceError;
    Scanner errorInput= new Scanner(System.in);

       public void errorMessage()
        {
            System.out.println("Please choose to type in 1 or 2 only as your previous input was invalid");
            errorReader=errorInput.nextLine();
        }

        public void errorLooper()
        {
            for(int checker=1; checker>=1;)
            {
                choiceError= errorInput.nextInt();

                if(choiceError==1 || choiceError==2)
                {
                    checker=0;
                }
                else
                {
                    checker++;
                    errorMessage();
                }
            }
        }
        
    
}
