package SEE;

import CIE.Personal;  // Import Personal class from CIE package
import CIE.Internals; // Import Internals class from CIE package

public class External extends Personal {
    private int[] externalMarks = new int[5]; // Array to store SEE marks for 5 courses
    private Internals internals; // Reference to the Internals class to access internal marks

    // Constructor
    public External(String usn, String name, int sem, int[] internalMarks, int[] externalMarks) {
        super(usn, name, sem);  // Call the constructor of the base class (Personal)
        this.internals = new Internals(internalMarks); // Initialize internals with internal marks
        this.externalMarks = externalMarks; // Initialize external marks
    }

    // Method to get external marks
    public int[] getExternalMarks() {
        return externalMarks;
    }

    // Method to calculate final marks
    public int[] getFinalMarks() {
        int[] finalMarks = new int[5];
        // Add internal marks and external marks for each course
        int[] internalMarks = internals.getInternalMarks();
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = internalMarks[i] + externalMarks[i]; // Assumes both arrays are of length 5
        }
        return finalMarks;
    }
}
