package com.example.mvcdemo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public ListView<Student> listView;

    private HelloModel model;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = new HelloModel();
        listView.setItems(model.getStudents());
    }

    @FXML
    protected void onHelloButtonClick() {
        Platform.exit();
    }
}