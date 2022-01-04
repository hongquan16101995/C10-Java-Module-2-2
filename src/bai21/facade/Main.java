package bai21.facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = Facade.getInstance();
        facade.shippingWithStandardAndCar("Quân");
        facade.shippingWithSuperAnd3Wheeler("Toàn");
    }
}
