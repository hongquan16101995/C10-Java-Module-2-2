package bai17.io_binary_stream_Collection;

import java.io.*;
import java.util.ArrayList;

public class MyFile {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(-1);
        integers.add(3);
        integers.add(4);

        FileOutputStream fileOutputStream = new FileOutputStream("src/bai16/demoFile.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        for (Integer i : integers) {
            dataOutputStream.writeInt(i);
        }
        dataOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("src/bai16/demoFile.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        try {
            Integer line;
            while ((line = dataInputStream.readInt()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println();
        }
    }
}
