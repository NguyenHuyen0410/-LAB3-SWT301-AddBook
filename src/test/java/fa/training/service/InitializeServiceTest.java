package fa.training.service;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import org.mockito.MockedStatic;
import fa.training.utils.ValidatorUtils;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InitializeServiceTest {

    @Disabled()
    @Test()
    void createStringValueWhenValidatorUtilsIsValueValue() {
        String result = InitializeService.createStringValue();
        assertAll("result", () -> assertThat(result, equalTo("A")));
    }

    @Disabled()
    @Test()
    void createStringValueWhenValidatorUtilsNotIsValueValue() {
        try (MockedStatic<ValidatorUtils> validatorUtils = mockStatic(ValidatorUtils.class)) {
            validatorUtils.when(() -> ValidatorUtils.isValue("A")).thenReturn(false);
            validatorUtils.when(() -> ValidatorUtils.isValue("B")).thenReturn(true);
            String result = InitializeService.createStringValue();
            assertAll("result", () -> {
                assertThat(result, equalTo("B"));
                validatorUtils.verify(() -> ValidatorUtils.isValue("A"), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.isValue("B"), atLeast(1));
            });
        }
    }

    @Disabled()
    @Test()
    void createIntValueWhenValidatorUtilsIsNumberValue() {
        int result = InitializeService.createIntValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    @Disabled()
    @Test()
    void createIntValueWhenValidatorUtilsNotIsNumberValue() {
        int result = InitializeService.createIntValue();
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    @Disabled()
    @Test()
    void createDateWhenValidatorUtilsNotFutureValue() throws ParseException {
        try (MockedStatic<ValidatorUtils> validatorUtils = mockStatic(ValidatorUtils.class)) {
            Date date = new Date();
            validatorUtils.when(() -> ValidatorUtils.stringToDate("A")).thenReturn(date);
            validatorUtils.when(() -> ValidatorUtils.notFuture(date)).thenReturn(true);
            Date result = InitializeService.createDate();
            assertAll("result", () -> {
                assertThat(result, equalTo(date));
                validatorUtils.verify(() -> ValidatorUtils.stringToDate("A"), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.notFuture(date), atLeast(1));
            });
        }
    }

    @Disabled()
    @Test()
    void createDateWhenValidatorUtilsNotNotFutureValue() throws ParseException {
        try (MockedStatic<ValidatorUtils> validatorUtils = mockStatic(ValidatorUtils.class)) {
            Date date = new Date();
            validatorUtils.when(() -> ValidatorUtils.stringToDate("A")).thenReturn(date);
            validatorUtils.when(() -> ValidatorUtils.notFuture(date)).thenReturn(false);
            Date date2 = new Date();
            validatorUtils.when(() -> ValidatorUtils.stringToDate("B")).thenReturn(date2);
            validatorUtils.when(() -> ValidatorUtils.notFuture(date2)).thenReturn(false);
            Date result = InitializeService.createDate();
            assertAll("result", () -> {
                assertThat(result, equalTo(date2));
                validatorUtils.verify(() -> ValidatorUtils.stringToDate("A"), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.notFuture(date), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.stringToDate("B"), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.notFuture(date2), atLeast(1));
            });
        }
    }

    @Disabled()
    @Test()
    void createDateWhenValidatorUtilsNotFutureValue2() throws ParseException {
        try (MockedStatic<ValidatorUtils> validatorUtils = mockStatic(ValidatorUtils.class)) {
            Date date = new Date();
            validatorUtils.when(() -> ValidatorUtils.stringToDate("A")).thenReturn(date);
            validatorUtils.when(() -> ValidatorUtils.notFuture(date)).thenReturn(false);
            Date date2 = new Date();
            validatorUtils.when(() -> ValidatorUtils.stringToDate("B")).thenReturn(date2);
            validatorUtils.when(() -> ValidatorUtils.notFuture(date2)).thenReturn(true);
            Date result = InitializeService.createDate();
            assertAll("result", () -> {
                assertThat(result, equalTo(date2));
                validatorUtils.verify(() -> ValidatorUtils.stringToDate("A"), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.notFuture(date), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.stringToDate("B"), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.notFuture(date2), atLeast(1));
            });
        }
    }

    @Disabled()
    @Test()
    void createDateWhenValidatorUtilsNotFutureValue3() throws ParseException {
        try (MockedStatic<ValidatorUtils> validatorUtils = mockStatic(ValidatorUtils.class)) {
            Date date = new Date();
            validatorUtils.when(() -> ValidatorUtils.stringToDate("A")).thenReturn(date);
            validatorUtils.when(() -> ValidatorUtils.notFuture(date)).thenReturn(true);
            Date result = InitializeService.createDate();
            assertAll("result", () -> {
                assertThat(result, equalTo(date));
                validatorUtils.verify(() -> ValidatorUtils.stringToDate("A"), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.notFuture(date), atLeast(1));
            });
        }
    }

    @Disabled()
    @Test()
    void createDateWhenValidatorUtilsNotFutureValue4() throws ParseException {
        try (MockedStatic<ValidatorUtils> validatorUtils = mockStatic(ValidatorUtils.class)) {
            Date date = new Date();
            validatorUtils.when(() -> ValidatorUtils.stringToDate("A")).thenReturn(date);
            validatorUtils.when(() -> ValidatorUtils.notFuture(date)).thenReturn(false);
            Date date2 = new Date();
            validatorUtils.when(() -> ValidatorUtils.stringToDate("B")).thenReturn(date2);
            validatorUtils.when(() -> ValidatorUtils.notFuture(date2)).thenReturn(false);
            Date result = InitializeService.createDate();
            assertAll("result", () -> {
                assertThat(result, equalTo(date2));
                validatorUtils.verify(() -> ValidatorUtils.stringToDate("A"), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.notFuture(date), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.stringToDate("B"), atLeast(1));
                validatorUtils.verify(() -> ValidatorUtils.notFuture(date2), atLeast(1));
            });
        }
    }
}
