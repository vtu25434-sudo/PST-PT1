import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class CollectorsTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of students
        int N = sc.nextInt();
        List<Student> students = new ArrayList<>();

        // Read student details
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }

        // Read K
        int K = sc.nextInt();
        sc.close();

        // Sort students and pick top K using Streams
        List<String> topStudents = students.stream()
                .sorted(
                        Comparator.comparingInt(Student::getMarks).reversed()
                                .thenComparing(Student::getName)
                )
                .limit(K)
                .map(Student::getName)
                .collect(Collectors.toList());

        // Print top K student names separated by space
        System.out.println(String.join(" ", topStudents));
    }
}

