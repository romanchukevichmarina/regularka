package regularka;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Car {
public static void main(String[] args) {
Pattern p = Pattern.compile("[a-z]{1}[0-9]{3}[a-z]{2}");
Matcher m = p.matcher("h89khj");
System.out.println(m.matches());

}
}