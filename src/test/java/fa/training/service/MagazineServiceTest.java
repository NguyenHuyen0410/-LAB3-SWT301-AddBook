package fa.training.service;

import fa.training.entity.Magazine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class MagazineServiceTest {

    @BeforeEach
    public void setup() {
        ManazineService.magazineList.clear();
    }

    @Test
    public void testAddMagazine() {
        Magazine magazine = new Magazine(2022, "Publisher", new Date(), "Author", 1, 1);
        ManazineService.addMagazine(magazine);
        assertEquals(1, ManazineService.magazineList.size());
    }

    @Test
    public void testGetBookByYearAndPublisher() {
        Magazine magazine1 = new Magazine(2022, "Publisher1", new Date(), "Author1", 1, 1);
        Magazine magazine2 = new Magazine(2022, "Publisher2", new Date(), "Author2", 2, 2);
        ManazineService.addMagazine(magazine1);
        ManazineService.addMagazine(magazine2);
        ManazineService.getBookByYearAndPublisher("Publisher1", 2022);

        Assertions.assertEquals(2, ManazineService.magazineList.size());
        Assertions.assertEquals(1, ManazineService.magazineList.get(0).getVolumn());
    }

    @Test
    public void testGetTop10() {
        for (int i = 0; i < 15; i++) {
            Magazine magazine = new Magazine(2022, "Publisher" + i, new Date(), "Author" + i, i, i);
            ManazineService.addMagazine(magazine);
        }
        ManazineService.getTop10();

        Assertions.assertEquals(15, ManazineService.magazineList.size());
    }

    @Test
    public void testGetTop10WithEmpty
            () {
        ManazineService.getTop10();
        Assertions.assertEquals(0, ManazineService.magazineList.size());
    }

    @Test
    public void testGetTop10WithLessThan10() {
        for (int i = 0; i < 5; i++) {
            Magazine magazine = new Magazine(2022, "Publisher" + i, new Date(), "Author" + i, i, i);
            ManazineService.addMagazine(magazine);
        }
        ManazineService.getTop10();
        Assertions.assertEquals(5, ManazineService.magazineList.size());
    }

    @Test
    public void testGetTop10WithMoreThan10() {
        for (int i = 0; i < 15; i++) {
            Magazine magazine = new Magazine(2022, "Publisher" + i, new Date(), "Author" + i, i, i);
            ManazineService.addMagazine(magazine);
        }
        ManazineService.getTop10();
        assertEquals(10, ManazineService.magazineList.size());
    }

    @Test
    public void testGetTop10WithMoreThan10AndDuplicate() {
        for (int i = 0; i < 15; i++) {
            Magazine magazine = new Magazine(2022, "Publisher" + i, new Date(), "Author" + i, i, i);
            ManazineService.addMagazine(magazine);

            if (i < 5) {
                ManazineService.addMagazine(magazine);
            }

        }

        assertEquals(30, ManazineService.magazineList.size());

    }

    @Test
    public void testGetTop10WithMoreThan10AndDuplicateAndSort() {
        for (int i = 0; i < 15; i++) {
            Magazine magazine = new Magazine(2022, "Publisher" + i, new Date(), "Author" + i, i, i);
            ManazineService.addMagazine(magazine);

            if (i < 5) {
                ManazineService.addMagazine(magazine);
            }

        }
        ManazineService.getTop10();
        Assertions.assertEquals(10, ManazineService.magazineList.size());
        Assertions.assertEquals(14, ManazineService.magazineList.get(0).getVolumn());
    }

    @Test
    public void testGetTop10WithMoreThan10AndDuplicateAndSortWithEmpty() {
        ManazineService.getTop10();
        Assertions.assertEquals(0, ManazineService.magazineList.size());
    }

    @Test
    public void testGetTop10WithMoreThan10AndDuplicateAndSortWithLessThan10() {
        for (int i = 0; i < 5; i++) {
            Magazine magazine = new Magazine(2022, "Publisher" + i, new Date(), "Author" + i, i, i);
            ManazineService.addMagazine(magazine);

            if (i < 5) {
                ManazineService.addMagazine(magazine);
            }

        }

        Assertions.assertEquals(10, ManazineService.magazineList.size());
    }

    @Test
    public void testGetTop10WithMoreThan10AndDuplicateAndSortWithMoreThan10() {
        for (int i = 0; i < 15; i++) {
            Magazine magazine = new Magazine(2022, "Publisher" + i, new Date(), "Author" + i, i, i);
            ManazineService.addMagazine(magazine);

            if (i < 5) {
                ManazineService.addMagazine(magazine);
            }

        }

        Assertions.assertEquals(10, ManazineService.magazineList.size());

    }
}