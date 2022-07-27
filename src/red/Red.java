package red;

public class Red {
    private String name;
    private OpenMode method;

    public Red() {
    }

    public Red(String name, OpenMode method) {
        this.name = name;
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkMethod() {
        this.method.whichOne();
    }

    public void setMethod(OpenMode method) {
        this.method = method;
    }
}
