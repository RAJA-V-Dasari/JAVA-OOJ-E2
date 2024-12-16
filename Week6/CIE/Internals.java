package CIE;

public class Internals {
    protected int[] internalMarks = new int[5]; // Array to store internal marks for 5 courses

    // Constructor to initialize internal marks
    public Internals(int[] marks) {
        if (marks.length == 5) {
            this.internalMarks = marks;
        } else {
            System.out.println("Error: There must be 5 internal marks.");
        }
    }

    // Method to get internal marks
    public int[] getInternalMarks() {
        return internalMarks;
    }
}
