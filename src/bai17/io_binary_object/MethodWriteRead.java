package bai17.io_binary_object;

import java.io.*;
import java.util.ArrayList;

public class MethodWriteRead {
    public static void main(String[] args) {
        String pathName = "src/bai17/io_binary_object/testFile";

        try {
            ArrayList<Animal> animals = readFile(pathName);
            animals.add(new Animal("abc", 12));
            animals.add(new Animal("xyz", 15));

            writeFile(animals, pathName);
            ArrayList<Animal> animals1 = readFile(pathName);
            animals1.forEach(System.out::println);
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

    public static void writeFile(ArrayList<Animal> animals, String pathName) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathName));
        objectOutputStream.writeObject(animals);
        objectOutputStream.close();
    }

    public static ArrayList<Animal> readFile(String pathName) {
        ArrayList<Animal> animals = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathName));
            animals = (ArrayList<Animal>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println();
        }
        return animals;
    }
}
