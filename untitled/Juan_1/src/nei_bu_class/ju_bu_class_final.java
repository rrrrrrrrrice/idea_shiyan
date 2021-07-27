package nei_bu_class;

public class ju_bu_class_final {
    public ju_bu_class_final() {
    }

    public void jubu()
    {
        int a=10;
        //a=20;
        class Inner
        {
            public void in()
            {
                System.out.println(a);
            }

        }
        Inner ou=new Inner();
        ou.in();
    }

}
