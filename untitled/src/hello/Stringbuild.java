package hello;
import java.lang.StringBuilder;
import java.util.Date;
import java.util.*;
public class Stringbuild {
    public static void main(String[] args) {
        Scanner build=new Scanner(System.in);
        String name=build.nextLine();
        System.out.println(name);
        StringBuilder builder =new StringBuilder();
        builder.append(name);
        builder.append("stare");
        builder.setCharAt(1,'q');
        builder.append(' ');
        builder.append(1);
        builder.insert(0,'l');
        builder.delete(0,1);

        String completedstting=builder.toString();
        System.out.printf("%tT\n",new Date());

        System.out.println(completedstting);

    }
}
