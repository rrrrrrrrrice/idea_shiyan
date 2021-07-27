package Day9;

import java.util.ArrayList;
import java.util.Random;

public class Group_member extends User {
    private String name;
    private int money;
    public Group_member(){
        //super();
    }
    public Group_member(String name,int money){
        super(name,money);
    }
    public ArrayList<Integer> collent(ArrayList<Integer> StealMoney){
        Random r=new Random();
       int index= r.nextInt(StealMoney.size());
        super.setMoney(StealMoney.get(index));
        StealMoney.remove(index);
        return StealMoney;
    }

}
