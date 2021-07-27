package Day9;

import java.util.ArrayList;

public class Group_leader extends User {
    private String name;
    private int money;
    public Group_leader(){
        //super();
    };
    public Group_leader(String name,int money)
    {
        super(name,money);
    }
    public ArrayList<Integer> sender(int sendmoney,int count){
        ArrayList<Integer> list=new ArrayList<>();
        if(sendmoney>super.getMoney()) System.out.println("余额不足");
        else super.setMoney(super.getMoney()-sendmoney);
        int average=sendmoney/count;
        int moder=sendmoney%count;
        for (int i = 0; i < count-1; i++) {
            list.add(average);
        }
        list.add(moder+average);
        return list;
    }


}
