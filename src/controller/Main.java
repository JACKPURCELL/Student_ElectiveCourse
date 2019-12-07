package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/view.fxml"));
        Scene scene = new Scene(root,635,637);//修改了
        //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);//设置不能窗口改变大小
        primaryStage.setTitle("Course Search");//设置标题
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
