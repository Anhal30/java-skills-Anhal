public class GradeManager {

    // Method 1: Reverse each student name (e.g., "Ahmed" → "demhA")
    public static String[] reverseStudentNames(String[] names) {
        String[] reversed = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            StringBuilder sb = new StringBuilder(names[i]);
            reversed[i] = sb.reverse().toString();
        }
        return reversed;
    }

    // Method 2: Convert numeric score to letter grade
    public static char getLetterGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    // Method 3: Return names of students who scored below 60
    public static String[] findFailingStudents(String[] names, int[] scores) {
        int count = 0;
        for (int score : scores) {
            if (score < 60) count++;
        }

        String[] failing = new String[count];
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failing[index++] = names[i];
            }
        }
        return failing;
    }

    // main method for testing
    public static void main(String[] args) {
        String[] students = {"Ahmed Al-Harthy", "Anhal Al-Ruziqiya", "Sara Al-Aghbari", "Mundhir Al-Balushi", "Fatma Al-Anqoudi"};
        int[] scores = {95, 67, 45, 78, 58};

        System.out.println("🔄 Reversed Names:");
        String[] reversed = reverseStudentNames(students);
        for (String name : reversed) {
            System.out.println(name);
        }

        System.out.println("\n📊 Letter Grades:");
        for (int i = 0; i < students.length; i++) {
            char grade = getLetterGrade(scores[i]);
            System.out.println(students[i] + ": " + scores[i] + " → " + grade);
        }

        System.out.println("\n❌ Failing Students (score < 60):");
        String[] failing = findFailingStudents(students, scores);
        for (String name : failing) {
            System.out.println(name);
        }
    }
}
