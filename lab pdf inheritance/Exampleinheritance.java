 //Write a Program to take subjects (NT,OOPS,EDS) as Class names , attributes as MID-I ,
MID-II and ENDSEM marks of each subject, use the method name as totalmarks().
Display the student marks subject wise with (id,name, branch, and marks of each
subject) 

class NT {
    private int midI;
    private int midII;
    private int endSem;

    public NT(int midI, int midII, int endSem) {
        this.midI = midI;
        this.midII = midII;
        this.endSem = endSem;
    }

    public int totalMarks() {
        return midI + midII + endSem;
    }
}

class OOPS {
    private int midI;
    private int midII;
    private int endSem;

    public OOPS(int midI, int midII, int endSem) {
        this.midI = midI;
        this.midII = midII;
        this.endSem = endSem;
    }

    public int totalMarks() {
        return midI + midII + endSem;
    }
}

class EDS {
    private int midI;
    private int midII;
    private int endSem;

    public EDS(int midI, int midII, int endSem) {
        this.midI = midI;
        this.midII = midII;
        this.endSem = endSem;
    }

    public int totalMarks() {
        return midI + midII + endSem;
    }
}

public class Main {
    public static void main(String[] args) {
        int studentId = 1234;
        String studentName = "John Doe";
        String studentBranch = "Computer Science";

        NT ntMarks = new NT(80, 85, 75);
        OOPS oopsMarks = new OOPS(75, 70, 85);
        EDS edsMarks = new EDS(85, 90, 80);

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Branch: " + studentBranch);
        System.out.println("\nSubject wise marks:");
        System.out.println("NT: " + "Mid-I: " + ntMarks.midI + ", Mid-II: " + ntMarks.midII + ", EndSem: " + ntMarks.endSem + ", Total: " + ntMarks.totalMarks());
        System.out.println("OOPS: " + "Mid-I: " + oopsMarks.midI + ", Mid-II: " + oopsMarks.midII + ", EndSem: " + oopsMarks.endSem + ", Total: " + oopsMarks.totalMarks());
        System.out.println("EDS: " + "Mid-I: " + edsMarks.midI + ", Mid-II: " + edsMarks.midII + ", EndSem: " + edsMarks.endSem + ", Total: " + edsMarks.totalMarks());
    }
}

