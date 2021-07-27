package shi_yan11;

interface Swimmable{
    void swim();
}
interface Flyable{
    void fly();
}

public class Duck implements Swimmable,Flyable{
    @Override
    public void swim() {
        System.out.println("游泳");
    }
    @Override
    public void fly(){
        System.out.println("天上飞");
    }
    public static void main(String[] args) {
        Duck a1=new Duck();
        a1.fly();
        a1.swim();
        Swimmable a2=a1;
        a2.swim();
    }
}
