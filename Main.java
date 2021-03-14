
/** Pradipta Dasgupta, Main class
 *  I did not use a HuffMan tree as my tree class was full of bugs and I did not want to get the code didn't compile penalty. 
 */ The input.txt file MUST be in the same folder as Test.java. 
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class Test
{
    public static void main(String[] args)
    {
       
       try {
            String f1;
            Scanner in = new Scanner(new File("input.txt")); 
            PrintWriter file2 = new PrintWriter(new File("output.txt"));
            Frequency f = new Frequency();
            Converter bin = new Converter();
           
            
            
            while(in.hasNextLine())
            {
                f1 = in.nextLine(); //scanning the contents of the file and assigning the characters to f1
                 
                System.out.println("The contents of the file:" + " " + f1);
                System.out.println("--------------------");
                f.countFrequency(f1); //counting the frequency of the contents of the file
                System.out.println("--------------------");
                //testing the conversion and back
                String str = bin.toString(bin.toBinary(f1));
                System.out.println("The file encrypted in binary:" + " " + bin.toBinary(f1));
                System.out.println("--------------------");
                System.out.println("The file decrypted:" + " " + str);
                file2.println(str);
               
                in.close();
                file2.close();
                
    
            }
            
            
            
           }
        
           
           catch(Exception e)
           {
              
           }
         }
    }
