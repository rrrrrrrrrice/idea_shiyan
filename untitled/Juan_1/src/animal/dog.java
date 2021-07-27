package animal;

public class dog extends animal implements pet {
    @Override
    public void zhangxiang(animal a) {
        System.out.println("狗狗是可爱的");
    }

    private int kk;

    public void setKk(int kk) {
        this.kk = kk;
    }
    public int getkk()
    {
        return this.kk;
    }
    @Override
    public void makenoise(animal a) {
        System.out.println("狗叫");
    }

    @Override
    public void eat(animal a) {
        System.out.println("狗吃肉");
    }

}
