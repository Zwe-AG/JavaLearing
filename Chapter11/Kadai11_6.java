
public class Kadai11_6 {
    public static void main(String[] args) {
        int age = 44;
        double height =178.5;
        double weight = 88.9;
        Person obj = new Person("鈴木太郎", age, "男性", height, weight);
        obj.get_info();
        Kadai11_5.showResult(obj);
    }
}

