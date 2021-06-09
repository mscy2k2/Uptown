
public class CoinTest {

	public static void main(String[] args) {
	   Coin dime = new Coin();
	   int numHeads = 0;
	   int numTails = 0;
	   int numTosses = 5;
	   
	   System.out.println("Initial coin side facing up: " + dime.getStatus() + "\n");
	   
	   for (int currentToss = 1; currentToss <= numTosses; currentToss++) {
		   dime.toss();
		   if (dime.getStatus() == "heads") {
			   numHeads += 1;
		   }
		   else {
			   numTails += 1;
		   }
		   System.out.println("Toss " + ": " + dime.getStatus());
	   }
       
	   System.out.println("\nOut of " + numTosses + " tosses,there were " + numHeads + " heads and " + numTails + " tails.");
	}

}
