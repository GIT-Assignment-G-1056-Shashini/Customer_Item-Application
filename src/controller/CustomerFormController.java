package controller;

import bo.BoFactory;
import bo.custom.CustomerBO;
import com.jfoenix.controls.JFXButton;
import dto.CustomerDTO;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class CustomerFormController {
    public TextField txtCustomerId;
    public TextField txtCustomerName;
    public TextField txtCustomerAddress;
    public TextField txtCustomerMobile;
    public JFXButton btnSaveCustomer;
    CustomerBO customerBO = BoFactory.getInstance().getBo(BoFactory.BoType.CUSTOMER);

    public void btnSaveCustomerOnAction(ActionEvent actionEvent) {
        CustomerDTO customerDTO = new CustomerDTO(txtCustomerId.getText(),
                txtCustomerName.getText(),
                txtCustomerAddress.getText(),
                Integer.parseInt(txtCustomerMobile.getText())
        );
        try {
            if (customerBO.saveCustomer(customerDTO)) {
                new Alert(Alert.AlertType.CONFIRMATION, "Saved!").show();

            } else {
                new Alert(Alert.AlertType.ERROR, "Failed!").show();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
