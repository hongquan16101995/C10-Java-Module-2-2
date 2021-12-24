package bai16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOFile {
    public static void main(String[] args) {
//        writeFile();
        readFile();
    }

    public static void writeFile() {
        String str = "File Handling in Java using FileWriter and FileReader";
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            for (int i = 0; i < str.length(); i++)
                fileWriter.write(str.charAt(i));
            System.out.println("Writing successful");
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Có lỗi");
        }
    }

    public static void readFile() {
        try {
            int ch;
            FileReader fileReader = null;
            try {
                fileReader = new FileReader("output.txt");
            } catch (FileNotFoundException fe) {
                System.err.println("File not found");
            }
            while (true) {
                assert fileReader != null;
                if ((ch = fileReader.read()) == -1) {
                    break;
                }
                System.out.print((char) ch);
            }
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Có lỗi");
        }
    }
}
