public class PayrollCalculator {
    public static void main(String[] args) {
        System.out.println("Payroll Calculator - Employee Salaries in OMR");

        String[] employeeNames = {
            "Ahmed Al Harthi",
            "Anhal Al Ruzaiqi",
            "Sara Al Aghbari",
            "Mundhir Al Balushi",
            "Fatma Al Anqoudi"
        };

        double[] hoursWorked = { 40, 38.5, 42, 36.25, 45 };
        double[] hourlyRates = { 4.5, 4.2, 5.0, 3.8, 4.7 };

        for (int i = 0; i < employeeNames.length; i++) {
            double salary = hoursWorked[i] * hourlyRates[i];
            System.out.printf("%s earned %.2f OMR this week.\n", employeeNames[i], salary);
        }
    }
}
