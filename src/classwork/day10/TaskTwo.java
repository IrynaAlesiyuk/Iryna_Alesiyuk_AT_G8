package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class TaskTwo {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println("Lambda approach");
        long numberOfWorkingWomen = personList.stream()
                .filter(el -> el.age >= 18 && el.age < 55 && el.sex.equals(Person.Sex.WOMEN))
                .count();
        //.forEach(el -> System.out.println("Working woman: " + el.toString()));
        System.out.println("Working women count: " + numberOfWorkingWomen);

        long numberOfWorkingMan = personList.stream()
                .filter(el -> el.age >= 18 && el.age < 60 && el.sex.equals(Person.Sex.MAN))
                .count();
        System.out.println("Working man count: " + numberOfWorkingMan);
        // .forEach(el -> System.out.println("Working man: " + el.toString()));

        long numberOfWorkingPeople = personList.stream()
                .filter(el -> (el.age >= 18 && el.age < 55) || (el.age >= 18 && el.age < 60 && el.sex.equals(Person.Sex.MAN)))
                // .filter(el -> el.age >= 55 && el.age < 60 && el.sex.equals(Person.Sex.MAN))
                .count();
        System.out.println("Number of working people: " + numberOfWorkingPeople);

        System.out.println("-----------");
        System.out.println("Collection approach");
        int numberOfWorkingWoman2 = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).age >= 18 && personList.get(i).age < 55 && personList.get(i).sex.equals(Person.Sex.WOMEN)) {
                System.out.println("Working woman: " + personList.get(i).toString());
                numberOfWorkingWoman2++;
            }
        }
        System.out.println("Working woman count: " + numberOfWorkingWoman2);
        int numberOfWorkingMan2 = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).age >= 18 && personList.get(i).age < 60 && personList.get(i).sex.equals(Person.Sex.MAN)) {
                System.out.println("Working man: " + personList.get(i).toString());
                numberOfWorkingMan2++;
            }
        }
        System.out.println("Working man count: " + numberOfWorkingMan2);

    }
}
