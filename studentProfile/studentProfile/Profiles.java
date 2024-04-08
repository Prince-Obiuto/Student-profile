/**
 * 
 */
package studentProfile;

import java.util.Scanner;

/**
 * @author Prince-Obiuto
 *
 */
public class Profiles {
	String name;
    String[] courses;
    char[] grades;
    double gpa;
	double cgpa;
	int courseUnit;
	
	public Profiles(String name, String courses, char grades, double gpa, double cgpa, int courseUnit) {
   
		this.name = name;
        this.courses = new String[12];
        this.grades = new char[12];
        this.gpa = gpa;
        this.cgpa = cgpa;
		this.courseUnit = courseUnit;
    }
	
	public void takeValuesFromInput() {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Enter Student's Name");	
			this.name = scanner.nextLine();
		
			if (this.name.trim().isEmpty()) {
				System.out.println("Invalid Input!" + "/n Try again");
			}
		} while(this.name.trim().isEmpty());

		do {
            int i;
            for (i = 0; i < courses.length; i++) {
                System.out.println("Enter Course Name and Code of course" + i);
                this.courses[i] = scanner.nextLine();
                if (this.courses[i].trim().isEmpty()) {
					System.out.println("Invalid Input!" + "/n Try again");
					System.out.println("If number of attainable courses is less than 12, please input N/A until all available spaces are occupied");
                }
            } while(this.courses[i].trim().isEmpty())

            this.grades[i] = scanner.next ;
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

	private int valueOfCourseUnit(this.grades[i]){
		

	}
}