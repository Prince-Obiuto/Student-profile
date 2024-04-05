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
    String subjects;
    double gpa;
    String cgpa;
	char scores;
    boolean promoted;
	
	public Profiles(String name, double score, char grades, boolean promoted, String subject) {
   
		this.name = name;
        this.scores = score;
        this.class = gpa;
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
			for (int i = 0; i < subjects.length; i++) {
				do {
					System.out.println("Enter Name of Subject" + (i + 1));

					if (this.grades[i] == ' ') {
						System.out.println("Invalid score");
						this.subjects[i] = scanner.nextLine();

						this.scores[i] = scanner.nextDouble();

						this.grades[i] = calculateClass(this.scores[i]);
					}
				} while (this.grades[i] == ' ');

				System.out.println("Enter Student's Score for Subject" + (i + 1));
				while (!scanner.hasNextDouble()) {
					System.out.println("Invalid Input");
					scanner.next();
				}
			}

			scanner.close();
		}
	}

	private String calculateClass(double scores) {
		if (scores >= 5.0 && scores <= 4.5) {
            return "First Class";
        } else if (scores >= 4.49 && scores <= 3.5) {
            return "Second Class";
        } else if (scores >= 3.49 && scores <= 2.5) {
            return "Third Class";
        } else if (scores >= 2.49 && scores <= 2.0) {
            return "Pass";
        } else {
            return " ";
        }
	}
}