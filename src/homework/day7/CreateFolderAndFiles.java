package homework.day7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateFolderAndFiles {
    public static final String BASE_DIRECTORY = "D:\\study\\Test_Automation\\Шидловский\\";

    public static void main(String[] args) throws IOException {
        createDirectories(BASE_DIRECTORY, "folder1", "folder2", "folder3", "folder4");
        createFile(BASE_DIRECTORY, "folder1", "folder2", "folder3", "folder4", "file1.txt");
        createFile(BASE_DIRECTORY, "folder1", "folder2", "folder3", "folder4", "file2.txt");
        addInteger(10, BASE_DIRECTORY, "folder1", "folder2", "folder3", "folder4", "file1.txt");
        addInteger(10, BASE_DIRECTORY, "folder1", "folder2", "folder3", "folder4", "file2.txt");
    }

    public static void createDirectories(String baseDirectory, String folder1, String folder2, String folder3, String folder4) {
        File directory = new File(baseDirectory + folder1 + "\\" + folder2 + "\\" + folder3 + "\\" + folder4 + "\\");
        directory.mkdirs();
    }

    public static void createFile(String baseDirectory, String folder1, String folder2, String folder3, String folder4, String fileName) throws IOException {
        File file = new File(baseDirectory + folder1 + "\\" + folder2 + "\\" + folder3 + "\\" + folder4 + "\\" + fileName);
        file.createNewFile();
    }

    public static void addInteger(int numberOfInt, String baseDirectory, String folder1, String folder2, String folder3, String folder4, String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(baseDirectory + folder1 + "\\" + folder2 + "\\" + folder3 + "\\" + folder4 + "\\" + fileName));
        for (int i = 1; i <= numberOfInt; i++) {
            out.write(String.valueOf(new Random().nextInt()));
            out.write(" ");
        }
        out.close();
    }

}
