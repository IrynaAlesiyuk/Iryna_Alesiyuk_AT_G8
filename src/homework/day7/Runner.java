package homework.day7;

import java.io.IOException;

import static homework.day7.CountWordsInFile.countWordsInFile;
import static homework.day7.FileAndFolderList.returnListOfFilesAndFolders;
import static homework.day7.FileAndFolderList.verifyFilesAndFolders;

public class Runner {
    public static final String PATH = "D:\\study\\Test_Automation";
    public static final String PATH_TO_FILE = "D:\\study\\Test_Automation";

    public static void main(String[] args) throws IOException {
        verifyFilesAndFolders(returnListOfFilesAndFolders(PATH), PATH);
        countWordsInFile(PATH_TO_FILE);


    }
}
