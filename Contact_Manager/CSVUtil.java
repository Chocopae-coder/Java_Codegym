package Contact_Manager;
import java.io.*;
import java.util.*;
public class CSVUtil {
    public static List<Contact> read(String path) {

        List<Contact> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;

            while ((line = br.readLine()) != null) {

                Contact c = Contact.fromCSV(line);
                list.add(c);
            }

        } catch (Exception e) {
            System.out.println("Lỗi đọc file");
        }

        return list;
    }

    public static void write(String path, List<Contact> list) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            for (Contact c : list) {

                bw.write(c.toCSV());
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println("Lỗi ghi file");
        }

    }

}

