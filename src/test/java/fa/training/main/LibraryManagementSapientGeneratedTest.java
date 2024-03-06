package fa.training.main;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import fa.training.utils.ScannerUtils;

import java.util.Scanner;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LibraryManagementSapientGeneratedTest {

    @Disabled()
    @Test()
    void getChoiceWhenOptionsIsNotEmpty() {
        Readable readableMock = mock(Readable.class);
        try (MockedStatic<ScannerUtils> scannerUtils = mockStatic(ScannerUtils.class)) {
            Scanner scanner = new Scanner(readableMock);
            scannerUtils.when(() -> ScannerUtils.getInstance()).thenReturn(scanner);
            List<String> stringList = new ArrayList<>();
            stringList.add("Option 1");
            stringList.add("Option 2");
            stringList.add("Option 3");
            int result = LibraryManagement.getChoice(stringList);
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                scannerUtils.verify(() -> ScannerUtils.getInstance(), atLeast(1));
            });
        }
    }
}
