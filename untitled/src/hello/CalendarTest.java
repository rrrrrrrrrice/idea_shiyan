package hello;
import java.time.*;
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(1999,2,14);
        int month=date.getMonthValue();
        int today=date.getDayOfMonth();
        date=date.minusDays(today-1);
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();
        System.out.println("mon tue wed thu fri sat sun");
        for(int i=1;i<value;i++) System.out.printf("  ");
        while (date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today) System.out.printf("*");
            else System.out.printf(" ");
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1) {
                System.out.println();
            }
        }
        if(date.getDayOfWeek().getValue()!=1) System.out.println();

    }
}
