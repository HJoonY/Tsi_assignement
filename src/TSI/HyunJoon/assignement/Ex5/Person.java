package TSI.HyunJoon.assignement.Ex5;

import TSI.HyunJoon.Main;

/**
 * Exercise 5
 */
public class Person {
    String name;
    int age;
    public Person(String Name,int Age){
        name = Name;
        age = Age;
    }

    public static void main(String[] args) {
        Person person = new Person("Hyun ",3);
        System.out.println(person.name);
        System.out.println(person.age);


    }

    @Override
    public String toString() {
        return name;
    }


}
