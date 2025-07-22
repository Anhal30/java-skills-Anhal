import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student grade (0-100): ");
        int grade = scanner.nextInt();

        String result;
        if (grade >= 90) {
            result = "A - Excellent";
        } else if (grade >= 80) {
            result = "B - Very Good";
        } else if (grade >= 70) {
            result = "C - Good";
        } else if (grade >= 60) {
            result = "D - Pass";
        } else {
            result = "F - Fail";
        }

        System.out.printf("%s's grade is: %s\n", name, result);
        scanner.close();
    }
}
