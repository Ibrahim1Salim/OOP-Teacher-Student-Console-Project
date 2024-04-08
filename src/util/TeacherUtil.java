package util;

import model.Database;
import model.Student;
import model.Teacher;

import java.util.Scanner;

public class TeacherUtil {

    public static Teacher createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad: ");
        String name = scanner.next();
        System.out.println("Soy ad: ");
        String surname = scanner.next();
        System.out.println("Dogum tarixi: ");
        String birthDate = scanner.next();
        System.out.println("Email: ");
        String email = scanner.next();
        return new Teacher((long) Database.teacherLastIndex, name, surname, birthDate, email);
    }

    public static void printAllTeachers() {
        for (Teacher teacher : Database.teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }

    }

    public static Teacher getTeacherById(Long id) {
        for (Teacher teacher : Database.teachers) {
            if (teacher != null  &&  teacher.getId().equals(id)) {
                return teacher;

            }
        }
        return null;
    }
}