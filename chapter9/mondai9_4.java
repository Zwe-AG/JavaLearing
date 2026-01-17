package chapter9;

import java.util.Scanner;

public class mondai9_4 {
    static void myFun (){
        System.out.print("整数を入力してください : ");
        Scanner objScanner = new Scanner(System.in);
        int num = objScanner.nextInt();
System.out.printf("%d の 9 倍は %d です。 ", num,(num*9));
        objScanner.close();
    }
    public static void main(String[] args) {
        myFun();
    }

}
