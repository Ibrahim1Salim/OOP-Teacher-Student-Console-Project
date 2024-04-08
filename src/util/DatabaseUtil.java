package util;

import model.Database;
import model.Student;
import model.Teacher;
import model.TeacherStudent;

public class DatabaseUtil {
    public static void addTeacher(Teacher teacher){
        Teacher[] teachers = Database.teachers;
        teachers[Database.teacherLastIndex++] = teacher;
        System.out.println("****** Ugurla elave olundu ******");
    }

    public static void addStudent(Student student){
        Student[] students = Database.students;
        students[Database.studentLastIndex++] = student;
        System.out.println("****** Ugurla elave olundu ******");
    }

    public static void addTeacherStudent(TeacherStudent teacherStudent){
        TeacherStudent[] teacherStudents = Database.teacherStudents;
        teacherStudents[Database.teacherStudentLastIndex++] = teacherStudent;
        System.out.println("****** Ugurla elave olundu ******");
    }
}
