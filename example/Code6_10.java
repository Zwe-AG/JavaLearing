package example;

import java.util.Arrays;

public class Code6_10 {
    public static void main(String[] args) {
        int[] heights = {172,149,152,191,155};
        Arrays.sort(heights);
        for (int h :heights) {
            System.out.println(h);
        }
    }
}
