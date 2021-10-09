package bo.custom.impl;

import bo.custom.ItemBO;
import dao.DaoFactory;
import dao.custom.ItemDAO;
import dto.ItemDTO;
import entity.Item;

import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {
    private ItemDAO itemDAO= DaoFactory.getInstance().getDao(DaoFactory.DaoType.ITEM);

    @Override
    public boolean saveItem(ItemDTO dto) throws Exception {
        return itemDAO.save(new Item(dto.getItemID(),dto.getItemName(),dto.getItemQty()));
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteItem(String id) throws Exception {
        return false;
    }

    @Override
    public ItemDTO getItem(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ItemDTO> getAllItem() throws Exception {
        return null;
    }


}
