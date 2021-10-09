package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainFormController {

    public JFXButton btnCustomer;
    public JFXButton btnItem;
    public AnchorPane MainAnchor;


    public void initialize(){
        try {
            MainAnchor.getChildren().clear();
            AnchorPane load = FXMLLoader.load(this.getClass().getResource("/view/CustomerForm.fxml"));
            MainAnchor.getChildren().addAll(load.getChildren());
        }catch (Exception e){

        }
    }

    public void btnCustomerOnAction(ActionEvent actionEvent) {
        try {
            MainAnchor.getChildren().clear();
            AnchorPane load = FXMLLoader.load(this.getClass().getResource("/view/CustomerForm.fxml"));
            MainAnchor.getChildren().addAll(load.getChildren());
        }catch (Exception e){

        }
    }

    public void btnItemOnAction(ActionEvent actionEvent) {
        try {
            MainAnchor.getChildren().clear();
            AnchorPane load = FXMLLoader.load(this.getClass().getResource("/view/ItemForm.fxml"));
            MainAnchor.getChildren().addAll(load.getChildren());
        }catch (Exception e){

        }
    }
}
