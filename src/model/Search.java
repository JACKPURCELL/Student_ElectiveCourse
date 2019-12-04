package model;

import javafx.collections.ObservableList;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Search {

    public static int eleindex[] = new int[100];
    public static int schindex[] = new int[100];
    public static int couindex[] = new int[100];
    public static int teaindex[] = new int[100];
    public static int coursenum;//The number of Classes of a student
    Myfile f2 = new Myfile(new File("Student.txt"));
    Myfile f3 = new Myfile(new File("Teacher.txt"));
    Myfile f4 = new Myfile(new File("Course.txt"));
    Myfile f5 = new Myfile(new File("Schedule.txt"));
    Myfile f6 = new Myfile(new File("Electivecourse.txt"));
    public static Student[] studentlist = new Student[100];
    public static Teacher[] teacherlist = new Teacher[100];
    public static Course[] courselist = new Course[100];
    public static Schedule[] schedulelist = new Schedule[100];
    public static Electivecourse[] electivecourselist = new Electivecourse[100];

    public Search() throws IOException {
    }


    public void writeALLfile(){
        //Student
        Student s1 = new Student("sid1", "Student1", "m", 15, "CS");
        Student s2 = new Student("sid2", "Student2", "f", 16, "EE");
        Student s3 = new Student("sid3", "Student3", "m", 17, "ECE");
        Student s4 = new Student("sid4", "Student4", "f", 18, "EE");
        Student s5 = new Student("sid5", "Student5", "m", 19, "CS");
        f2.writeFile(s1);
        f2.writeFile(s2);
        f2.writeFile(s3);
        f2.writeFile(s4);
        f2.writeFile(s5);

        //Teacher
        Teacher t1 = new Teacher("tid1", "Teacher1", "m", 15, "Assistant Professor");
        Teacher t2 = new Teacher("tid2", "Teacher2", "f", 20, "Professor");
        Teacher t3 = new Teacher("tid3", "Teacher3", "m", 25, "Assistant Professor");
        Teacher t4 = new Teacher("tid4", "Teacher4", "f", 30, "Professor");
        Teacher t5 = new Teacher("tid5", "Teacher5", "m", 35, "Assistant Professor");
        f3.writeFile(t1);
        f3.writeFile(t2);
        f3.writeFile(t3);
        f3.writeFile(t4);
        f3.writeFile(t5);

        //Course
        Course c1 = new Course("JAVA", "cid1", 8);
        Course c2 = new Course("C", "cid2", 16);
        Course c3 = new Course("PYTHON", "cid3", 32);
        Course c4 = new Course("MATLAB", "cid4", 64);
        Course c5 = new Course("GO", "cid5", 128);
        f4.writeFile(c1);
        f4.writeFile(c2);
        f4.writeFile(c3);
        f4.writeFile(c4);
        f4.writeFile(c5);

        //Schedule
        Schedule sc1 = new Schedule("C1", "cid1", "tid1", "Room1");
        Schedule sc2 = new Schedule("C2", "cid2", "tid2", "Room2");
        Schedule sc3 = new Schedule("C3", "cid3", "tid3", "Room3");
        Schedule sc4 = new Schedule("C4", "cid4", "tid4", "Room4");
        Schedule sc5 = new Schedule("C5", "cid5", "tid5", "Room5");
        f5.writeFile(sc1);
        f5.writeFile(sc2);
        f5.writeFile(sc3);
        f5.writeFile(sc4);
        f5.writeFile(sc5);

        //Electivecourse
        Electivecourse e1 = new Electivecourse("elid1", "sid1", "C1");
        Electivecourse e11 = new Electivecourse("elid11", "sid1", "C2");
        Electivecourse e12 = new Electivecourse("elid12", "sid1", "C3");
        Electivecourse e2 = new Electivecourse("elid2", "sid2", "C2");
        Electivecourse e3 = new Electivecourse("elid3", "sid3", "C3");
        Electivecourse e4 = new Electivecourse("elid4", "sid4", "C4");
        Electivecourse e5 = new Electivecourse("elid5", "sid5", "C5");
        f6.writeFile(e1);
        f6.writeFile(e2);
        f6.writeFile(e3);
        f6.writeFile(e4);
        f6.writeFile(e5);
        f6.writeFile(e11);
        f6.writeFile(e12);
    }

    public void searchALLfile(String sidin, ObservableList<TableContent> tablelist){


        coursenum=0;
        for (int i = 0; i < electivecourselist.length; i++) {
            if((electivecourselist[i])!=null&&sidin.compareToIgnoreCase(electivecourselist[i].getSid())==0){
                eleindex[coursenum++] = i;
            }
        }

        for(int j = 0; j<coursenum;j++){
            for (int i = 0; i < schedulelist.length; i++) {
                if(schedulelist[i]!=null&&(electivecourselist[eleindex[j]].getClassid()).compareToIgnoreCase(schedulelist[i].getClassid())==0){
                    schindex[j]= i;
                }
            }
        }

        for(int j = 0; j<coursenum;j++){
            for (int i = 0; i < courselist.length; i++) {
                if(courselist[i]!=null&&(schedulelist[schindex[j]].getCid()).compareToIgnoreCase(courselist[i].getCid())==0){
                    couindex[j]= i;
                }
            }
        }

        for(int j = 0; j<coursenum;j++){
            for (int i = 0; i < teacherlist.length; i++) {
                if(teacherlist[i]!=null&&(schedulelist[schindex[j]].getTid()).compareToIgnoreCase(teacherlist[i].getTid())==0){
                    teaindex[j]= i;
                }
            }
        }

        for(int i = 0; i<coursenum;i++){
            tablelist.add(new TableContent(courselist[couindex[i]].getCname(),teacherlist[teaindex[i]].getName(),schedulelist[schindex[i]].getClassroom()));
        }


    }
    public void readALLfile() throws IOException, ClassNotFoundException {
        //Read
        f2.readFile(studentlist);
        f3.readFile(teacherlist);
        f4.readFile(courselist);
        f5.readFile(schedulelist);
        f6.readFile(electivecourselist);
    }

//    public static void main(String[] args) throws IOException, ClassNotFoundException { // Declare and Construct an instance of the Circle class
//
//        Scanner in = new Scanner(System.in);
//        String sidin =in.nextLine();
//
//        Search search=new Search();
//        search.writeALLfile();
//        search.readALLfile();
//        search.searchALLfile(sidin,tablelist);
//
//        for(int i = 0 ;i<coursenum;i++)
//            System.out.println("Sid : "+sidin+", Classname : "+courselist[couindex[i]].getCname()+", Teachername : "+teacherlist[teaindex[i]].getName()+", Classroom : "+schedulelist[schindex[i]].getClassroom());
//        }





}
