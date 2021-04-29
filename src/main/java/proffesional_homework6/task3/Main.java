package proffesional_homework6.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Main m = new Main();
        m.calendar("01/01/1995");
    }

    void calendar(String birthday) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        long timeUp = format.parse(birthday).getTime();
        long diff = System.currentTimeMillis() - timeUp;

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = diff / (24 * 60 * 60 * 1000);
        long diffMonths = (long) (diff / (60 * 60 * 1000 * 24 * 30.41666666));
        long diffYears = diff / ((long) 60 * 60 * 1000 * 24 * 365);

        StringBuilder sb = new StringBuilder();
        sb.append("Вам исполнилось ").append(diffYears).append(" лет, ");
        sb.append(diffMonths).append(" месяцев, ");
        sb.append(diffDays).append(" дней, ");
        sb.append(diffHours).append(" часов, ");
        sb.append(diffMinutes).append(" минут, ");
        sb.append(diffSeconds).append(" секунд");

        System.out.println(sb.toString());
    }

}
