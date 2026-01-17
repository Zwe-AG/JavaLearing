package example.constructor;

public class Hero {

    String name;
    int hp;
    Sword sword;
    public Hero(){
        this.hp = 100;
    }
    public void attack() {
        System.out.println(this.name+"は攻撃した！");
        System.out.println("敵に５ポイントのダメージをあたえた！");
    }
}
