package bai16.io_binary;

import java.io.*;
import java.util.ArrayList;

public class MethodWriteRead1 {
    public static void main(String[] args) throws IOException {
        String pathName = "src/bai16/testFile1";
        File file = new File(pathName);
        if (!file.exists()) {
            file = createNewFile(pathName);
        }

        ArrayList<Animal> animals = readFile();
        animals.add(new Animal("abc", 12));
        animals.add(new Animal("xyz", 15));

        writeFile(animals);
        ArrayList<Animal> animals1 = readFile();
        animals1.forEach(System.out::println);
    }

    public static File createNewFile(String pathName) throws IOException {
        File newFile = new File(pathName);
        newFile.createNewFile();
        return newFile;
    }

    public static void writeFile(ArrayList<Animal> animals) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/bai16/testFile1"));
        objectOutputStream.writeObject(animals);
        objectOutputStream.close();
    }

    public static ArrayList<Animal> readFile() {
        ArrayList<Animal> animals = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/bai16/testFile1"));
            animals = (ArrayList<Animal>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println();
        }
        return animals;
    }
}
