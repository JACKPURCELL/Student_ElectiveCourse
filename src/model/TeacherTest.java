package model;

class TeacherTest {
    public static void main(String[] args) { // Declare and Construct an instance of the Circle class

        Teacher t1 = new Teacher("23333","Chenzheng","Male",20,"Professor");
        t1.display();


        Teacher t2 = new Teacher();
        t2.age=66;
        t2.name="Yuqinze";
        t2.sex="Male";
        t2.setTid("6666");
        t2.setTitle("Professor");

        t2.display();
    }
}