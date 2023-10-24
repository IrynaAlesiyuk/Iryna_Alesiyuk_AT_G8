package homework.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInFile {

    public static void countWordsInFile(String filePath) throws IOException {
        String allSymbols = "[,.?!:;-()[]{}]";
        char[] allSymbolsChar = allSymbols.toCharArray();

        BufferedReader in = new BufferedReader(new FileReader(filePath));
        String line;
        int counter = 0;
        int countOfWords = 0;
        while ((line = in.readLine()) != null) {
            char[] charFromLine = line.toCharArray();
            for (int i = 0; i < charFromLine.length; i++) {
                for (int j = 0; j < allSymbolsChar.length; j++) {
                    if (charFromLine[i] == allSymbolsChar[j]) {
                        counter++;
                        break;
                    }
                }
            }
            countOfWords = countOfWords + line.split(" ").length;
        }
        System.out.println("Количество знаков препинания: " + counter);
        System.out.println("Количество слов: " + countOfWords);

        in.close();
    }
}
