import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		System.out.println(
				"Name: " + lastName + ", " + firstName 
				+ 	"\nID: " + idNumber); 
	}

}

class Student extends Person{
	private int[] testScores;
	Student(String firstName, String lastName, int identification, int[] testScores){ 
		// explicit call to superclass constructor:
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}

	public char calculate() {
		int sum = 0;
		for(int i = 0; i < testScores.length; i++){
			sum += testScores[i];
		}
		float avg = sum / testScores.length;
		if (avg >= 90 && avg <= 100)
			return 'O';
		else if (avg >= 80 && avg < 90)
			return 'E';
		else if (avg >= 70 && avg < 80)
			return 'A';
		else if (avg >= 55 && avg < 70)
			return 'P';
		else if (avg >= 40 && avg < 55)
			return 'D';
		else
			return 'T';

	}
}
