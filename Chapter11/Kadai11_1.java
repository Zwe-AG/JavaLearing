import java.util.Scanner;

public class Kadai11_1 {
    public static void main(String[] args) {
        System.out.print("半径を整数値で入力：");
        Scanner obj = new Scanner(System.in);
        int radius = obj.nextInt();
        System.out.printf("円周の長さは%.3fです.%n",myFun(radius));
        System.out.printf("円の面積は%.3fです.",circle(radius));
        obj.close();
    }

    public static double myFun(int r) {
        double result = Math.PI * r *r;
        return result;
    }

    public static double circle(int r) {
        double result = 2 * Math.PI * r;
        return result;
    }
}
