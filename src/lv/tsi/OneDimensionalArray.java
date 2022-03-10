package lv.tsi;

import java.util.Arrays;
import java.util.Random;
// Exercise 3
// it doesn't work


public class OneDimensionalArray {

    public static void createRandomArrayTwoDimen(int size){
        double[][] array = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = new Random().nextInt(101);
           }
        }
       System.out.println(array);

    }
    public static void createRandomArrayOneDimen(int size){
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
                array[i] = new Random().nextInt(101);
           }

        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {
        createRandomArrayOneDimen(2);
      createRandomArrayTwoDimen(2);


    }
}

