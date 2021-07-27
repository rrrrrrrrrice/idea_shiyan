package hello;

public class add {

    public static void main(String[] args) {
    double d0=0.0209,d1=0.0208,mi0=13779,mi1=16402,ms0=1399985589,
    ms1=1399982762,me0=19544,me1=21558;
    double  fenzi,fenmu,sum=0;
    for (int i=1;i<=99;i++){
         fenzi=(d0*mi0*(mi1+me1))+(d1*mi1*(mi0+me0));
        fenmu=(ms0*mi0*(mi1+me1))-(ms1*mi1*(mi0+me0));
         sum=(fenzi/fenmu)*1400000000.0;

    }
        System.out.println(sum);
    }}


