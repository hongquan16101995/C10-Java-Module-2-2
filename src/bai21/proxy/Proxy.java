package bai21.proxy;

public class Proxy implements User{
    private final String role;
    private final UserImpl userImpl;

    public Proxy(String name, String role) {
        userImpl = new UserImpl(name);
        this.role = role;
    }

    @Override
    public void load() {
        userImpl.load();
    }

    @Override
    public void insert() {
        if (isAdmin()) {
            userImpl.insert();
        } else {
            throw new IllegalAccessError("Access denied");
        }
    }

    private boolean isAdmin() {
        return "admin".equalsIgnoreCase(this.role);
    }
}
