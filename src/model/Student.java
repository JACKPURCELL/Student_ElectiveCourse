package model;

public class Student extends Person {
    private String sid;
    private String major;


    public Student(){
    }

    public Student(String sid, String name, String sex, int age, String major){
        super(name, sex, age);
        this.sid=sid;
        this.major=major;
    }


    public String getSid() {
        return sid;
    }

    public String getMajor() {
        return major;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void display(){
        System.out.println("Sid is "+sid+", Name is "+name+", Sex is "+sex+", Age is "+age+", Major is "+major+".");
    }
}
