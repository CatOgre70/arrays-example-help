public class Strange {

    String name;
    int value;

    public Strange(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
