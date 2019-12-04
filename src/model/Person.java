package model;


import java.io.Serializable;

public class Person implements Serializable {
    protected String name;
    protected String sex;
    protected int age;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person(){
    }

    public Person(String name, String sex, int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("Name is "+name+", Sex is "+sex+", Age is "+age+".");
    }


}



