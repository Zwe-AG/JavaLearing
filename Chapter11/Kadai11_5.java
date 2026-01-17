
class Person {

    String name;
    int age;
    String gender;
    double height;
    double weight;

    public Person(String name,int age,String gender,double height,double weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }
 
    public String setName(String name) {
        this.name = name;
        return name;
    }
 
    public void setAge(int age) {
        this.age = age;
        // return age;
    }
 
    public String setGender(String gender) {
        this.gender = gender;
        return gender;
    }
 
    public void setHeight(double height) {
        this.height = height;
        // return height;
    }
 
    public void setWeight(double weight) {
        this.weight = weight;
        // return weight;
    }
 
    void get_info(){
        System.out.printf("名前：%s 年齢：%d 性別：%s 身長(cm)：%.1f 体重(kg)：%.1f ",name,age,gender,height,weight);
    }
 
    double get_bmi(){
        double h = height / 100.0;
        double BMI = weight / (Math.pow(h, 2));
        return BMI;
    }
 
    String get_obesity(){
        double bmi = get_bmi();
        if (bmi < 18.5) return "低体重";
        if (bmi < 25.0) return "普通体重";
        if (bmi < 30.0) return "肥満(1度)";
        return "肥満(2度以上)";
    }
 
    double get_sutitable_weight(){
        double h = height / 100.0;
        double sutitable_weight  = Math.pow(h, 2) * 22;
        return sutitable_weight;
    }
}
 
public class Kadai11_5 {
    public static void main(String[] args) {
        Person obj = new Person("鈴木太郎", 42, "男性", 179.3, 72.7);
        obj.get_info();
        showResult(obj);
    }

    public static void showResult(Person obj){
        double bmi = obj.get_bmi();
        System.out.printf("%nBMI 値 = %.3f%n", bmi);
        String obesity = obj.get_obesity();
        System.out.printf("肥満度判定 = %s%n", obesity);
        double suitbable = obj.get_sutitable_weight();
        System.out.printf("適正体重 = %.3f kg", suitbable);
    }

}