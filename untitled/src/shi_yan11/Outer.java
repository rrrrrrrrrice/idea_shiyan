package shi_yan11;

public class Outer {
    class Inner{
        Inner(){
            System.out.println("Inner初始化");
        }
    }
    Inner function(){
        return new Inner();
    }
    public static void main(String[] args){
        Outer.Inner in = new Outer().new Inner();
    }
}
