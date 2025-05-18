import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, file handling in Java!");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
