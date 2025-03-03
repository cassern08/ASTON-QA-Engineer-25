import Task1.Student;
import Task1.StudentManager;

public class Result {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("John Travolta", "A1", 2, new int[]{4, 5, 3}));
        manager.addStudent(new Student("Ben Stiller", "A1", 3, new int[]{2, 3, 2}));
        manager.addStudent(new Student("Natalie Portman", "A2", 4, new int[]{3, 4, 5}));
        manager.addStudent(new Student("Monica Belucci", "A2", 1, new int[]{4, 4, 4}));

        manager.removeLowPerformingStudents();

        manager.promoteStudents();

        System.out.println("Студенты на курсе 2:");
        manager.printStudents(2);
    }
}