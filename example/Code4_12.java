package example;

import java.util.Random;

public class Code4_12 {
    public static void main(String[] args) {
        int[] seq = new int[10];

        for (int i = 0; i < seq.length; i++) {
            seq[i] = new Random().nextInt(4);
        }

        for (int i = 0; i < seq.length; i++) {
            char[] base = {'A','B','C','D'};
            System.out.println(base[seq[i]]+" ");
        }
    }
}
