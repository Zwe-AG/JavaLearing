package chapter1;

import java.util.Scanner;

public class Mondai1_10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("文字の入力　：");
        String name = obj.nextLine();
        System.out.print("整数の入力　：");
        int num1 = obj.nextInt();
        System.out.print("小数の入力　：");
        float num2 = obj.nextFloat();
        System.out.println("入力された文字　＝"+name);
        System.out.println("入力された整数　＝"+num1);
        System.out.println("入力された小数　＝"+num2);
    }
}
