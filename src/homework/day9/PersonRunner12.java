package homework.day9;

import homework.day8.someClasses.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonRunner12 {
    public static void main(String[] args) {
        //Создать поток данных people класса Person (через new Stream.of) с возрастом (32, 24, 55, 63)
        // и именами (Коля, Оля, Вася, Маша) соответственно
        List<Person> people = Arrays.asList(new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша"));

        //Отфильтровать людей, которые моложе 60
        System.out.println("Отфильтровать людей, которые моложе 60");
        List<Person> notOldpeople = people.stream().filter(el -> el.getAge() < 60).toList();

        //Отсортировать в восходящем порядке по именам
        System.out.println("Отсортировать в восходящем порядке по именам");
        List<Person> sortedPeople = notOldpeople.stream().sorted(Comparator.comparing(Person::getName)).toList();
        sortedPeople.forEach(System.out::println);

        //На основании существующего потока данных создать новый, в котором каждый новый Person имеет возраст
        // на 4 года больше исходного
        System.out.println("на 4 года больше исходного");
        List<Person> extraAgePerson = sortedPeople.stream()
                .map(el -> new Person(el.getAge() + 4, el.getName())).toList();
        extraAgePerson.forEach(System.out::println);

        //Вычислить средний возраст конечного людей и отпечатать в новый текстовый файл
        double averageAge = extraAgePerson.stream().mapToDouble(el -> el.getAge()).average().orElse(0.0);
        try (BufferedWriter in = new BufferedWriter(new FileWriter("out/average_age.txt"))) {
            in.write(String.valueOf(averageAge));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
