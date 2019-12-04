package model;

import java.io.Serializable;

public class Electivecourse implements Serializable {
    private String elid;
    private String sid;
    private String classid;


    public String getElid() {
        return elid;
    }

    public String getSid() {
        return sid;
    }

    public String getClassid() {
        return classid;
    }

    public Electivecourse(){
    }

    public Electivecourse(String elid, String sid, String classid){
        this.elid=elid;
        this.sid=sid;
        this.classid=classid;
    }

    public void setElid(String elid) {
        this.elid = elid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public void display(){
        System.out.println("Elid is "+elid+", Sid is "+sid+", Classid is "+classid+".");
    }


}
