package model;

import java.io.*;

public class Myfile {
    private File opfile;

    public File getOpfile(){
        return opfile;
    }


    //Person
    void readFile(Person[] personlist) throws ClassNotFoundException, IOException {
        //创建序列化流对象
        int i=0;
        try{
            //创建序列化流对象
            FileInputStream fis = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            //读取
            Object obj =null;
            while(fis.available()>0) {
                ois = new ObjectInputStream(fis);
                obj=ois.readObject();
                personlist[i++]=(Person)obj;
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(Person person) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {
            os.writeObject(person);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Student
    void readFile(Student[] studentlist) throws ClassNotFoundException, IOException {
        //创建序列化流对象
        int i=0;
        try{
            //创建序列化流对象
            FileInputStream fis = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            //读取
            Object obj =null;
            while(fis.available()>0) {
                ois = new ObjectInputStream(fis);
                obj=ois.readObject();
                studentlist[i++]=(Student) obj;
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(Student student) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {
            os.writeObject(student);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Teacher
    void readFile(Teacher[] teacherlist) throws ClassNotFoundException, IOException {
        //创建序列化流对象
        int i=0;
        try{
            //创建序列化流对象
            FileInputStream fis = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            //读取
            Object obj =null;
            while(fis.available()>0) {
                ois = new ObjectInputStream(fis);
                obj=ois.readObject();
                teacherlist[i++]=(Teacher) obj;
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(Teacher teacher) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {
            os.writeObject(teacher);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Course
    void readFile(Course[] courselist) throws ClassNotFoundException, IOException {
        //创建序列化流对象
        int i=0;
        try{
            //创建序列化流对象
            FileInputStream fis = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            //读取
            Object obj =null;
            while(fis.available()>0) {
                ois = new ObjectInputStream(fis);
                obj=ois.readObject();
                courselist[i++]=(Course) obj;
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(Course course) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {
            os.writeObject(course);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Schedule
    void readFile(Schedule[] schedulelist) throws ClassNotFoundException, IOException {
        //创建序列化流对象
        int i=0;
        try{
            //创建序列化流对象
            FileInputStream fis = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            //读取
            Object obj =null;
            while(fis.available()>0) {
                ois = new ObjectInputStream(fis);
                obj=ois.readObject();
                schedulelist[i++]=(Schedule) obj;
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(Schedule schedule) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {
            os.writeObject(schedule);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Electivecourse
    void readFile(Electivecourse[] electivecourselist) throws ClassNotFoundException, IOException {
        //创建序列化流对象
        int i=0;
        try{
            //创建序列化流对象
            FileInputStream fis = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            //读取
            Object obj =null;
            while(fis.available()>0) {
                ois = new ObjectInputStream(fis);
                obj=ois.readObject();
                electivecourselist[i++]=(Electivecourse) obj;
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(Electivecourse electivecourse) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {
            os.writeObject(electivecourse);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //构造方法
    public Myfile(File opfile) throws IOException {
        if (opfile.createNewFile()) {
            this.opfile=opfile;
            System.out.println("New File is created!");
        } else {
            this.opfile=opfile;
            System.out.println("File already exists.");
        }

    }


}
