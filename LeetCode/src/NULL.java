//created by Toufique on 03/04/2023

import java.io.*;
import java.util.*;

public class NULL {
    static int idxStudent = 0;
    static int idxTeacher = 0;
    static int idxCourse = 0;
    static int idxOnlyCourse = 0;
    static int idxStudentCourse = 0;

    static String[][] student = new String[1000][3], teacher = new String[1000][3], course = new String[1000][4], studentCourse = new String[100][4];
    static String[] onlyCourse = new String[100];
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        add();
        while (true) {
            System.out.println("Who are you?\n" +
                    "1: Student 2: Teacher");
            int t = in.nextInt();
            if (t == 2) queryForTeacher();
            if (t == 1) queryForStudent();
            if (t == 0) return;
        }
    }

    static void queryForStudent() {

        while (true) {
            System.out.println("Provide Student ID:");
            String id = in.next();
            System.out.println("Password ID:");
            String pass = in.next();
            String student = getStudent(id, pass);
            System.out.println("Welcome " + student + "!");
            if (student.equals("Invalid Credential!!!")) return;
            System.out.println("1: Add Course 2: View Courses 3:Back");
            int t = in.nextInt();
            if (t == 3) return;
            if (t == 1) {
                int i = 0;
                for (; i < onlyCourse.length; i++) {
                    if (onlyCourse[i] == null) break;
                    System.out.print((i + 1) + ": " + onlyCourse[i] + " ");
                }
                System.out.println((i + 1) + ": " + "back");
                System.out.println("Course Selected: ");
                int type = in.nextInt();
                if (type == (i + 1)) return;
                System.out.println("Section Selected: ");
                String sec = in.next();
                String Cname = onlyCourse[type - 1];

                if (isAvailableCourse(Cname, sec)) {
                    studentCourse[idxStudentCourse][0] = id;
                    studentCourse[idxStudentCourse][1] = student;
                    studentCourse[idxStudentCourse][2] = Cname;
                    studentCourse[idxStudentCourse++][3] = sec;
                    System.out.println("You have been enrolled in " + Cname + "." + sec + "Successfully!");
                }

            } else if (t == 2) {
                for (int i = 0; i <= idxStudentCourse; i++) {
                    if (studentCourse[i][0] == null) break;
                    if (studentCourse[i][1].equals(student)) System.out.println(studentCourse[i][2]);
                }
            }
            System.out.println("press 0 back to main");
            int tt = in.nextInt();
            if (tt == 0) return;
        }
    }

    static boolean isAvailableCourse(String name, String section) {
        for (int i = 0; i <= idxCourse; i++) {
            if (course[i][0].equals(name) && course[i][1].equals(section)) return true;
        }
        return false;
    }

    static void queryForTeacher() {
        while(true) {
            System.out.println("Provide Teacher ID:");
            String t = in.next();
            System.out.println("Password:");
            String pass = in.next();
            System.out.println(getTeacher(t, pass));
            if (getTeacher(t, pass).equals("Invalid Credential!!!")) return;
            System.out.println("1: View Courses 2: Logout");
            int type = in.nextInt();
            if (type == 2) return;
            String[][] tempCourse = getCourse(t);
            for (int i = 0; i < tempCourse.length; i++) {
                String x = tempCourse[i][0], y = tempCourse[i][1];
                System.out.print((i + 1) + ": " + x);
                if (y == null) break;
                System.out.print("." + y + " ");
            }
            System.out.println();
            int cmnd = in.nextInt();
            if (tempCourse[cmnd - 1][0].equals("Back")) return;
            System.out.println("List Of Student");
            for (int i = 0; i <= idxStudentCourse; i++) {
                if (studentCourse[i][0] == null) break;
                if (studentCourse[i][2].equals(tempCourse[cmnd - 1][0])) System.out.println("id: " + studentCourse[i][0] + " name: " + studentCourse[i][1]);
            }
            System.out.println("Press 0 to back");
            int tt = in.nextInt();
            if (tt == 0) return;
        }
    }
    static String[][] getCourse(String id) {
        String[][] ct = new String[50][2];
        int indx = 0;
        for (int i = 0; i <= idxCourse; i++) {
            if (course[i][3] == null) break;
            if (course[i][3].equals(id)) {
                ct[indx][0] = course[i][0];
                ct[indx++][1] = course[i][1];
            }
        }
        ct[indx++][0] = "Back";
        return ct;
    }
    static String getStudent(String id, String pass) {
        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) return "-1";
            if (student[i][0].equals(id) && student[i][1].equals(pass)) return student[i][2];
        }
        return "Invalid Credential!!!";
    }

    static String getTeacher(String id, String pass) {
        for (int i = 0; i < teacher.length; i++) {
            if (teacher[i] == null) return "-1";
            if (teacher[i][0].equals(id) && teacher[i][1].equals(pass)) return "Welcome " + teacher[i][2] + "!";
        }
        return "Invalid Credential!!!";
    }

    static void add() {
        /*Student ID Password Student Name
        S1 password A
        S2 password B
        S3 password C*/

        student[idxStudent][0] = "S1";
        student[idxStudent][1] = "password";
        student[idxStudent++][2] = "A";

        student[idxStudent][0] = "S2";
        student[idxStudent][1] = "password";
        student[idxStudent++][2] = "B";

        student[idxStudent][0] = "S3";
        student[idxStudent][1] = "password";
        student[idxStudent++][2] = "C";

        /*Teacher ID Password Teacher Name
        T1 password A
        T2 password B*/
        teacher[idxTeacher][0] = "T1";
        teacher[idxTeacher][1] = "password";
        teacher[idxTeacher++][2] = "A";

        teacher[idxTeacher][0] = "T2";
        teacher[idxTeacher][1] = "password";
        teacher[idxTeacher++][2] = "B";

        /*Course Name Section Timing Teacher
            Course A 1 A T1
            Course A 2 A T2
            Course A 3 B T1.
            Course B 1 A T1.
            Course C 1 B T2.
            Course C 2 C T1
        */

        course[idxCourse][0] = "Course A";
        course[idxCourse][1] = "1";
        course[idxCourse][2] = "A";
        course[idxCourse++][3] = "T1";

        course[idxCourse][0] = "Course A";
        course[idxCourse][1] = "2";
        course[idxCourse][2] = "A";
        course[idxCourse++][3] = "T2";

        course[idxCourse][0] = "Course A";
        course[idxCourse][1] = "3";
        course[idxCourse][2] = "B";
        course[idxCourse++][3] = "T1";

        course[idxCourse][0] = "Course B";
        course[idxCourse][1] = "1";
        course[idxCourse][2] = "A";
        course[idxCourse++][3] = "T1";

        course[idxCourse][0] = "Course C";
        course[idxCourse][1] = "1";
        course[idxCourse][2] = "B";
        course[idxCourse++][3] = "T2";

        course[idxCourse][0] = "Course C";
        course[idxCourse][1] = "2";
        course[idxCourse][2] = "C";
        course[idxCourse++][3] = "T1";


        for (int i = 0; i <= idxCourse; i++) {
            String name = course[i][0];
            boolean ok = true;
            for (int j = 0; j < i; j++) {
                if (course[j][0].equals(name)) {
                    ok = false;
                    break;
                }
            }
            if (ok) onlyCourse[idxOnlyCourse++] = name;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
