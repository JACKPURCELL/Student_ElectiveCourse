//package model;
//
//import java.io.File;
//import java.io.IOException;
//
//class MyfileTest {
//    public static void main(String[] args) throws IOException, ClassNotFoundException { // Declare and Construct an instance of the Circle class
//
//        //Person
//        Myfile f1 = new Myfile(new File("Person.txt"));
//        Person[] personlist =new Person[100];
//        Person p1 = new Person("person1", "m", 15);
//        Person p2 = new Person("person2", "f", 20);
//        Person p3 = new Person("person3", "m", 15);
//        Person p4 = new Person("person4", "f", 20);
//        Person p5 = new Person("person5", "m", 15);
//        f1.writeFile(p1);
//        f1.writeFile(p2);
//        f1.writeFile(p3);
//        f1.writeFile(p4);
//        f1.writeFile(p5);
//        f1.readFile(personlist);
//        for (Person person : personlist) {
//            if(person!=null){
//                person.display();
//            }else{
//                break;
//            }
//        }
//
//        //Student
//        Myfile f2 = new Myfile(new File("Student.txt"));
//        Student[] studentlist =new Student[100];
//        Student s1 = new Student("sid1","Student1","m",15,"CS");
//        Student s2 = new Student("sid2","Student2","f",16,"EE");
//        Student s3 = new Student("sid3","Student3","m",17,"ECE");
//        Student s4 = new Student("sid4","Student4","f",18,"EE");
//        Student s5 = new Student("sid5","Student5","m",19,"CS");
//        f2.writeFile(s1);
//        f2.writeFile(s2);
//        f2.writeFile(s3);
//        f2.writeFile(s4);
//        f2.writeFile(s5);
//        f2.readFile(studentlist);
//        for (Student student : studentlist) {
//            if(student!=null){
//                student.display();
//            }else{
//                break;
//            }
//        }
//
//        //Teacher
//        Myfile f3 = new Myfile(new File("Teacher.txt"));
//        Teacher[] teacherlist =new Teacher[100];
//        Teacher t1 = new Teacher("tid1","Teacher1","m",15,"Assistant Professor");
//        Teacher t2 = new Teacher("tid2","Teacher2","f",20,"Professor");
//        Teacher t3 = new Teacher("tid3","Teacher3","m",25,"Assistant Professor");
//        Teacher t4 = new Teacher("tid4","Teacher4","f",30,"Professor");
//        Teacher t5 = new Teacher("tid5","Teacher5","m",35,"Assistant Professor");
//        f3.writeFile(t1);
//        f3.writeFile(t2);
//        f3.writeFile(t3);
//        f3.writeFile(t4);
//        f3.writeFile(t5);
//        f3.readFile(teacherlist);
//        for (Teacher teacher : teacherlist) {
//            if(teacher!=null){
//                teacher.display();
//            }else{
//                break;
//            }
//        }
//
//        //Course
//        Myfile f4 = new Myfile(new File("Course.txt"));
//        Course[] courselist =new Course[100];
//        Course c1 = new Course("JAVA","C1",8);
//        Course c2 = new Course("C","C2",16);
//        Course c3 = new Course("PYTHON","C3",32);
//        Course c4 = new Course("MATLAB","C4",64);
//        Course c5 = new Course("GO","C5",128);
//        f4.writeFile(c1);
//        f4.writeFile(c2);
//        f4.writeFile(c3);
//        f4.writeFile(c4);
//        f4.writeFile(c5);
//        f4.readFile(courselist);
//        for (Course course : courselist) {
//            if(course!=null){
//                course.display();
//            }else{
//                break;
//            }
//        }
//
//        //Schedule
//        Myfile f5 = new Myfile(new File("Schedule.txt"));
//        Schedule[] schedulelist =new Schedule[100];
//        Schedule sc1 = new Schedule("C1","cid1","tid1","Room1");
//        Schedule sc2 = new Schedule("C2","cid2","tid2","Room2");
//        Schedule sc3 = new Schedule("C3","cid3","tid3","Room3");
//        Schedule sc4 = new Schedule("C4","cid4","tid4","Room4");
//        Schedule sc5 = new Schedule("C5","cid5","tid5","Room5");
//        f5.writeFile(sc1);
//        f5.writeFile(sc2);
//        f5.writeFile(sc3);
//        f5.writeFile(sc4);
//        f5.writeFile(sc5);
//        f5.readFile(schedulelist);
//        for (Schedule schedule : schedulelist) {
//            if(schedule!=null){
//                schedule.display();
//            }else{
//                break;
//            }
//        }
//
//        //Electivecourse
//        Myfile f6 = new Myfile(new File("Electivecourse.txt"));
//        Electivecourse[] electivecourselist =new Electivecourse[100];
//        Electivecourse e1 = new Electivecourse("elid1","sid1","C1");
//        Electivecourse e2 = new Electivecourse("elid2","sid2","C2");
//        Electivecourse e3 = new Electivecourse("elid3","sid3","C3");
//        Electivecourse e4 = new Electivecourse("elid4","sid4","C4");
//        Electivecourse e5 = new Electivecourse("elid5","sid5","C5");
//        f6.writeFile(e1);
//        f6.writeFile(e2);
//        f6.writeFile(e3);
//        f6.writeFile(e4);
//        f6.writeFile(e5);
//        f6.readFile(electivecourselist);
//        for (Electivecourse electivecourse : electivecourselist) {
//            if(electivecourse!=null){
//                electivecourse.display();
//            }else{
//                break;
//            }
//        }
//
//    }
//}