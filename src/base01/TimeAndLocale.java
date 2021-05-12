package base01;

import java.util.Locale;
import java.util.TimeZone;

public class TimeAndLocale {
    private TimeZone timeZone;
    private Locale locale;
    public TimeAndLocale () {
        this.locale = Locale.getDefault();
        this.timeZone = TimeZone.getDefault();
    }
    public void setTimeZone (String id) {
        this.timeZone = TimeZone.getTimeZone(id);
    }
    public void setLocale (Locale targetLocale) { // targetLocale为Locale类中的静态变量，如Locale.CHINESE
        this.locale = targetLocale;
    }
    public TimeZone getTimeZone() {
        return timeZone;
    }
    public Locale getLocale() {
        return locale;
    }
}
