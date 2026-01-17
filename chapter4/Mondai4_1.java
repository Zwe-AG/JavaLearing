package chapter4;

import java.util.Scanner;

public class Mondai4_1 {
    public static void main(String[] args) {
        System.out.print("0～100 までの得点（整数値）を入力してください　：");
        String inputText = new Scanner(System.in).nextLine();
        int inputMark = Integer.parseInt(inputText);
        if (inputMark >=80) {
            System.out.println("合格です");
        } else {
            System.out.println("不合格です");
        }
    }
}
