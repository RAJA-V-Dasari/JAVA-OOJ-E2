// File: CIE/Personal.java
package CIE;

import java.util.Scanner;

public class Personal {
    protected String usn;
    protected String name;
    protected int sem;

    public Personal(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public int getSem() {
        return sem;
    }
}
