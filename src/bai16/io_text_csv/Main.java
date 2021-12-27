package bai16.io_text_csv;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       String pathName = "src/bai16/io_text_csv/textAnimal.csv";
       ArrayList<Animal> animals = new ArrayList<>();
       animals.add(new Animal(1,"Dog", 2));
       animals.add(new Animal(2,"Cat", 1));

       writeFile(animals, pathName);
       readFile(pathName);
    }

    public static void writeFile(ArrayList<Animal> animals, String pathName) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
            for (Animal animal : animals) {
                bufferedWriter.write(animal.getId() + "," + animal.getName() + "," + animal.getAge() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String pathName) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(pathName));

            while ((line = br.readLine()) != null) {
                String[] strings = line.split(",");
                System.out.println(strings[0] + "," + '"' + strings[1] + '"' + "," + '"' + strings[2]+ '"');
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
