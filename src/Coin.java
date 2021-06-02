import java.util.Random;

public class Coin {
   private String status;    // status refers to either heads or tails
   
   public void toss() {
	   Random randGen = new Random();
	   int randNum = randGen.nextInt(2);
	   if (randNum == 0) {
	      status = "tails";
	   }
	   else
		  status = "heads";
   }
   
   public String getStatus() {
	   return status;
   }
   
   public Coin() {
	   toss();
   }
}