package fa.training.service;

import fa.training.utils.ScannerUtils;
import fa.training.utils.ValidatorUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class InitializeService {

    public static String createStringValue() {
        String value;
        while (true) {
            value = ScannerUtils.getInstance().next();
            if (ValidatorUtils.isValue(value)) break;
            System.out.println("Invalid input! enter again : ");
        }
        return value;
    }

    public static int createIntValue() {
        String value;
        while (true) {
            value = ScannerUtils.getInstance().next();
            if (ValidatorUtils.isNumber(value)) break;
            System.out.print("Invalid input! enter again : ");
        }
        return Integer.parseInt(value);
    }

    public static Date createDate() throws ParseException {
        Date value;
        while (true) {
            value = ValidatorUtils.stringToDate(ScannerUtils.getInstance().next());
            if (ValidatorUtils.notFuture(value)) break;
            System.out.print("Date is not available! enter again :");
        }
        return value;
    }


}
