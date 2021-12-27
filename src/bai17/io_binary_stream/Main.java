package bai17.io_binary_stream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        InputStream is = System.in;
//        while (true) {
//            System.out.print("Nhập 1 ký tự: ");
//            int ch = is.read();
//            if (ch == 'q') {
//                System.out.println("Finished!");
//                break;
//            }
//            is.skip(2); // Bỏ qua 2 ký tự
//            System.out.println("Ký tự nhận được: " + (char) ch);
//        }

        DataOutputStream dataOutputStream = new DataOutputStream(
                new FileOutputStream("src/bai17/io_binary_stream/binary.txt"));

        dataOutputStream.writeUTF("Quân");
        dataOutputStream.writeInt(26);
        dataOutputStream.writeUTF("Hiếu");
        dataOutputStream.writeInt(22);
        dataOutputStream.writeUTF("Quang");
        dataOutputStream.writeInt(18);
        dataOutputStream.writeUTF("Tuấn");
        dataOutputStream.writeInt(18);

        DataInputStream dataInputStream = new DataInputStream(
                new FileInputStream("src/bai17/io_binary_stream/binary.txt"));
        System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readInt());
        System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readInt());
        System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readInt());
        System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readInt());
    }
}
