import java.util.Scanner;

public class Kadai11_4 {

    public static void main(String[] args) {
        int[] coins = addCoin();
        getCount(coins);
        getAmount(coins);
    }

    public static int[] addCoin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1円　：");
        int a = sc.nextInt();
        
        System.out.print("5円　：");
        int b = sc.nextInt();

        System.out.print("10円　：");
        int c = sc.nextInt();

        System.out.print("50円　：");
        int d = sc.nextInt();

        System.out.print("100円　：");
        int e = sc.nextInt();

        System.out.print("500円　：");
        int f = sc.nextInt();
        

        sc.close();
        return new int[]{a,b,c,d,e,f};
    }

    public static void getCount(int[] coins) {
        System.out.printf(
                "1 円：%d枚 5円：%d枚 10円：%d枚 50円：%d枚 100円：%d枚 500円：%d枚%n",
                coins[0], coins[1], coins[2], coins[3], coins[4], coins[5]);
    }

    public static void getAmount(int[] coins) {
        int total = coins[0] * 1 +
                coins[1] * 5 +
                coins[2] * 10 +
                coins[3] * 50 +
                coins[4] * 100 +
                coins[5] * 500;

        System.out.printf("総額：%d円", total);
    }
}


// String n = "123";
//         String m = "456";
//         String[] line = new String[2];
//         line[0] = n;
//         line[1] = m;
//         System.out.println(String.join(",", line));