package model;

import java.io.Serializable;

public class Course implements Serializable {

    private String cname;
    private String cid;
    private int chour;

    public String getCname() {
        return cname;
    }

    public String getCid() {
        return cid;
    }

    public int getChour() {
        return chour;
    }

    public Course(){
    }

    public Course(String cname, String cid, int chour){
        this.cname=cname;
        this.cid=cid;
        this.chour=chour;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setChour(int chour) {
        this.chour = chour;
    }

    public void display(){
        System.out.println("Cname is "+cname+", Cid is "+cid+", Chour is "+chour+".");
    }

}
