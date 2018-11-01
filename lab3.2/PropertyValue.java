import java.util.function.Function;

class PropertyValue<T> {
    String value;

    public PropertyValue(String value) {
        this.value = value;
    }
    public PropertyValue(PropertyValue value) {
        this.value = value.value;
    }

    protected T getProperty(Function<String, T> converter) {
        return converter.apply(value);
    }
}

enum Type {
    INTEGER,
    DOUBLE,
    STRING
}