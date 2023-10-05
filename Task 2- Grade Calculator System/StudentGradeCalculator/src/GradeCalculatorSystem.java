import java.util.Scanner;


public class GradeCalculatorSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int num_of_Subjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= num_of_Subjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (num_of_Subjects * 100) * 100;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("----------------------------");
        System.out.println("Your report card is Below :- ");

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Your Average Percentage: " + averagePercentage + "%");
        System.out.println("Your Grade: " + grade);
        System.out.println("_______________________________");

        scanner.close();
    }
}
