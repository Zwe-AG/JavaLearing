package Chapter12;

class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public static void move(){
        new Dog("犬").run(10);
        new Bird("鳥").run(100);
        new Whale("イルカ").run(50);
    }

}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void run(int l){
        System.out.printf("%sは、%d メートル走りました。%n",name,l);
    }
}

class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public void run(int l){
        System.out.printf("%sは、%d メートル飛びました。%n",name,l);
    }
}

class Whale extends Animal{
    public Whale(String name){
        super(name);
    }
    public void run(int l){
        System.out.printf("%sは、%d キロメートル泳ぎました。%n",name,l);
    }
}

public class Kadai12_3 {
    public static void main(String[] args) {
        Animal.move();
    }
}
