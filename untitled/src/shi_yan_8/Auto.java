package shi_yan_8;

public class Auto {
    public double speed;
    public Auto(){};
    public Auto(double speed){this.speed=speed;}
    public void start(){
        System.out.println("汽车启动");
    }
    public void speedup(){
        System.out.println("汽车加速");
    }
    public void stop(){
        System.out.println("汽车停止");
    }

    public static void main(String[] args) {
        int passeng=20;
       class Bus extends Auto{

           public void geton(){
               System.out.println("乘客上车");
           }
           public void getoff(){
               System.out.println("乘客下车");
           }
        }
       Bus bus=new Bus();
       bus.geton();
       System.out.println("一共有"+passeng+"乘客上车");
       bus.start();
       bus.speedup();
       bus.stop();
       bus.getoff();
    }
}
