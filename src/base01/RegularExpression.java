package base01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private Pattern pattern;
    private Matcher matcher;
    public void setPattern (String patternString) {
        this.pattern = Pattern.compile(patternString);
    }
    public Matcher getMatcher (String target) {
        this.matcher = this.pattern.matcher(target);
        return this.matcher;
    }
}
