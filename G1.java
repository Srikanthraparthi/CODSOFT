package trail;

import java.util.Scanner;

public class G1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.println("Enter the marks obtained in each subject (out of 100):");

        // Assuming there are 5 subjects for this example
        int numberOfSubjects = 5;
        int totalMarks = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();

            // Validate input marks (assuming marks are between 0 and 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        // Calculate Total Marks
        System.out.println("Total Marks: " + totalMarks);

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");

        // Grade Calculation
        char grade = calculateGrade(averagePercentage);
        System.out.println("Grade: " + grade);

        // Close scanner
        scanner.close();
    }

    // Method to calculate grade based on average percentage
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

