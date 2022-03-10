package lv.tsi;

import java.util.Arrays;
// Exercise 4

public class Marathon {
    static String [] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
    static int [] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

    public static void printResult(){
        String[][] result = new String[names.length][times.length];

        for (int i = 0; i < names.length; i++) {
                result[i][0] = String.valueOf(names[i]);
            }
        for (int i = 0; i < times.length; i++) {
                result[i][1] = String.valueOf(times[i]);
           }
        System.out.println("Name and Result");
//        return result;
        for (int i = 0; i < times.length; i++) {
            System.out.println(result[i][0]+": "+result[i][1]);
        }

    }

    public static void main(String[] args) {
       printResult();
    }


}

