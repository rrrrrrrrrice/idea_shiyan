package hello;
import java.util.Objects;
public class car implements Cloneable{
    int id;
    String brand;
    String color;

    public car(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id==((car)obj).id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
   car c1=new car(101,"12","11");
   car c2=(car)c1.clone();
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
    }
}
