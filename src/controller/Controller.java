package controller;

/**
 * Sample Skeleton for 'view.fxml' Controller Class
 */


import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.*;
import model.TableContent;

import javax.xml.catalog.CatalogException;

public class Controller extends Search {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="write"
    private Button write; // Value injected by FXMLLoader

    @FXML // fx:id="read"
    private Button read; // Value injected by FXMLLoader

    @FXML // fx:id="table"
    private TableView<TableContent> table; // Value injected by FXMLLoader

    @FXML // fx:id="cname"
    private TableColumn<TableContent, String> cname; // Value injected by FXMLLoader

    @FXML // fx:id="name"
    private TableColumn<TableContent, String> name; // Value injected by FXMLLoader

    @FXML // fx:id="classroom"
    private TableColumn<TableContent, String> classroom; // Value injected by FXMLLoader

    @FXML // fx:id="submit"
    private Button submit; // Value injected by FXMLLoader

    @FXML // fx:id="input"
    private TextField input; // Value injected by FXMLLoader

    @FXML // fx:id="wstudent"
    private Button wstudent; // Value injected by FXMLLoader

    @FXML // fx:id="instudent"
    private TextField instudent; // Value injected by FXMLLoader

    @FXML // fx:id="incourse"
    private TextField incourse; // Value injected by FXMLLoader

    @FXML // fx:id="inteacher"
    private TextField inteacher; // Value injected by FXMLLoader

    @FXML // fx:id="inschedule"
    private TextField inschedule; // Value injected by FXMLLoader

    @FXML // fx:id="inelect"
    private TextField inelect; // Value injected by FXMLLoader

    @FXML // fx:id="wteacher"
    private Button wteacher; // Value injected by FXMLLoader

    @FXML // fx:id="wcourse"
    private Button wcourse; // Value injected by FXMLLoader

    @FXML // fx:id="wschedule"
    private Button wschedule; // Value injected by FXMLLoader

    @FXML // fx:id="welect"
    private Button welect; // Value injected by FXMLLoader

    final ObservableList<TableContent> tablelist = FXCollections.observableArrayList();//表格数据

    public String sidin;
    public String studentin;
    public String teacherin;
    public String coursein;
    public String schedulein;
    public String electin;

    public Controller() throws IOException {
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert write != null : "fx:id=\"write\" was not injected: check your FXML file 'view.fxml'.";
        assert read != null : "fx:id=\"read\" was not injected: check your FXML file 'view.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'view.fxml'.";
        assert cname != null : "fx:id=\"cname\" was not injected: check your FXML file 'view.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'view.fxml'.";
        assert classroom != null : "fx:id=\"classroom\" was not injected: check your FXML file 'view.fxml'.";
        assert submit != null : "fx:id=\"submit\" was not injected: check your FXML file 'view.fxml'.";
        assert input != null : "fx:id=\"input\" was not injected: check your FXML file 'view.fxml'.";
        assert wstudent != null : "fx:id=\"wstudent\" was not injected: check your FXML file 'view.fxml'.";
        assert instudent != null : "fx:id=\"instudent\" was not injected: check your FXML file 'view.fxml'.";
        assert incourse != null : "fx:id=\"incourse\" was not injected: check your FXML file 'view.fxml'.";
        assert inteacher != null : "fx:id=\"inteacher\" was not injected: check your FXML file 'view.fxml'.";
        assert inschedule != null : "fx:id=\"inschedule\" was not injected: check your FXML file 'view.fxml'.";
        assert inelect != null : "fx:id=\"inelect\" was not injected: check your FXML file 'view.fxml'.";
        assert wteacher != null : "fx:id=\"wteacher\" was not injected: check your FXML file 'view.fxml'.";
        assert wcourse != null : "fx:id=\"wcourse\" was not injected: check your FXML file 'view.fxml'.";
        assert wschedule != null : "fx:id=\"wschedule\" was not injected: check your FXML file 'view.fxml'.";
        assert welect != null : "fx:id=\"welect\" was not injected: check your FXML file 'view.fxml'.";
        cname.setCellValueFactory(cellData -> cellData.getValue().CourseNameProperty());
        name.setCellValueFactory(cellData -> cellData.getValue().TeacherNameProperty());
        classroom.setCellValueFactory(cellData -> cellData.getValue().ClassroomProperty());
        table.setItems(tablelist);
    }

    public void readbutton() throws IOException, ClassNotFoundException {
        //Search search=new Search();
        readALLfile();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Read successfully");
        alert.setHeaderText("Read successfully");
        alert.setContentText(null);
        alert.showAndWait();
    }

    public void writebutton() throws IOException {
        //Scanner in = new Scanner(System.in);
        //String sidin =in.nextLine();
        //Search search=new Search();
        writeALLfile();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Write successfully");
        alert.setHeaderText("Write successfully");
        alert.setContentText(null);
        alert.showAndWait();
    }

    public void submitbutton(){
        table.getItems().clear();
        sidin = input.getText();
        searchALLfile(sidin,tablelist);
    }

    public void wstudent(){
        try{
        studentin=instudent.getText();
        String[] arr=studentin.split("[;]");
        Student newstudent=new Student(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),arr[4]);
        f2.writeFile(newstudent);
        instudent.clear();
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Input!");
            alert.setHeaderText("Error Input!");
            alert.setContentText(" Expected->Student:sid;name;sex;age;major");
            alert.showAndWait();
        }
    }

    public void wteacher(){
        teacherin=inteacher.getText();
        try{
            String[] arr=teacherin.split("[;]");
            Teacher newteacher=new Teacher(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),arr[4]);
            f3.writeFile(newteacher);
            inteacher.clear();
        } catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Input!");
            alert.setHeaderText("Error Input!");
            alert.setContentText(" Expected->Teacher:tid;name;sex;age;title");
            alert.showAndWait();
        }

    }
    public void wcourse(){
        try{
        coursein=incourse.getText();
        String[] arr=coursein.split("[;]");
        Course newcourse=new Course(arr[0],arr[1],Integer.parseInt(arr[2]));
        f4.writeFile(newcourse);
        incourse.clear();
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Input!");
            alert.setHeaderText("Error Input!");
            alert.setContentText(" Expected->Course:cname;cid;chour");
            alert.showAndWait();
        }
    }
    public void wschedule(){
        try{
        schedulein=inschedule.getText();
        String[] arr=schedulein.split("[;]");
        Schedule newschedule=new Schedule(arr[0],arr[1],arr[2],arr[3]);
        f5.writeFile(newschedule);
        inschedule.clear();
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Input!");
            alert.setHeaderText("Error Input!");
            alert.setContentText(" Expected->Schedule:classid;cid;tid;classroom");
            alert.showAndWait();
        }
    }
    public void welect(){
        try{
        electin=inelect.getText();
        String[] arr=electin.split("[;]");
        Electivecourse newelect=new Electivecourse(arr[0],arr[1],arr[2]);
        f6.writeFile(newelect);
        inelect.clear();
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Input!");
            alert.setHeaderText("Error Input!");
            alert.setContentText(" Expected->Electivecourse:elid;sid;classid");
            alert.showAndWait();
        }
    }

}
