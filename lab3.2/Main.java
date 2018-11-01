import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\Бред униерситетский\\ООП\\lab3.2\\src\\file.ini"));
            File parsedFile = File.parse(br);
            IntPropertyValue v = (IntPropertyValue)parsedFile.getProperty("COMMON", "LogXML", Type.INTEGER);
            System.out.println(v.getProperty());
        } catch (Exception e) {
            //e.printStackTrace();
            System.err.println(e.toString());
            System.exit(1);
        }
    }
}
