package hello;

public class clone {

    public static void main() throws CloneNotSupportedException {
        Square square=new  Square(100);
        Square square1=(Square) square.clone();
        System.out.println(square.toString());
        System.out.println(square.equals(square1));

    }
}
