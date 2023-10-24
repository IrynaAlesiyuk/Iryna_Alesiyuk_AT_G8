package homework.day7;

import java.io.File;

public class FileAndFolderList {

    public static String[] returnListOfFilesAndFolders(String path) {
        File directory = new File(path);
        String[] fileAndFolderArray = directory.list();
        for (String name : fileAndFolderArray) {
            System.out.println(name);
        }
        return fileAndFolderArray;
    }

    public static void verifyFilesAndFolders(String[] fileAndFolderArray, String directoryPath) {
        for (int i = 0; i < fileAndFolderArray.length; i++) {

            if (new File(directoryPath + "\\" + fileAndFolderArray[i]).isDirectory()) {
                System.out.println("It is directory: " + fileAndFolderArray[i]);
            } else if (new File(directoryPath + "\\" + fileAndFolderArray[i]).isFile()) {
                System.out.println("It is file: " + fileAndFolderArray[i]);
            }
        }

    }

}
