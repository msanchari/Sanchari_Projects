import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        String[] subjectNames = new String[numSubjects];
        double[] subjectMarks = new double[numSubjects];
        double totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            scanner.nextLine();
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();

            System.out.print("Enter the marks obtained in " + subjectNames[i] + " out of 100: ");
            subjectMarks[i] = scanner.nextDouble();

            totalMarks += subjectMarks[i];
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
        
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println(name + "'s Result:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
