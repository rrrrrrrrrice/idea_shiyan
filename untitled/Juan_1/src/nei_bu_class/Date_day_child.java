package nei_bu_class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date_day_child {
    public static void main(String[] args) throws ParseException {
        Scanner sc =new Scanner(System.in);
        String st = sc.next();
        SimpleDateFormat sd=new SimpleDateFormat("yyyyMMdd");
        Date date=sd.parse(st);
        Date today=new Date();
        long chusheng =date.getTime();
        long xianzai =today.getTime();
        long sum = xianzai-chusheng;
        //System.out.println(sum);
        if(sum<0)
        {
            System.out.println("还没出生");
        }
        else
        {
            long result =sum/(1000*60*60*24);
            System.out.println("距离"+st+"已经过去"+result+"天啦！");
        }
    }
}
