import java.util.Random;
public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heads = 0;
		int tails = 0;
		int coins = 15;
		
		for(int i = 1; i <= coins; i++) {
			int theCoin = getRandomNumber(1,50);
			if(theCoin <= 25) {
				String actualCoin = "H";
				heads++;
				System.out.println("Coin " + i + ":" + actualCoin + "\n");
			} else {
				String actualCoin = "T";
				tails++;
				System.out.println("Coin " + i + ":" + actualCoin + "\n");
			}
		}
		System.out.println();
		System.out.println("HEADS " + heads);
		System.out.println("TAILS " + tails);

	}
	

	private static int getRandomNumber(int min, int max) {
		Random r = new Random();
		return r.nextInt((max+min)+1)+min;
		
	}
}
