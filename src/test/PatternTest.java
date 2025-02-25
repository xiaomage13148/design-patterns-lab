package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String str = "";
        String regex = "[^a-zA-Z0-9]";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(str);
        String s = matcher.replaceAll("");
    }
}
