package TSI.HyunJoon.assignement.Ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonEvaluator {
    public static void main(String[] args) {
    List<Person> Persons = new ArrayList<>();

    Persons.add(new Person("MAX",28));
    Persons.add(new Person("Peter",22));
    Persons.add(new Person("Anna",28));
    Persons.add(new Person("Lilianna",16));
    Persons.add(new Person("Pamela",13));
    Persons.add(new Person("David",22));

    Stream<Person> listB = Persons.stream().filter(element->element.name.startsWith("P"));
        System.out.println(listB.collect(Collectors.toList()));
    Stream<Person> listC = Persons.stream().filter(element->element.age >18);
        System.out.println(listC.collect(Collectors.toList()));

    }

    public void findAndPrint(){

    }
    public void groupAndPrint(){

    }
    public void getAverageAge(){

    }

}
