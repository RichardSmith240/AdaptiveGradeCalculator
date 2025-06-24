import java.util.Scanner;

public class read {
	// make scanner
	Scanner input = new Scanner(System.in);

	// main function
    public static void main(String[] args) {
	}

	// get the input from user
	public String getInput(String prompt) {
		System.out.print(prompt);
		return input.nextLine();
	}
}
// to use access this function use the following:
//
//	readInput input = new readInput();
//	String prompt = "text here";
//	String response = input.readInput(prompt);
