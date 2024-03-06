package fa.training.utils;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorUtilsTest {
    @Test
    public void testIsValue() {
        String validString = "Valid123";
        assertTrue(ValidatorUtils.isValue(validString));
    }

    @Test
    public void testIsValueWithSpace() {
        String validString = "Valid 123";
        assertTrue(ValidatorUtils.isValue(validString));
    }

    @Test
    public void testIsValueWithSpecialCharacter() {
        String validString = "Valid@123";
        assertTrue(ValidatorUtils.isValue(validString));
    }

    @Test
    public void testIsValueWithEmptyString() {
        String invalidString = "";
        assertFalse(ValidatorUtils.isValue(invalidString));
    }

    @Test
    public void testIsValueWithNull() {
        String invalidString = null;
        assertFalse(ValidatorUtils.isValue(invalidString));
    }

    @Test
    public void testIsValueWithInvalidString() {
        String invalidString = "Invalid123!";
        assertFalse(ValidatorUtils.isValue(invalidString));
    }

    @Test
    public void testIsNumber() {
        String validNumber = "123";
        assertTrue(ValidatorUtils.isNumber(validNumber));
    }

    @Test
    public void testIsNumberWithSpace() {
        String validNumber = "123 456";
        assertTrue(ValidatorUtils.isNumber(validNumber));
    }

    @Test
    public void testIsNumberWithEmptyString() {
        String invalidNumber = "";
        assertFalse(ValidatorUtils.isNumber(invalidNumber));
    }

    @Test
    public void testIsNumberWithNull() {
        String invalidNumber = null;
        assertFalse(ValidatorUtils.isNumber(invalidNumber));
    }

    @Test
    public void testIsNumberWithInvalidString() {
        String invalidNumber = "123abc";
        assertFalse(ValidatorUtils.isNumber(invalidNumber));
    }

    @Test
    public void testDateToString() throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2021");
        assertEquals("01/01/2021", ValidatorUtils.dateToString(date));
    }

    @Test
    public void testStringToDate() throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2021");
        assertEquals(date, ValidatorUtils.stringToDate("01/01/2021"));
    }

    @Test
    public void testNotFutureWithFutureDate() throws ParseException {
        Date futureDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022");
        assertFalse(ValidatorUtils.notFuture(futureDate));
    }

    @Test
    public void testNotFutureWithCurrentDate() {
        Date currentDate = new Date();
        assertTrue(ValidatorUtils.notFuture(currentDate));
    }

    @Test
    public void testNotFutureWithPastDate() throws ParseException {
        Date pastDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2020");
        assertTrue(ValidatorUtils.notFuture(pastDate));
    }

    @Test
    public void testNotFutureWithNull() {
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
public void testNotFutureWithFutureDateAndCurrentDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        assertFalse(ValidatorUtils.notFuture(futureDate));
    }

    @Test
    public void testNotFutureWithPastDateAndCurrentDate() {
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        assertTrue(ValidatorUtils.notFuture(pastDate));
    }

    @Test
    public void testNotFutureWithCurrentDateAndCurrentDate() {
        Date currentDate = new Date();
        assertTrue(ValidatorUtils.notFuture(currentDate));
    }

    @Test
    public void testNotFutureWithFutureDateAndFutureDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        assertFalse(ValidatorUtils.notFuture(futureDate));
    }

    @Test
    public void testNotFutureWithPastDateAndPastDate() {
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        assertTrue(ValidatorUtils.notFuture(pastDate));
    }

    @Test
    public void testNotFutureWithNullAndNull() {
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndCurrentDate() {
        Date currentDate = new Date();
        assertTrue(ValidatorUtils.notFuture(currentDate));
    }

    @Test
    public void testNotFutureWithNullAndFutureDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        assertFalse(ValidatorUtils.notFuture(futureDate));
    }

    @Test
    public void testNotFutureWithNullAndPastDate() {
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        assertTrue(ValidatorUtils.notFuture(pastDate));
    }

    @Test
    public void testNotFutureWithFutureDateAndNull() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        assertFalse(ValidatorUtils.notFuture(futureDate));
    }

    @Test
    public void testNotFutureWithPastDateAndNull() {
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        assertTrue(ValidatorUtils.notFuture(pastDate));
    }

    @Test
    public void testNotFutureWithCurrentDateAndNull() {
        Date currentDate = new Date();
        assertTrue(ValidatorUtils.notFuture(currentDate));
    }

    @Test
    public void testNotFutureWithFutureDateAndCurrentDateAndPastDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
    }

    @Test
    public void testNotFutureWithFutureDateAndPastDateAndCurrentDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
    }

    @Test
    public void testNotFutureWithPastDateAndCurrentDateAndFutureDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
    }

    @Test
    public void testNotFutureWithPastDateAndFutureDateAndCurrentDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
    }

    @Test
    public void testNotFutureWithCurrentDateAndFutureDateAndPastDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
    }

    @Test
    public void testNotFutureWithCurrentDateAndPastDateAndFutureDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
    }

    @Test
    public void testNotFutureWithNullAndFutureDateAndPastDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndPastDateAndFutureDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndCurrentDateAndFutureDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndCurrentDateAndPastDate() {
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndPastDateAndCurrentDate() {
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithFutureDateAndNullAndPastDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithFutureDateAndPastDateAndNull() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithPastDateAndNullAndFutureDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithPastDateAndFutureDateAndNull() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithCurrentDateAndNullAndFutureDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithCurrentDateAndNullAndPastDate() {
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithCurrentDateAndPastDateAndNull() {
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndFutureDateAndPastDateAndCurrentDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndPastDateAndFutureDateAndCurrentDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndCurrentDateAndFutureDateAndPastDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndCurrentDateAndPastDateAndFutureDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndPastDateAndCurrentDateAndFutureDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }

    @Test
    public void testNotFutureWithNullAndFutureDateAndCurrentDateAndPastDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 1000);
        Date pastDate = new Date(System.currentTimeMillis() - 1000);
        Date currentDate = new Date();
        assertFalse(ValidatorUtils.notFuture(futureDate));
        assertTrue(ValidatorUtils.notFuture(pastDate));
        assertTrue(ValidatorUtils.notFuture(currentDate));
        assertFalse(ValidatorUtils.notFuture(null));
    }
}
