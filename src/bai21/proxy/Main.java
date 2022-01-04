package bai21.proxy;

public class Main {
    public static void main(String[] args) {

        Proxy proxy = new Proxy("CodeGym", "admin");
        proxy.insert();
        Proxy proxyU = new Proxy("CodeGym", "admin1");
        proxyU.insert();
    }
}
