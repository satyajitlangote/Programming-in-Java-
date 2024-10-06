public class StudentPackage {
    private final String prn;
    private final String name;
    private final int[] semesterMarks;
    private int totalMarks;

    public StudentPackage(String prn, String name, int[] semesterMarks) {
        if (prn == null || prn.isEmpty()) {
            throw new IllegalArgumentException("PRN cannot be empty");
        }
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        if (semesterMarks == null || semesterMarks.length != 6) {
            throw new IllegalArgumentException("Semester marks must be an array of 6 integers");
        }
        this.prn = prn;
        this.name = name;
        this.semesterMarks = semesterMarks.clone(); // Create a defensive copy
        this.totalMarks = calculateTotalMarks();
    }

    private int calculateTotalMarks() {
        int sum = 0;
        for (int marks : semesterMarks) {
            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException("Invalid marks: " + marks);
            }
            sum += marks;
        }
        return sum;
    }

   
    public String getDetails() {
        return "PRN: " + prn + "\nName: " + name + "\nTotal Marks: " + totalMarks;
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 92, 76}; // Example marks
        StudentPackage student = new StudentPackage("123456", "Satyajit Langote", marks);
        System.out.println(student.getDetails());
    }
}
