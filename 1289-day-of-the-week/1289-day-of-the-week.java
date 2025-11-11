import java.time.LocalDate;
import java.time.DayOfWeek;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date=LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
      String result = dayOfWeek.toString().substring(0,1) + 
                        dayOfWeek.toString().substring(1).toLowerCase();
        return result;   
    }
}