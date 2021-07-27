package nei_bu_class;

public class StringBuild_s {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("dsd");
        st.append(1233);
        System.out.println(st);
        st.append("ss").append('s').append(1212).append(true);
        System.out.println(st);

    }
}
