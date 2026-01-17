package chapter4;

import java.util.Scanner;

public class Mondai4_3 {
    public static void main(String[] args) {
        System.out.println("0～100 までの得点（整数値）を入力してください　：");
        System.out.print("国語の得点：");
        int inputTextOne = new Scanner(System.in).nextInt();
        System.out.print("英語の得点 ：");
        int inputTextTwo = new Scanner(System.in).nextInt();
        if (inputTextOne>80&&inputTextTwo>80) {
            System.out.println("2 科目とも合格です ");
        }
       
    }
}
