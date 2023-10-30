package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.List;

public class TaskTen {
    public static void main(String[] args) {
        //Создать пустой список стрингов noodles (через new ArrayList)
        List<String> noodles = new ArrayList<>();

        //Добавить в список 4 вида макарон (стринги Hakka, Ramen, Hibachi, Schezwan)
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        //Проитерировать список через for-each и отпечатать слова в консоль через тире
        for (String noodle : noodles) {
            System.out.print(noodle);
            if (noodles.indexOf(noodle) < noodles.size() - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();

        //Заменить в каждом слове буквы "а" на букву "о"
        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replace("a", "o"));
            System.out.print(noodles.get(i) + " ");
        }
    }
}
