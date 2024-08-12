package prototype;

public class PrototypeInstance implements Prototype{

    private String field;

    public PrototypeInstance(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        return new PrototypeInstance(field);
    }
}
