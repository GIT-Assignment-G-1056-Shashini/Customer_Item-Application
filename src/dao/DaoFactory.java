package dao;

import dao.custom.impl.CustomerDAOImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }
    public static DaoFactory getInstance() {
        if(null==daoFactory){
            daoFactory=new DaoFactory();
        }return daoFactory;
    }

    public enum DaoType{
        CUSTOMER,ITEM
    }

    public <T extends SuperDAO> T getDao(DaoType type){
        switch (type){

            case CUSTOMER:
                return (T) new CustomerDAOImpl();


            default:
                return null;
        }

    }
}
