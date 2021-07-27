package Day9;

import java.util.ArrayList;

public class StealMain {
    public static void main(String[] args) {
        Group_leader manager=new Group_leader("群主",12000);
        Group_member member1=new Group_member("张三",1000);
        Group_member member2=new Group_member("李四",1000);
        Group_member member3=new Group_member("王五",1000);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("=========================");
        ArrayList<Integer> in= manager.sender(11102,3);
        member1.collent(in);
        member2.collent(in);
        member3.collent(in);
        manager.show();
        member1.show();
        member2.show();
        member3.show();

    }
}
