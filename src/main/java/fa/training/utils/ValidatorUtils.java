package fa.training.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUtils {
    private static final String FULL_VALIDATE = "^[a-zA-Z0-9\\s+]+$";

    private static final String NUMBER_VALIDATE = "^[0-9\\s+]+$";
    private static final DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

    public static boolean isValue(String value) {
        Pattern pattern = Pattern.compile(FULL_VALIDATE);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    public static boolean isNumber(String value) {
        Pattern pattern = Pattern.compile(NUMBER_VALIDATE);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    public static String dateToString(Date date) {
        return dateformat.format(date);
    }

    public static Date stringToDate(String date) throws ParseException {
        return dateformat.parse(date);
    }

    public static boolean notFuture(Date date) {
        Date currentDate = new Date();
        return !date.after(currentDate);
    }


}
