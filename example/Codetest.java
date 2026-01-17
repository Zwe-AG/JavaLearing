package example;

import java.util.Arrays;

public class Codetest {
    public static void main(String[] args) {
        int[] arrOne = {1,2,3,4,5};
        int[] arrTwo = {1,2,3,4,5};

        // for (int i = 0; i < arrTwo.length; i++) {
        //     System.out.println(Arrays.asList(arrOne).contains(arrTwo[i]));
        // }
        System.out.println(Arrays.equals(arrOne, arrTwo));
    }
}
