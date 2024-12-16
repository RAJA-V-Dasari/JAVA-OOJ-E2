import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many students they want to input
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline

        // Create an array to store instances of External for each student
        External[] students = new External[n];

        // Loop to take input for each student
        for (int i = 0; i < n; i++) {
            // Take student details (USN, Name, Semester)
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Semester: ");
            int sem = scanner.nextInt();

            // Take internal marks
            System.out.println("Enter internal marks for 5 courses: ");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter marks for course " + (j + 1) + ": ");
                internalMarks[j] = scanner.nextInt();
            }

            // Take external marks
            System.out.println("Enter external marks for 5 courses: ");
            int[] externalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter marks for course " + (j + 1) + ": ");
                externalMarks[j] = scanner.nextInt();
            }
            scanner.nextLine();  // Consume the leftover newline

            // Create a new External object for the student
            students[i] = new External(usn, name, sem, internalMarks, externalMarks);
        }

        // Display final marks for each student
        System.out.println("\nFinal Marks for All Students:");
        for (External student : students) {
            System.out.println("\nStudent: " + student.getName() + " (" + student.getUsn() + ")");
            int[] finalMarks = student.getFinalMarks();
            System.out.print("Final Marks: ");
            for (int mark : finalMarks) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

