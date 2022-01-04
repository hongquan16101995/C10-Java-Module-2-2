package bai21.proxy;

public class UserImpl implements User{
    private String name;

    public UserImpl(String name) {
        this.name = name;
    }

    @Override
    public void load() {
        System.out.println(name + " loading");
    }

    @Override
    public void insert() {
        System.out.println(name + " inserting");
        System.out.println("Hello " + name);
    }
}
