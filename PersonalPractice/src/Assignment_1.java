//created by Toufique on 02/04/2023

import java.io.*;
import java.util.*;

public class Assignment_1 {
    static String[] student = new String[100];
    static String[] teacher = new String[100];
    static String[] course = new String[100];
    static String[] takenCourse = new String[100];
    static int idxx = -1;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        addTestData();
        while (true) {
            System.out.println("Who are you?\n" + "1: Student 2: Teacher\n");
            int i = in.nextInt();
            if (i == 2) queryForTeacher();
            //to break press -1;
            if (i == -1) break;
        }

    }

    static void queryForTeacher() {
        System.out.println("Provide Teacher ID: ");
        String id = in.next();
        System.out.println("Password:");
        String pass = in.next();
        String name = getTeacherName(id, pass);
        if (name.equals("-1")) {
            System.out.println("Invalid credential");
            return;
        }
        System.out.println("Welcome to " + name + "!");

        System.out.println("1: View Courses 2: Logout");
        int i = in.nextInt();
        if (i == 2) return;
        String courses = getCourseName(id);
        System.out.println(courses);
        String t = in.next();
        getStudentsList(courses, t);

    }
    static void addCourse(String courseName, String studentName, String secton) {
        String str = courseName + "@" + secton + "@" + studentName;
        takenCourse[idxx++] = str;
    }

    static String getTeacherName(String id, String password) {
        for (int i = 0; i < teacher.length; i++) {
            if (teacher[i] == null)break;
            String tempId = "";
            int j = 0;
            for ( ;j < teacher[i].length() && teacher[i].charAt(j) != '@'; j++) {
                tempId = tempId + teacher[i].charAt(j);
            }
            String pass = "";
            int k = j + 1;
            for (; k < teacher[i].length() && teacher[i].charAt(k) != '@'; k++) {
                pass = pass + teacher[i].charAt(k);
            }

            if (tempId.equals(id) && pass.equals(password)) {
                String name = "";
                for (int l = k + 1; l < teacher[i].length(); l++) name = name + teacher[i].charAt(l);
                return name;
            }
        }
        return "-1";
    }

    static String getCourseName(String teacherId) {
        String courses = "";
        int indx = 0;
        for (int i = 0; i < course.length; i++) {
            if (course[i] == null) break;
            String id = "";
            for (int j = course[i].length() - 1; course[i].charAt(j) != '@'; j--) {
                id = course[i].charAt(j) + id;
            }
            if (!id.equals(teacherId)) continue;
            indx++;
            String c = "";
            int j = 0;
            for (; course[i].charAt(j) != '@'; j++) c = c + course[i].charAt(j);
            c = c + "." + course[i].charAt(j + 1);
            courses = courses + indx + ": " + c + " ";
        }
        indx++;
        courses = courses + " " + (indx) + " Back";
        return courses;
    }

    static String getStudentsList(String courses, String id) {
        String list = "";
        String courseName = "";
        String section = "";
        id = id + ":";
        for (int i = 0; i < courses.length(); i++) {
            String temp = "";
            int j = i;
            for (int cnt = 0 ;cnt < id.length() && j < courses.length(); j++, cnt++) {
                temp = temp + courses.charAt(j);
            }
            if (temp.equals(id)) {
                String tt = "";
                int k = j + 1;
                for (; k < courses.length(); k++) {
                    if (courses.charAt(k) == '.') break;
                    tt = tt + courses.charAt(k);
                }
                courseName = tt;
                section = "" + courses.charAt(k + 1);
            }
        }

        return list;
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }



    static void addTestData() {
        /*
        * Here @ used for separating each role of a row
        *
        * */


        //test data for student
        // Student ID Password Student Name
        student[0] = "S1@password@A";
        student[1] = "S2@password@B";
        student[2] = "S3@password@C";
        //test data for faculty
        //Teacher ID Password Teacher Name
        teacher[0] = "T1@password@A";
        teacher[1] = "T2@password@B";
        teacher[2] = "T3@password@C";

        //test data for couse
        //Course Name Section Timing Teacher
        course[0] = "Course A@1@A@T1";
        course[1] = "Course A@2A@T2";
        course[2] = "Course A@3@B@T1";
        course[3] = "Course B@1@A@T1";
        course[4] = "Course C@1@B@T2";
        course[5] = "Course C@2@C@T1";
    }
}
