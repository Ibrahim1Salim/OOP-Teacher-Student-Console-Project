package util;

import model.Database;
import model.Student;
import model.Teacher;
import model.TeacherStudent;

import java.util.Scanner;

public class TeacherStudentUtil {
    public static TeacherStudent createTeacherStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("muellimin ID-ni daxil et: ");
        Long teacherId = scanner.nextLong();

        System.out.println("Sagirdin ID-ni daxil et: ");
        Long studentId = scanner.nextLong();
        System.out.println("Fenni daxil et: ");
        String subject= scanner.next();
        System.out.println("Sinif itagini daxil et: ");
        String classNumber= scanner.next();

        Teacher teacher = Database.teachers[teacherId.intValue()];
        Student student = Database.students[studentId.intValue()];
        return new TeacherStudent(Database.teacherStudentLastIndex,teacher,student,subject,classNumber);

    }
    public static void printAllTeachersThatTeachStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sagirdin id-ni daxil et: ");
        Long id= scanner.nextLong();
        for(TeacherStudent teacherStudent : Database.teacherStudents){
            if(teacherStudent != null  &&  teacherStudent.getStudent().getId().equals(id)){
                System.out.println(teacherStudent.getTeacher());
            }
        }
    }

    public static void printAllStudentsTaughtByTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Muellimin id-ni daxil et: ");
        Long id= scanner.nextLong();
        for(TeacherStudent teacherStudent : Database.teacherStudents){
            if(teacherStudent != null  &&  teacherStudent.getTeacher().getId().equals(id)){
                System.out.println(teacherStudent.getStudent());
            }
        }
    }
}
