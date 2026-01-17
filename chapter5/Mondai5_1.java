package chapter5;

import java.util.Scanner;

public class Mondai5_1 {
    public static void main(String[] args) {
        System.out.print("A～D の値を入力してください　：");
        String inputText = new Scanner(System.in).nextLine();
        switch (inputText) {
            case "A":
                System.out.println("ランク A は評価「優」です");
                break;
            case "B":
                System.out.println("ランク B は評価「良」です ");
                break;
            case "C":
                System.out.println("ランク C は評価「可」です ");
                break;
            case "D":
                System.out.println("ランク D は評価「不可」です ");
                break;
        }
    }
}

