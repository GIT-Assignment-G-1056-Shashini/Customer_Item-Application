package bo;

import bo.custom.impl.CustomerBOImpl;

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
       CUSTOMER
    }

    public <T> T getBo(BoType type) {
        switch (type) {

            case CUSTOMER:
                return (T) new CustomerBOImpl();
            default:
                return null;
        }

    }
}
