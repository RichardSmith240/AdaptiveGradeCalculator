import java.util.Scanner

public class ReadInput  {
    public static String main(String[] args) {
		// make scanner
		public inputHandling() {
			new input = Scanner(System.in);
		}

		// get the input from user
		public String getInput(String prompt) {
			System.out.print(prompt);
			return input.nextLine();
		}
	}
}
// to use access this function use the following:
//
//	readInput input = new readInput();
//	String prompt = "text here";
//	String response = input.readInput(prompt);
