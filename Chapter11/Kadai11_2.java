import java.util.Scanner;

public class Kadai11_2 {

    public static void main(String[] args) {
        Kadai11_2 myObj = new Kadai11_2();
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();

        myObj.sum(x, y);
        scanner.close();
    }

    void sum(int x,int y){
        int result = 0;
        for (int i = x; i < y+1; i++) {
            result+=i;
        }
        System.out.printf("%d から %d までの合計値は %d です。 ",x,y,result);
    }
}
