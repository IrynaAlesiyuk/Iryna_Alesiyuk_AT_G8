package homework.day9;

import homework.day8.someClasses.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubblesRunner11 {
    public static void main(String[] args) {
        //Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5)
        // и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        //В потоке данных отфельтровать только те пузыри, обьем которых больше 3
        System.out.println("Пузыри, обьем которых больше 3");
        bubbles.stream().filter(el -> el.getVolume() > 3).forEach(System.out::println);

        //Отсортировать данные по имени в восходящем порядке
        System.out.println("Отсортировать данные по имени в восходящем порядке");
        bubbles.stream().sorted(Comparator.comparing(Bubble::getName)).forEach(System.out::println);

        //На основании существующего потока данных создать новый, в котором каждый новый Bubble имеет
        // обьем в 3 раза больше исходного
        System.out.println("обьем в 3 раза:");
        List<Bubble> bubbleWithNewVolume = bubbles.stream()
                .map(bubble -> new Bubble(bubble.getVolume() * 3, bubble.getName())).toList();
        bubbleWithNewVolume.forEach(System.out::println);

        //Вычислить сумму конечного обьема всех пузырей и отпечатать в консоль
        System.out.println("Sum of volume:");
        int sumOfVolume = bubbleWithNewVolume.stream().mapToInt(Bubble::getVolume).sum();
        System.out.println(sumOfVolume);
    }
}
