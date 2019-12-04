package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TableContent {

    public TableContent(String CourseName, String TeacherName, String Classroom) {
        this.setCourseName(CourseName);
        this.setTeacherName(TeacherName);
        this.setClassroom(Classroom);
    }

    private StringProperty CourseName;  //也可以在这里直接new

    public void setCourseName(String value) {
        CourseNameProperty().set(value);
    }

    public String getCourseName() {
        return CourseNameProperty().get();
    }

    public StringProperty CourseNameProperty() {
        if (CourseName == null) CourseName = new SimpleStringProperty(this, "CourseName");
        return CourseName;
    }

    private StringProperty TeacherName;  //也可以在这里直接new

    public void setTeacherName(String value) {
        TeacherNameProperty().set(value);
    }

    public String getTeacherName() {
        return TeacherNameProperty().get();
    }

    public StringProperty TeacherNameProperty() {
        if (TeacherName == null) TeacherName = new SimpleStringProperty(this, "TeacherName");
        return TeacherName;
    }

    private StringProperty Classroom;  //也可以在这里直接new

    public void setClassroom(String value) {
        ClassroomProperty().set(value);
    }

    public String getClassroom() {
        return ClassroomProperty().get();
    }

    public StringProperty ClassroomProperty() {
        if (Classroom == null) Classroom = new SimpleStringProperty(this, "Classroom");
        return Classroom;
    }
}