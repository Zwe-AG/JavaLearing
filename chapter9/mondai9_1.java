package chapter9;


public class mondai9_1 {
    public static void main(String[] args) {
        myFun("東京情報クリエイター工学院専門学校","竹井先生");
    }

    static void myFun(String schoolName,String teacher){
        System.out.printf("学校名　：%s %n", schoolName);
        System.out.printf("名前 : %s", teacher);
    }
}
