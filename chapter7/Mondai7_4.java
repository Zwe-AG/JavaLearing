package chapter7;

public class Mondai7_4 {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (sum <= 100000) {
            n++;
            sum += n;
        }
        System.out.println("合計が 100000 を超える n は "+n+"です ");
    }
}
