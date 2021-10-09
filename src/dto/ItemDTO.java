package dto;

public class ItemDTO {
    private String itemID;
    private String itemName;
    private String itemQty;

    public ItemDTO() {
    }

    public ItemDTO(String itemID, String itemName, String itemQty) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemQty = itemQty;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemQty() {
        return itemQty;
    }

    public void setItemQty(String itemQty) {
        this.itemQty = itemQty;
    }
}
