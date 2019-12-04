package model;

public class Teacher extends Person {
    private String tid;
    private String title;


    public Teacher(){
    }

    public Teacher(String tid, String name, String sex, int age, String title){
        super(name, sex, age);
        this.tid=tid;
        this.title=title;
    }


    public String getTid() {
        return tid;
    }

    public String getTitle() {
        return title;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display(){
        System.out.println("Tid is "+tid+", Name is "+name+", Sex is "+sex+", Age is "+age+", Title is "+title+".");
    }
}
