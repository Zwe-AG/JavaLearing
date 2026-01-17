package chapter1;

import java.util.Scanner;

public class Mondai1_9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("お名前を入力してください　＞");
        String name = obj.nextLine();
        System.out.println("こんにちは　"+name);

    }
}
