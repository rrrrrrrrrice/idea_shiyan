package shi_yan_5;

public class di_5_1 {
    double PI=3.14;
    private double  radius;
        public di_5_1(double radius){
              this.radius=radius;

        }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double perimeter(){
        return 2*PI*radius;
    }
    public double area(){
        return PI*radius*radius;
    }


}






