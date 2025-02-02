// Base class: Student
class Student {
    int rollNo;
    String name;

    // Constructor to initialize data members
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

// Derived class: Exam (Single Inheritance from Student)
class Exam extends Student {
    int[] marks = new int[5];

    // Constructor to initialize student details and marks
    public Exam(int rollNo, String name, int[] marks) {
        super(rollNo, name); // Calling the base class constructor
        this.marks = marks;
    }

    // Method to display student details and marks
    public void displayExamDetails() {
        // Display student details
        displayStudentDetails();

        // Display marks
        System.out.println("Marks in 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

// Main class to test the code
    class Main {
    public static void main(String[] args) {
        // Marks for 5 subjects
        int[] marks = {85, 90, 78, 88, 92};

        // Creating an object of Exam class and initializing data
        Exam exam = new Exam(101, "John Doe", marks);

        // Displaying the student details and marks
        exam.displayExamDetails();
    }
}
