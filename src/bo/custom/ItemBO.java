package bo.custom;


import dto.ItemDTO;

import java.util.ArrayList;

public interface ItemBO {
    public boolean saveItem(ItemDTO dto) throws Exception;

    public boolean updateItem(ItemDTO dto) throws Exception;

    public boolean deleteItem(String id) throws Exception;

    public ItemDTO getItem(String id) throws Exception;

    public ArrayList<ItemDTO> getAllItem() throws Exception;


}
