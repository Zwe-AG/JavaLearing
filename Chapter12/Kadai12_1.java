package Chapter12;

import java.util.Scanner;

class Calculator{

    public int CalcSum(int x,int y){
        return x+y;
    }

    public int CalcAvg(int x,int y) {
        return (x+y)/2;
    }
}

class MoreCalc extends Calculator{
    public int power(int x,int y) {
        return (int)Math.pow(x, y);
    }
}

public class Kadai12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int x = sc.nextInt();
        System.out.print("整数を入力してください：");
        int y = sc.nextInt();
        MoreCalc obj = new MoreCalc();
        System.out.printf("Sum %d and %d = %d %n", x,y,obj.CalcSum(x, y));
        System.out.printf("Average %d and %d = %d %n", x,y,obj.CalcAvg(x, y));
        System.out.printf("Power %d and %d = %d %n", x,y,obj.power(x, y));
        sc.close();
    }
}
