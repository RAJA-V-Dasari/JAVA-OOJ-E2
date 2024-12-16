import java.util.*;

class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;

    public void accept_details() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name :");
        this.name = s.nextLine();

        System.out.println("Enter usn :");
        this.usn = s.nextLine();

        System.out.println("Enter total number of subjects:");
        int n = s.nextInt();

        credits = new int[n];
        marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of subject " + (i + 1) + " :");
            this.marks[i] = s.nextInt();
            System.out.println("Enter credits of subject " + (i + 1) + " :");
            this.credits[i] = s.nextInt();
        }
    }

    public void display_details() {
        System.out.println("Name :" + this.name);
        System.out.println("USN :" + this.usn);
        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + " Marks: " + this.marks[i] + ", Credits: " + this.credits[i]);
        }
    }

    public double SGPA() {
        int n = this.credits.length;
        int total_grade_points = 0;
        int total_credits = 0;

        for (int i = 0; i < n; i++) {
            int grade_point = 0;

            if (marks[i] >= 90) {
                grade_point = 10;
            } else if (marks[i] >= 80) {
                grade_point = 9;
            } else if (marks[i] >= 70) {
                grade_point = 8;
            } else if (marks[i] >= 60) {
                grade_point = 7;
            } else if (marks[i] >= 50) {
                grade_point = 6;
            } else if (marks[i] >= 40) {
                grade_point = 5;
            } else {
                grade_point = 0; // Fail or below 40
            }

            total_grade_points += (grade_point * this.credits[i]);
            total_credits += this.credits[i];
        }

        if (total_credits == 0) {
            System.out.println("Total credits = 0");
            return 0.0;
        } else {
            return (double) total_grade_points / total_credits;
        }
    }
}

public class Student_demo {
    public static void main(String args[]) {
        Student s = new Student();
        s.accept_details();
        s.display_details();
        double sgpa = s.SGPA();
        System.out.println("SGPA = " + sgpa);
    }
}

