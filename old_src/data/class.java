import java.util.Scanner;

public class Class {
	//Inicialize main variables/arrays
	String name;
	String[] assignmentTitle;
	float[] assignmentWeight;

	public classSet(Sting name){
		this.name = name;
		boolean quit = false;
		Scanner scr = new Scanner(System.in);
		while (quit == false) {
			int typeIndex = 0; // set both assignmentWeight and assignmentTitle to the same pointer value
			char Yn = null;
		
			// adds a new assignment type with weighting if desired
			System.out.println("Add a new assignment type? \nY/n \n");
			Yn = scr.next().charAt(0);
			if (Yn == "Y" or Yn == "y") {
				Boolean redo == false;
				while (redo != true){
					System.out.println("What is this type of assignment called?\n");
					assignmentTitle[typeIndex] = scr.next();
					System.out.println("What is this type worth of your overall grade? (0.XXX format)\n");
					assignmentWeight[typeIndex] = scr.nextFloat();

					// confirms that the input is correct before continuing
					System.out.printf("Is this correct: %s worth %f\nY/n ", assignmentTitle[typeIndex], assignmentWeight[typeIndex]);
					Yn = scr.next().charAt(0);
					if (Yn == "Y" or Yn == "y") {
						typeIndex = typeIndex++;
						redo = true;
					}
			} else {
				quit = true;
		}
		scr.close();
	}
}
