package util;

import model.Database;
import model.Student;
import model.Teacher;

import java.util.Scanner;

public class StudentUtil {
    public static Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad: ");
        String name = scanner.next();
        System.out.println("Soy ad: ");
        String surname = scanner.next();
        System.out.println("Dogum tarixi: ");
        String birthDate = scanner.next();
        System.out.println("Email: ");
        String email = scanner.next();
        return new Student((long) Database.studentLastIndex,name,surname,birthDate,email);
    }
    public static void printAllStudent(){
        for(Student student : Database.students){
            if(student!=null){
                System.out.println(student);
            }
        }
    }
}
