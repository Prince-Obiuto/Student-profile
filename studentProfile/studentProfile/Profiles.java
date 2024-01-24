/**
 * 
 */
package studentProfile;

import java.util.Scanner;

/**
 * @author HP
 *
 */
public class Profiles {
	String name;
    int age;
    String subjects;
    double scores;
    char grades;
    boolean promoted;
	
	public Profiles(String name, int age, double score, char grades, boolean promoted, String subject) {
   
		this.name = name;
        this.age = age;
        this.scores = score;
        this.grades = grades;
        this.promoted = promoted;
        this.subjects = subject;
    }
	
	public void setValuesFromInput() {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Enter Student's Name");	
			this.name = scanner.nextLine();
		
			if (this.name.trim().isEmpty()) {
				System.out.println("Invalid Input!" + "Try again");
			}
		} while(this.name.trim().isEmpty());
		
		do {
			System.out.println("Enter Student's Age");
			while (!scanner.hasNextInt()) {
				System.out.println("Inavlid Input" + "Enter a valid value");
				scanner.next();
			}
			this.age = scanner.nextInt();
			
			if (this.age < 0) {
			System.out.println("Invalid Age. Enter a non-negative value");
			} 
		}while (this.age < 0);
		
		
		for (int i = 0; i < subjects.length; i++) {
			do {
				System.out.println("Enter Name of Subject" + (i + 1));
				
				if (this.grades[i] == ' ') {
					System.out.println("Invalid score");
					this.subjects[i] = scanner.nextLine();
					
					this.scores[i] = scanner.nextDouble();
					
					this.grades[i] = calculateGrades(this.scores[i]);
				}
				} while (this.grades[i] == ' ');
			
				System.out.println("Enter Student's Score for Subject" + (i + 1));
				while (!scanner.hasNextDouble()) {
					System.out.println("Invalid Input");
					scanner.next();
			}
		}
	
		
		System.out.println("Is the Student Promoted" +  "\n Use True\\False To Indicate");
		this.promoted = scanner.nextBoolean();
		
		scanner.close();
	}

	private char calculateGrades(double scores) {
		if (scores >= 5.0 && scores <= 4.5) {
            return 'A';
        } else if (scores >= 70 && scores <= 84) {
            return 'B';
        } else if (scores >= 55 && scores <= 69) {
            return 'C';
        } else if (scores >= 40 && scores <= 54) {
            return 'D';
        } else if (scores >= 25 && scores <= 39) {
            return 'E';
        } else if (scores >= 0 && scores <= 24) {
            return 'F';
        } else {
            return ' ';
        }
	}
}