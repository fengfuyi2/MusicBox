import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); 

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student ID:");
            String id = scanner.nextLine();
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            System.out.println("Enter the number of extra activities:");
            int activitiesCount = scanner.nextInt();
            scanner.nextLine(); 

            Student student = new Student(id, name, activitiesCount);
            for (int j = 0; j < activitiesCount; j++) {
                System.out.println("Enter activity " + (j + 1) + ":");
                String activity = scanner.nextLine();
                student.addExtraActivity(activity, j);
            }
            students[i] = student;
        }

        System.out.println("\nAll Students Details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
