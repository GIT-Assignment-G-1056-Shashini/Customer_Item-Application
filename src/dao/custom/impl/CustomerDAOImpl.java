package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.CustomerDAO;
import entity.Customer;

import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean save(Customer customer) throws Exception {
         return CrudUtil.execute("INSERT INTO customer VALUES(?,?,?,?)", customer.getCustomerID(), customer.getCustomerName(),
                 customer.getCustomerAddress(),customer.getCustomerMobile());

    }

    @Override
    public boolean update(Customer customer) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public Customer get(String s) throws Exception {
        return null;
    }

    @Override
    public List<Customer> getAll() throws Exception {
        return null;
    }
}
