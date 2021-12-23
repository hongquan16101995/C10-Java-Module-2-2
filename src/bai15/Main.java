package bai15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        Test.testException2();
//        try {
//            Test.testException();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
        try {
            File file = new File("text.txt");
            FileReader fileReader = new FileReader(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        String a = "abc";
//        int b = Integer.parseInt(a);
//        System.out.println(b);
    }

    public static class Test {
        static void testException() throws IOException {
            throw new IOException("Lỗi để xử lý");
        }

        static void testException2() {
            try {
                throw new IOException("Lỗi đã xử lý");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
