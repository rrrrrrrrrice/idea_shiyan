package hello;

public class Cylinder extends Circle {
    public double getVolume(double h,double r){
        return getArea(r)*h;
    }
    @Override
    public String toString(){
        return "toString2";
    }
    public static void main(String[] args) {
        double r=4.0;
        double h=6.0;
        Circle s2=new Circle() ;
        Cylinder s3=new Cylinder() ;
        System.out.println(s2.getArea(r));
        System.out.println(s3.getVolume(r,h) );
        System.out.println(s2.ID);
        System.out.println(s3.ID);
    }

    }
