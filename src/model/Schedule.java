package model;

import java.io.Serializable;

public class Schedule implements Serializable {


    private String classid;
    private String cid;
    private String tid;
    private String classroom;


    public String getClassid() {
        return classid;
    }

    public String getCid() {
        return cid;
    }

    public String getTid() {
        return tid;
    }

    public String getClassroom() {
        return classroom;
    }

    public Schedule(){
    }

    public Schedule(String classid, String cid, String tid, String classroom){
        this.classid=classid;
        this.cid=cid;
        this.tid=tid;
        this.classroom=classroom;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }


    public void display(){
        System.out.println("Classid is "+classid+", Cid is "+cid+", Tid is "+tid+", Classroom is "+classroom+".");
    }

}
