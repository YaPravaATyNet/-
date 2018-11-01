import java.io.*;
import java.util.ArrayList;


public class File {
    private ArrayList<Section> sections = new ArrayList<>();

    public File(ArrayList<Section> sections) {
        this.sections = sections;
    }

    public static File parse(BufferedReader br) throws Exception {
        ArrayList<Section> newSections = new ArrayList<>();
        String current = "";
        Section currentSection = null;
        for (current = br.readLine(); current != null; current = br.readLine()) {
            current = current.split(";")[0];
            if (current.equals(""))
                continue;
            if (current.charAt(0) == '[') {
                currentSection = new Section(current.substring(1, current.length() - 1));
                newSections.add(currentSection);
            } else {
                String left, right;
                left = current.split("=")[0].trim();
                right = current.split("=")[1].trim();
                currentSection.addProperty(left, new PropertyValue(right));
            }
        }
        return new File(newSections);
    }

    public PropertyValue getProperty(String sectionName, String propertyKey, Type type) throws Exception {
        for (Section section : sections) {
            if (section.getName().equals(sectionName)) {
                if (type == Type.INTEGER)
                    return new IntPropertyValue(section.getProperty(propertyKey));
                if (type == Type.DOUBLE)
                    return  new DoublePropertyValue(section.getProperty(propertyKey));
                if (type == Type.STRING)
                    return  new StringPropertyValue(section.getProperty(propertyKey));
            }
        }
        throw new Exception("No such section");
    }
}
