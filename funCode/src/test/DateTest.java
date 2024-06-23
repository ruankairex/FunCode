package test;



import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.time.DayOfWeek;

public class DateTest {
	public static void main(String[]args) {
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		// Date 取得系統時間，從1970/01/01 00:00:00到現在的毫秒數
		Date d0 = new Date(System.currentTimeMillis());
		Date d1 = new Date();
		
		System.out.println(s1.format(d0));
		System.out.println(d1.getTime());
		
		// 使用Calendar
		Calendar c0 = Calendar.getInstance();
		c0.set(2024, Calendar.OCTOBER, 15);
		System.out.println(c0);
		System.out.println(c0.get(Calendar.YEAR));
		System.out.println(c0.get(Calendar.MONTH));
		System.out.println(c0.get(Calendar.DATE));
		
		// 新的取的time的方法
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		System.out.println("使用java.Time");
		LocalTime localTime = LocalTime.of(0, 0, 0);
		LocalDate localDate = LocalDate.of(1975, 4, 1);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, ZoneId.of("Asia/Taipei"));
		System.out.println(zonedDateTime);
		System.out.println(zonedDateTime.format(formatter));
		System.out.println(zonedDateTime.toEpochSecond());
		System.out.println(zonedDateTime.toInstant().toEpochMilli());


		int yearIntCheck = 2024;
        int monthIntCheck = 6;

       
        LocalDate firstDayOfMonth = LocalDate.of(yearIntCheck, monthIntCheck,1);

        String ld = LocalDateTime.of(2024,6,23,22,5,20).format(formatter);
        System.out.println(ld);
        
        
        DayOfWeek firstDay = firstDayOfMonth.getDayOfWeek();
        
      
        int totalDays = firstDayOfMonth.lengthOfMonth();

   
        System.out.println("First day of the month: " + firstDay.getDisplayName(TextStyle.FULL, Locale.TAIWAN));
        System.out.println("Total days in the month: " + totalDays);
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(firstDayOfMonth.format(formatter2));
	}
}
