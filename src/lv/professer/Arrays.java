package lv.professer;

import java.security.SecureRandom;
import java.util.Random;

public class Arrays {
    public void playwithArrays(){
        int[] intArray = new int[20];
        for (int i=0;i<intArray.length;i++){
            intArray[i]=new SecureRandom().nextInt();
        }
        for (int i=0;i<intArray.length;i++){
            System.out.printf("Item of Index %d is %d\n", i, intArray[i]);

        }
    }

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        arrays.playwithArrays();
    }
}
