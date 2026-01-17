package chapter1;

import java.util.Scanner;

public class Mondai1_11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("年　：");
        int year  = obj.nextInt();
        System.out.print("月　：");
        int month  = obj.nextInt();
        System.out.print("日　：");
        int date  = obj.nextInt();
        System.out.println(year+"/"+month+"/"+date);
    }
}
