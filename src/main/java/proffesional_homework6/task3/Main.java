package proffesional_homework6.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws ParseException {
        Main m = new Main();
        m.calendar(1995, Month.JANUARY, 1);
    }

    void calendar(int year, Month month, int day) throws ParseException {
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//
//        long timeUp = format.parse(birthday1).getTime();
//        long diff = System.currentTimeMillis() - timeUp;
//
//        Date date1 = new Date(diff);

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        Period p = Period.between(birthday, today);

        Date date = Date.from(birthday.atStartOfDay(ZoneId.systemDefault()).toInstant());
        long timeUp = date.getTime();
        long diff = System.currentTimeMillis() - timeUp;

        Date date1 = new Date(diff);


        StringBuilder sb = new StringBuilder();
        sb.append("Вам исполнилось ").append(p.getYears()).append(" лет, ");
        sb.append(p.getMonths()).append(" месяцев, ");
        sb.append(p.getDays()).append(" дней, ");
        sb.append(date1.getHours()).append(" часов ");
        sb.append(date1.getMinutes()).append(" минут ");
        sb.append(date1.getSeconds()).append(" секунд назад");
        System.out.println(sb.toString());
    }

}
