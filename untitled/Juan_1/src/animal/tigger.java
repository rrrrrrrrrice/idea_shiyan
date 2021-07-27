package animal;

public class tigger extends animal {
    @Override
    public void makenoise(animal a) {
        System.out.println("老虎叫");

    }

    @Override
    public void eat(animal a) {
        System.out.println("老虎吃肉");
    }
}
