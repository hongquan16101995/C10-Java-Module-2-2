package bai21.facade;

public class Facade {
    private static final Facade INSTANCE = new Facade();

    private final Transporter transporter;
    private final TransitCar transitCar;
    private final User user;

    private Facade() {
        transporter = new Transporter();
        transitCar = new TransitCar();
        user = new User();
    }

    public static Facade getInstance() {
        return INSTANCE;
    }

    public void shippingWithStandardAndCar(String name) {
        user.getAccount(name);
        transporter.shippingWithoutLoading();
        transitCar.transportWithCar();
        System.out.println("Done");
    }

    public void shippingWithSuperAnd3Wheeler(String name) {
        user.getAccount(name);
        transporter.shippingWithLoading();
        transitCar.transportWith3Wheeler();
        System.out.println("Done");
    }
}
