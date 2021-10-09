package bo.custom.impl;

import bo.custom.CustomerBO;
import dao.DaoFactory;
import dao.custom.CustomerDAO;
import dto.CustomerDTO;
import entity.Customer;

import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    private CustomerDAO customerDAO= DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);

    @Override
    public boolean saveCustomer(CustomerDTO dto) throws Exception {
        return customerDAO.save(new Customer(dto.getCustomerID(),dto.getCustomerName(),dto.getCustomerAddress(),dto.getCustomerMobile()));
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) throws Exception {
        return false;
    }

    @Override
    public CustomerDTO getCustomer(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws Exception {
        return null;
    }

    @Override
    public String getLastCustomerID() throws Exception {
        return null;
    }

    @Override
    public CustomerDTO getCustomerInTP(int tp) throws Exception {
        return null;
    }
}
