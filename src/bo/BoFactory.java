package bo;

import bo.custom.impl.CustomerBOImpl;
import bo.custom.impl.ItemBOImpl;

public class BoFactory {
    private static BoFactory boFactory;

    private BoFactory() {
    }

    public static BoFactory getInstance() {
        if (null == boFactory) {
            boFactory = new BoFactory();
        }
        return boFactory;
    }

    public enum BoType {
       CUSTOMER,ITEM
    }

    public <T> T getBo(BoType type) {
        switch (type) {

            case CUSTOMER:
                return (T) new CustomerBOImpl();

            case ITEM:
                return (T) new ItemBOImpl();
            default:
                return null;
        }

    }
}
