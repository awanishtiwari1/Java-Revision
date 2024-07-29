import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput{


     
    public static void main(String args[]) throws IOException
    {

        //Ways to take user input
        System.out.println("Ways to take user input : ");

        //    => Using Buffered Reader 

        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // String name = reader.readLine();

        // System.out.println("String entered by you is : " + name);
                    //or 

            InputStreamReader r=new InputStreamReader(System.in);    
            BufferedReader br=new BufferedReader(r);            
            System.out.println("Enter your name");    
            String name=br.readLine();    
            System.out.println("Welcome "+name);    

        // => Using Scanner Class

        // Scanner s = new Scanner(System.in);

        // String  a = s.nextLine();

        // System.out.println("String value enetred by you is : " + a);

        // => using Console Class  

        // String name = System.console().readLine();

        // System.out.println(name);


        //  =>   sUsing Command Line Args 

        // if(args.length > 0)
        // {
        //     for(String s: args)
        //     {
        //         System.out.println(s);
        //     }
        // }
        // else{
        //     System.out.println("Empty Input provided");
        // }

    }
}


