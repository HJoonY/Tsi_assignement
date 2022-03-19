package TSI.HyunJoon.assignement.ExFrom1To4;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercise 1
 * 1. Create a list with elements "a1", "c3", "a2", "a3","b3", "b2", "c1", "c2","b1"
 * 2. Output the first element.
 */
public class ListProcessingWithStreams {

    static List<String> list= Arrays.asList("a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1");

    public static void main(String[] args) {
        System.out.println("Ex1 : \n ");
        System.out.println(list.get(0));
        /**
         * Exercise 2 (total number of points: 2)
         * 1. Continue with the list from exercise1
         * 2. Output elements from the list using uppercase
         */
        System.out.println("\nEx2 : \n");
        list.stream()
                .forEach(element-> System.out.println(element.toUpperCase(Locale.ROOT)));
        /**
         * Exercise 3 (total number of points: 2)
         * 1. Continue with the list from exercise1
         * 2. Output elements from the list,which starts with “b”.
         */
        System.out.println("\nEx3 : \n");
        Stream<String> listB = list.stream().filter(element->element.startsWith("b"));
        System.out.println(listB.collect(Collectors.toList()));

        /**
         * Exercise 4
         * 1. Continuewiththelistfromexercise1
         * 3. Outputelementsfromthelist,whichstartswith“c”.Theelementsshouldbeinuppercase
         * and alphabetically sorted.
         */
        System.out.println("\nEx4 : \n");
        Stream<String> listC = list.stream()
                .filter(element->element.startsWith("c"))
                        .sorted();
        listC.forEach(element-> System.out.println(element.toUpperCase(Locale.ROOT)));





    }
}


