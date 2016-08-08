import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;
 
public class Main {

    public static void main(String[] args) throws Exception{
        //Output to  file
	File file = new File("output.txt");
        FileOutputStream fis = new FileOutputStream(file);
        //Input from file
	Scanner in = new Scanner(new File("planetext.txt"));
        PrintStream out = new PrintStream(fis);
        System.setOut(out);
	//Main Program
        System.out.println("hello world");
           
       
    }
   
}
