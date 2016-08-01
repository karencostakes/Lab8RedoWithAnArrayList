import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab8RedoWithArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		int userInput;
		float battingAveragePieceOne = 0; // number of at bats where player
		// earned at least 1 hit/
		// userInput;
		float sluggingAveragePieceOne = 0; // sluggingAverage = total number
		// of
		// bases earned/userInput
		while (choice.equalsIgnoreCase("yes")) {
	
		System.out.println("Welcome to Batting Average Calculator!");
		System.out.println("Enter number of times at bat: ");
		userInput = scan1.nextInt();
		scan1.nextLine();
		//System.out.println(userInput);
		ArrayList<Integer> batter = new ArrayList<Integer> ();
	
		//System.out.println(batter.size());
		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");

		for (int i = 0; i < userInput; i++) {

			System.out.println("Result for at bat " + (i+1));
			batter.add(scan1.nextInt());
			scan1.nextLine();
			//batter.set(i, i);
		
			sluggingAveragePieceOne = sluggingAveragePieceOne + batter.get(i);
	//		System.out.println(batter.indexOf(i));
			if (batter.get(i) > 0) {
				battingAveragePieceOne = battingAveragePieceOne + 1;

			}
			
		}
		//for (int i = 0; i < batter.size(); i++) {
			//System.out.println(batter.get(i));
		//}
		
	DecimalFormat df = new DecimalFormat();
	df.setMinimumFractionDigits(3);
	System.out.println("Batting Average: " + df.format (battingAveragePieceOne/userInput));
	//System.out.println("Number of at bats where player earned at least 1 base: " + battingAveragePieceOne);
	//System.out.println("Number of at bats: " + userInput);
	//System.out.println("Number of bases earned: " + sluggingAveragePieceOne);
	System.out.println("Slugging Average: " + df.format (sluggingAveragePieceOne / userInput));
		//System.out.printf("%2f", battingAveragePieceOne / userInput);
		//System.out.printf("%2f", sluggingAveragePieceOne / userInput);
	System.out.println("Continue? (Enter Yes or No)");
	choice = scan1.nextLine();
		if (choice.equalsIgnoreCase("no"))
		{
			System.out.println("See you later!");
		}
		}
	
	}
}
			



	



