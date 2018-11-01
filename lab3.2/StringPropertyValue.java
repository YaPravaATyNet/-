class StringPropertyValue extends PropertyValue implements PropertyValueInterface<String> {
    public StringPropertyValue(String value) {
        super(value);
    }

    public StringPropertyValue(PropertyValue property) {
        super(property);
    }

    public String getProperty() {
        return value;
    }
}