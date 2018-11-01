class DoublePropertyValue extends PropertyValue implements PropertyValueInterface<Double> {
    public DoublePropertyValue(String value) {
        super(value);
    }

    public DoublePropertyValue(PropertyValue property) throws Exception {
        super(property);
        try {
            Integer.parseInt(property.value);
        }
        catch (Exception e){
            throw new Exception("value parse error (Double)");
        }
    }

    public Double getProperty() {
        return Double.parseDouble(value);
    }
}

