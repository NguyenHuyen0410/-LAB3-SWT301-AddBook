package fa.training.utils;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ScannerUtilsGeneratedTest {

    @Test()
    void getInstanceWhenScannerIsNull() {
        Scanner result = ScannerUtils.getInstance();
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    @Test()
    void getInstanceWhenScannerIsNotNull() {
        Scanner result = ScannerUtils.getInstance();
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
