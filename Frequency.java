
/**
 *
 */
public class Frequency
{
    /**Finding the frequency of each character using ASCII.
    * A string is a character array and thus we can access each character using its index an count its repition.
    *The upper case alphabet starts at A(65) and ends at Z(90).
    *The lower case alphabet starts at a(97) and ends at z(122). 
    */
    
    
    
    public void countFrequency(String s)
    {
      int array[] = new int[26]; //26 characters in the alphabet and stores the frequency in this array using the for loop at the bottom
      int n = s.length();
      int i = 0;
      for(i = 0; i<n; i++) //this loop runs from the first index to the last
      {
          if(s.charAt(i)>=65&&s.charAt(i)<=90) //finds the frequency for upper case characters
          {
              array[s.charAt(i)-65]++; 
            
      
          }
          else if(s.charAt(i)>=97&&s.charAt(i)<=122) //finds the frequency for lower case characters
          {
              array[s.charAt(i)-97]++; 
          }
     }
          for(i=0;i<26;i++) 
          {
              if(array[i]>0)
              {
              System.out.println("The frequency of" + " " + (char)(i+65)+ " " + "is" + " " + array[i]); //printing 
              }
      
          }
    }
}
  
