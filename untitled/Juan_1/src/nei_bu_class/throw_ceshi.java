package nei_bu_class;

public class throw_ceshi {
    public static void main(String[] args) {
        //int[] age = new int[3];
        int[] age = {1,2,3};
        int index=3;
        int a=test01(age,index);
    }
    public  static int test01 (int[] at,int index)
    {

       if((index>at.length-1) || index<0)
       {
           try{
               throw new IndexOutOfBoundsException("哥哥你越界啦！");
           }
           catch (Exception e)
           {
               System.out.println("...");
           }
       }

           int el=at[index];
           return el;

    }

}
