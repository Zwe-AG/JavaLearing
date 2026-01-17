package chapter8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mondai8_5c {

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        int sum = Arrays.stream(number).sum();
        double avg = (double) sum/number.length; 
        System.out.printf("合計点は%dです。%n",sum);
        System.out.printf("平均点%.1fです。",avg);
    }
}
