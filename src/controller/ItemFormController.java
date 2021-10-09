package controller;

import bo.BoFactory;
import bo.custom.CustomerBO;
import bo.custom.ItemBO;
import com.jfoenix.controls.JFXButton;
import dto.ItemDTO;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ItemFormController {
    public TextField txtItemId;
    public TextField txtItemName;
    public JFXButton btnSaveItem;
    public TextField txtItemQty;
    ItemBO itemBO = BoFactory.getInstance().getBo(BoFactory.BoType.ITEM);

    public void btnSaveItemOnAction(ActionEvent actionEvent) {
        ItemDTO ItemDTO = new ItemDTO(txtItemId.getText(),
                txtItemName.getText(),
                txtItemQty.getText()
        );
        try {
            if (itemBO.saveItem(ItemDTO)) {
                new Alert(Alert.AlertType.CONFIRMATION, "Saved!").show();

            } else {
                new Alert(Alert.AlertType.ERROR, "Failed!").show();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
