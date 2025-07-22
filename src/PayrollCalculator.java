public class PayrollCalculator {

    // Method 1: Calculate weekly pay based on employee type
    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {
        if (hoursWorked < 0 || hourlyRate < 0) {
            System.out.println("Invalid input values.");
            return 0.0;
        }

        switch (employeeType.toUpperCase()) {
            case "FULL_TIME":
                if (hoursWorked > 40) {
                    return 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5;
                } else {
                    return hoursWorked * hourlyRate;
                }
            case "PART_TIME":
                if (hoursWorked > 25) hoursWorked = 25;
                return hoursWorked * hourlyRate;
            case "CONTRACTOR":
                return hoursWorked * hourlyRate;
            case "INTERN":
                if (hoursWorked > 20) hoursWorked = 20;
                return hoursWorked * hourlyRate * 0.8;
            default:
                System.out.println("Unknown employee type: " + employeeType);
                return 0.0;
        }
    }

    // Method 2: Calculate tax deduction based on gross pay
    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance) {
        double taxRate;
        if (grossPay <= 500) taxRate = 0.10;
        else if (grossPay <= 1000) taxRate = 0.15;
        else if (grossPay <= 2000) taxRate = 0.20;
        else taxRate = 0.25;

        double tax = grossPay * taxRate;
        if (hasHealthInsurance) tax -= 50;

        return Math.max(tax, 0); // Prevent negative tax values
    }

    // Method 3: Process payroll for multiple employees and display statistics
    public static void processPayroll(String[] employeeTypes, double[] hours, double[] rates, String[] names) {
        if (employeeTypes.length != hours.length || hours.length != rates.length || rates.length != names.length) {
            System.out.println("Mismatched array lengths.");
            return;
        }

        double totalPay = 0;
        double highestPay = Double.MIN_VALUE;
        double lowestPay = Double.MAX_VALUE;
        String highestPaid = "", lowestPaid = "";
        int overtimeCount = 0;

        System.out.println("\n--- Payroll Report ---");
        System.out.printf("%-20s | %-12s | %-16s | %-10s%n", "Name", "Type", "Gross Pay (OMR)", "Tax (OMR)");

        for (int i = 0; i < names.length; i++) {
            double pay = calculateWeeklyPay(employeeTypes[i], hours[i], rates[i]);
            double tax = calculateTaxDeduction(pay, true);
            totalPay += pay;

            if (pay > highestPay) {
                highestPay = pay;
                highestPaid = names[i];
            }

            if (pay < lowestPay) {
                lowestPay = pay;
                lowestPaid = names[i];
            }

            if (hours[i] > 40) overtimeCount++;

            System.out.printf("%-20s | %-12s | OMR %-13.2f | OMR %-8.2f%n", names[i], employeeTypes[i], pay, tax);
        }

        double avgPay = totalPay / names.length;
        System.out.println("\nSummary:");
        System.out.println("Highest Paid: " + highestPaid + " (OMR " + highestPay + ")");
        System.out.println("Lowest Paid: " + lowestPaid + " (OMR " + lowestPay + ")");
        System.out.println("Average Pay: OMR " + String.format("%.2f", avgPay));
        System.out.println("Employees with Overtime: " + overtimeCount);
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN", "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {
            
            
            "Ahmed Al-Harthy",
            "Sara Al-Aghbari",
            "Mundhir Al-Balushi",
            "Fatma Al-Anqoudi",
            "Anhal Al-Ruziqiya"
        };

        // Test individual calculation
        System.out.println("Ahmed's Weekly Pay: OMR " + calculateWeeklyPay("FULL_TIME", 45, 25.0));
        System.out.println("Tax Deduction: OMR " + calculateTaxDeduction(1125, true));

        // Process full payroll for all employees
        processPayroll(types, hours, rates, names);
    }
}
