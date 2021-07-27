package hello;

public abstract class Shape {
    public static int count=0;
    int ID;
    public Shape() {
        ID = ++count;
    }
    public abstract double getArea(double r);
}



