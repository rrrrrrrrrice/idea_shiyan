package hello;

import java.util.Arrays;
public class Circle extends Shape{
    @Override
    public double getArea(double r){
        double PI=3.14;
        return PI*r*r;
    }
    @Override
    public String toString(){
        return "toString1";
    }

}
