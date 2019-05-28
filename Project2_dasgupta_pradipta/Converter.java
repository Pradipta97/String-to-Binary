
/**
 * Pradipta Dasgupta
 * Converter Class
 * 
 * This class encrytps and decrypts the content of the file.
 * 
 */

public class Converter
{
 
    //converts String to Binary
    public static String toBinary(String s)
    {
       String binary="";
       
       for(byte b: s.getBytes()) //loops through each byte in the string
       {
           
          binary += Integer.toBinaryString(b) + " "; //converts byte to binary string
          
        }
       
        return binary;
    }
    
    
    //converts binary to string
    public static String toString(String s)
    {
        String array[] = s.split(" ");  //splits the binary string into an array of strings
        byte[] b = new byte[array.length];  //bytes array
        
        
        for(int i = 0; i < b.length; i++) //loops and converts each individual value in the string
        {
            b[i] = (byte)Integer.parseInt(array[i], 2);
        }
        return new String(b); //creating and returning a string using the array    
    }
    
}

