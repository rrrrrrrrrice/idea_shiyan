package shi_yan_5;

public class Rectangle {
    private int chang;
    private int kuan;
    public Rectangle(){};
    public Rectangle(int chang,int kuan){
        this.chang=chang;
        this.kuan=kuan;
    };

    public int getChang() {
        return chang;
    }

    public void setChang(int chang) {
        this.chang = chang;
    }

    public int getKuan() {
        return kuan;
    }

    public void setKuan(int kuan) {
        this.kuan = kuan;
    }
    public int mianji(){
        return chang*kuan;
    }
    public int zhouchang(){
        return 2*(chang+kuan);
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,20);//初始化长宽


        System.out.println("面积是"+rectangle.mianji());
        System.out.println("周长是"+rectangle.zhouchang());

    }
}
