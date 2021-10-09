package dao.custom.impl;

import bo.custom.impl.ItemBOImpl;
import dao.CrudUtil;
import dao.custom.CustomerDAO;
import dao.custom.ItemDAO;
import entity.Customer;
import entity.Item;

import java.util.List;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public boolean save(Item item) throws Exception {
         return CrudUtil.execute("INSERT INTO item VALUES(?,?,?)",item.getItemID(),item.getItemName(),item.getItemQty() );

    }

    @Override
    public boolean update(Item item) throws Exception {
        return false;
    }


    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public Item get(String s) throws Exception {
        return null;
    }

    @Override
    public List<Item> getAll() throws Exception {
        return null;
    }
}
