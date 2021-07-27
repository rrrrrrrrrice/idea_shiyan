package shi_yan_8;

public abstract class Shape {
    String name;
    public Shape(){};
    public Shape(String name){this.name=name;}
    public abstract double getPerimeter();
    public abstract double getArea();


    public static void main(String[] args) {

         class Square extends Shape{
             double chang,kuan;

             public Square(double chang,double kuan){
                 super("长方形");
                 System.out.println(name);
                 this.chang=chang;
             this.kuan=kuan;};
             public  double getPerimeter(){return 2*(chang+kuan);}
             public  double getArea(){return chang*kuan;}
        }

        Square square=new Square(2,3);
        System.out.println("周长是"+square.getPerimeter());
        System.out.println("面积是"+square.getArea());
    }

}

