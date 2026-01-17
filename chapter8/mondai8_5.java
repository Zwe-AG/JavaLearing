package chapter8;

public class mondai8_5 {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
        }
        System.out.println("合計点　："+ sum);
        System.out.println("平均点　："+ sum/number.length);
    }
}
