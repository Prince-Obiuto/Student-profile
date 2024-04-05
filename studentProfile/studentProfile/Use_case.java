package studentProfile;

public class Use_case {
    public static void main(String[] args) {

        Profiles studentProfile = new Profiles ("", 0, "",false, "");

        studentProfile.setValuesFromInput();

        System.out.println("Subject-wise Scores and Grades:");
        for (int i = 0; i < studentProfile.subjects.length; i++) {
            System.out.println(studentProfile.subjects[i] + ": Score - " + studentProfile.scores +
                    ", Grade - " + studentProfile.grades[i]);
        }
    }
}
