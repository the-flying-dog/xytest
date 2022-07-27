package group;

public class people {
    private String name;
    private int money;

    public int getMoney() {
        return money;
    }

    public people(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public people() {
    }

    public people(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
