import java.util.function.Function;

class IntPropertyValue extends PropertyValue<Integer>{
    Function<String,Integer> _converter;

    public IntPropertyValue(String value) {
        super(value);
        // google java lambda
        _converter = str -> Integer.parseInt(str);
    }

    public IntPropertyValue(PropertyValue property) throws Exception {
        super(property);
        try {
            Integer.parseInt(property.value);
        }
        catch (Exception e){
            throw new Exception("value parse error (Int)");
        }
    }

    public Integer getProperty() {
        return super.getProperty(_converter);
        //return Integer.parseInt(value);
    }
}
