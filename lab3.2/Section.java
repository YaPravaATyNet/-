import java.util.HashMap;

public class Section {
    private String name;
    private HashMap<String, PropertyValue> properties = new HashMap<>();

    public Section(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProperty(String key, PropertyValue value) {
       // System.err.println(key + " " + value);
        properties.put(key, value);
    }

    public PropertyValue getProperty(String key) throws Exception {
        if (properties.get(key) == null)
            throw new Exception("No such name");
        return properties.get(key);
    }
}
