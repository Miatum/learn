package base01;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateAndCalendar {
    private Date date;
    private Calendar calendar; // 抽象类
    private GregorianCalendar gregorianCalendar; // 为Calendar类的一个实现类
    private SimpleDateFormat simpleDateFormat;
    public DateAndCalendar () {
        this.date = new Date();
        this.calendar = Calendar.getInstance(); // 返回一个默认用当前的地区和时区初始化的GregorianCalendar对象。
        this.gregorianCalendar = new GregorianCalendar();
    }
    public void setDate (Date date) {
        this.date = date;
    }
    public void setCalendar (int year, int month, int date, int hourOfDay, int minute, int second) {
        this.calendar.set(year, month, date, hourOfDay, minute, second);
    }
    public void addCalenda (int addYear, int addMonth) {
        this.calendar.add(Calendar.YEAR, addYear);
        this.calendar.add(Calendar.MONTH, addMonth);
    }
    public void setGregorianCalendar(int year, int month, int date, int hourOfDay, int minute, int second) {
        this.gregorianCalendar.set(year, month, date, hourOfDay, minute, second);
    }
    public void setSimpleDateFormat(String pattern, TimeZone timeZone) {
        this.simpleDateFormat = new SimpleDateFormat(pattern);
        this.simpleDateFormat.setTimeZone(timeZone);
    }
    public Date getDate() {
        return date;
    }
    public String getDateString () {
        return this.simpleDateFormat.format(this.date);
    }
    public Calendar getCalendar() {
        return calendar;
    }
    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }
}
