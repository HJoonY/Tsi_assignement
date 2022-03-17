package lv.tsi.Ex5;
// Exercise 5

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {
    public static double[][] createRandomArray(int size){
        double[][] array = new double[size][];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = new Random().nextInt(101);
            }
        }

        return array;
    }
    public static double[] mean(){
        double[][] array = createRandomArray(2);
        int length = array.length;

        int sum1 = 0;
        int sum2 = 0;

        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i][length];
        }
        for (int i = 0; i < array.length; i++) {
            sum1 += array[length][i];
        }

        double average1 = sum1 / array.length;
        double average2 = sum2 / array.length;
        double[] arrayMean = {average1,average2};
        return arrayMean ;

    }

    public static void main(String[] args) {
        System.out.println(mean());
    }
}
