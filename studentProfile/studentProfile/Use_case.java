package studentProfile;

public class Use_case {
    public static void main(String[] args) {

        Profiles studentDetails = new Profiles ("", ""," ", 0.0);

        studentDetails;

        System.out.println("Subject-wise Scores and Grades:");
        for (int i = 0; i < studentDetails.courses[i].length; i++) {
            System.out.println(studentDetails.subjects[i] + ": Score - " + studentDetails.scores +
                    ", Grade - " + studentDetails.grades[i]);
        }
    }
}
