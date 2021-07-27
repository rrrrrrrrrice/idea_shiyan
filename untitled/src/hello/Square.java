package hello;
import java.util.Objects;
public class Square implements Cloneable {

        double length;

        public Square(double length) {
            this.length = length;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "这个正方形边长是"+length;
        }

        @Override
        public boolean equals(Object obj) {
           return this.length==((Square)obj).length;
        }

    public static void main(String[] args) throws CloneNotSupportedException{
        Square square=new  Square(100);
        Square square1=(Square) square.clone();
        System.out.println(square.toString());
        System.out.println(square.equals(square1));
    }

    }


