package Chapter13;


abstract class Person {
    String name;
    String job;

    public Person(String name,String job){
        this.name = name;
        this.job = job;
    }

    public void introduce(){
        System.out.printf("氏名 : %s %n",name);
        System.out.printf("職種 : %s %n",job);
    }
}

class Teacher extends Person{
    String subject;

    public Teacher(String name,String job,String subject){
        super(name,job);
        this.subject = subject;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.printf("担当科目 : %s",subject);
    }

}

class Cook extends Person{
    String specialties;

    public Cook(String name,String job,String specialties){
        super(name, job);
        this.specialties = specialties;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("得意料理 : " + specialties);
    }
}

public class Kadai13_1 {
    public static void main(String[] args) {
        Person p1 = new Teacher("竹井一馬", "教員", "情報処理");
        Person p2 = new Cook("大原太郎 ", "シェフ", "オムライス");

        p1.introduce();
        System.out.println();
        System.out.println();
        p2.introduce();
}
}