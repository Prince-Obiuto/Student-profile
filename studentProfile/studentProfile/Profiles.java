/** A program to calculate the CGPA of students
 * 
 */
package studentProfile;

import java.util.Scanner;

/**
 * @author Prince-Obiuto
 *
 */
public class Profiles {
    String[] course;
    int[] units;
    String[] grades;
    double gpa1;
    double gpa2;
	double cgpa;
	
	public Profiles(String[] course, int[] units, String[] grades, double gpa1, double gpa2, double cgpa) {

        this.course = new String[12];
        this.units = new int[12];
        this.grades = new String[12];
        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.cgpa = cgpa;
    }
    Scanner scanner = new Scanner(System.in);
    int i;

	//Class to take the names of courses offered by the student
	public void setCourses() {
        do {
            for (i = 1; i < course.length; i++)
                System.out.println("Enter Course Name and code" + i);
                course[i] = scanner.nextLine();
            if (this.course[i].trim().isEmpty()) {
                System.out.println("Invalid Input!" + "/t Try again" + "/n If courses are complete please input N/A");
            }
        } while (this.course[i].trim().isEmpty());
    }

    public void setUnits(){
        do {
            for (i = 1; i < units.length; i++) {
                System.out.println("Enter units for " + course[i] + ":");
                this.units[i] = scanner.nextInt();
            }while (!scanner.hasNextInt()) {
                    System.out.println("Invalid Input!" + "/n Try again" + "If number of attainable courses is less than 12, please input 0 until all available spaces are occupied");
                    System.out.println();
            }
        } while (this.units[i].trim().isEmpty());

        this.grades[i] = scanner.nextLine();


        scanner.close();



        }
    }