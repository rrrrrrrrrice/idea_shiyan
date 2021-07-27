package nei_bu_class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFoemat {


    public static void main(String[] args)   {
        /*SimpleDateFormat st =new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date1=new Date();
        Date date =st.parse("2021年7月19日 11时21分32秒");
        System.out.println(date);*/
        demo2();
    }
     static void demo2()
    {
        SimpleDateFormat st =new SimpleDateFormat("yyyy-MM-dd- HH-mm-ss");
        Date date1=new Date();
        System.out.println(st.format(date1));

    }

}
