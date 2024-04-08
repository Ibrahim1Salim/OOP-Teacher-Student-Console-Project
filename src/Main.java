import model.Menu;
import model.Student;
import model.Teacher;
import model.TeacherStudent;
import util.DatabaseUtil;
import util.StudentUtil;
import util.TeacherStudentUtil;
import util.TeacherUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println(Menu.menu);
            System.out.println("Zehmet olmasa seciminizi edin: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            operateOption(option);

        }
    }
    public static void operateOption(int option){
        switch (option){
            case 1 :
                Teacher teacher =TeacherUtil.createTeacher();
                DatabaseUtil.addTeacher(teacher);
                break;

            case 2 :
                Student student = StudentUtil.createStudent();
                DatabaseUtil.addStudent(student);
                break;

            case 3 :
                TeacherStudent teacherStudent = TeacherStudentUtil.createTeacherStudent();
                DatabaseUtil.addTeacherStudent(teacherStudent);
                break;

            case 4 : TeacherUtil.printAllTeachers();break;
            case 5 : StudentUtil.printAllStudent();break;
            case 6 : TeacherStudentUtil.printAllTeachersThatTeachStudent();break;
            case 7 : TeacherStudentUtil.printAllStudentsTaughtByTeacher();break;
            case 8 : System.exit(0);
        }
    }
}