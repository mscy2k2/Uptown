import java.util.Scanner;
public class CoinTest {

	public static void main(String[] args) {
	   Coin dime = new Coin();
	   int numHeads = 0;
	   int numTails = 0;
	   //int numTosses = 10;
	   String guess;
	   Scanner scnr = new Scanner(System.in);
	   System.out.print("Enter prediction(heads or tails): ");
		  guess = scnr.next();
		  
	   System.out.println("Initial coin side facing up: " + dime.getStatus() + "\n");
	   
	   if (dime.getStatus().equals("heads") && guess.equals("heads")){
		   System.out.println("Your guess is as right as good");
	   }
	   else if (dime.getStatus().equals("tailss") && guess.equals("tails")){
		   System.out.println("Your guess is as right as good");
	   }
	   else
		   System.out.println("Your guess is wrong");
	   
	   
	   /*for (int currentToss = 1; currentToss <= numTosses; currentToss++) {
		   dime.toss();
		   if (dime.getStatus() == "heads") {
			   numHeads += 1;
		   }
		   else {
			   numTails += 1;
		   }
		   System.out.println("Toss " + ": " + dime.getStatus());
	   }
       
	   System.out.println("\nOut of " + numTosses + " tosses,there were " + numHeads + " heads and " + numTails + " tails.");*/
	}

}
