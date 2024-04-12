/**
 * 
 */
package studentProfile;

import java.util.Scanner;

import static jdk.vm.ci.meta.JavaKind.Char;

/**
 * @author Prince-Obiuto
 *
 */
public class Profiles {
    String[] course;
    int units;
    String[] grades;
    double gpa1;
    double gpa2;
	double cgpa;
	
	public Profiles(String course, int units, String grades, double gpa1, double gpa2, double cgpa) {

        this.course = new String[12];
        this.units = units;
        this.grades = new String[12];
        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.cgpa = cgpa;
    }
	
	public void setCourses() {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            for (i = 0; i < course.length; i++)
                System.out.println("Enter Course Name and code");
                course = scanner.nextLine;

            if (this.name.trim().isEmpty()) {
                System.out.println("Invalid Input!" + "/n Try again");
            }
        } while (this.name.trim().isEmpty());
    }

    public void setUnits(){
        do {
            for (i = 0; i < courses.length; i++) {
                System.out.println("Enter Course Name and Code of course" + i);
                this.course[i] = scanner.nextLine();
                if (this.courses[i].trim().isEmpty()) {
                    System.out.println("Invalid Input!" + "/n Try again");
                    System.out.println("If number of attainable courses is less than 12, please input N/A until all available spaces are occupied");
                }
            }
        } while (this.courses[i].trim().isEmpty());

        this.grades[i] = Char.valueOf(scanner.nextLine()).getTypeChar();


        scanner.close();



        }
    }