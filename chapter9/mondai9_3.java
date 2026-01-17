package chapter9;

public class mondai9_3 {
    public static void main(String[] args) {
        myFun("Hello",3);
        myFun("Good Moring",4);
        myFun("Good Evening",2);
    }

    static void myFun(String name,int count){
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }

}
