import java.util.Random;
import java.util.Scanner;
public class RandomSource {
	private int randomValue;
	private int  userGuessed;
	
	public RandomSource()//empity constructore
	{
		
	}
	
  
     public void randomlimit(int limitvalue) // random number generator limit setter methode
		{
           Random randomNumber = new Random();
	        randomValue = randomNumber.nextInt( limitvalue);   // generated randomvalue storing
		}
      public int get_random()  // generated randomvalue display
      {
    	  return randomValue;
      }
	
	 public void user_guessing_chances(int limit_of_atempts) // user alowing times to guess number of random number genrated
		{
		   Scanner  userInput = new Scanner(System.in);
		    for(int i=1;i<=limit_of_atempts;i++)
		     {
			     System.out.println("\tyour ( "+i+" ) guess is :\t");
			      userGuessed = userInput.nextInt();
			     if(userGuessed == randomValue)
			     {
				    System.out.println("\t\t*-------wow!!you win game by ("+i+") atempt-----------*");
				    break;
			     }
			    else if (userGuessed != randomValue  && i <limit_of_atempts)
			     {
				      if(randomValue>userGuessed )
				      {
					     System.out.println("\n\tWrong!!your guessed number was lesser than Random number" );
			             System.out.println(" \n  Try now again :\t" );
				       }
				      else
				      {
					    System.out.println("\n\tWrong!!your guessed number was gretter than Random number" );
			            System.out.println(" \n  Try now  again :\t" );
				       }
			      }
			     else
			     {
				    System.out.println("\t\t*--------Alas!! your all chances ended and you have  lost-------------*");
			     }
			     
		      }
          }
 }

			
		
		
		    
		
		
	


