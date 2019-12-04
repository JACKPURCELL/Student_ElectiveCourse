package controller;

/**
 * Sample Skeleton for 'view.fxml' Controller Class
 */


import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.*;
import model.TableContent;

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

    final ObservableList<TableContent> tablelist = FXCollections.observableArrayList();//表格数据

    public String sidin;

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
        cname.setCellValueFactory(cellData -> cellData.getValue().CourseNameProperty());
        name.setCellValueFactory(cellData -> cellData.getValue().TeacherNameProperty());
        classroom.setCellValueFactory(cellData -> cellData.getValue().ClassroomProperty());
        table.setItems(tablelist);
    }

    public void readbutton() throws IOException, ClassNotFoundException {
        //Search search=new Search();
        readALLfile();
    }

    public void writebutton() throws IOException {
        //Scanner in = new Scanner(System.in);
        //String sidin =in.nextLine();
        //Search search=new Search();
        writeALLfile();
    }


    public void submitbutton(){
        table.getItems().clear();
        sidin = input.getText();
        searchALLfile(sidin,tablelist);
    }



}
