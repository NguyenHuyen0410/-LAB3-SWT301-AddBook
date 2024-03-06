package fa.training.service;

import fa.training.entity.Book;
import fa.training.entity.Magazine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ManazineService {
    public static final List<Magazine> magazineList = new ArrayList<>();

    private ManazineService() {
    }

    public static void addMagazine(Magazine magazine) {
        magazineList.add(magazine);
        System.out.println("Add successfully");
    }

    public static void getBookByYearAndPublisher(String publisher, int year) {
        List<Magazine> list = magazineList.stream().filter(magazine -> magazine.getPublister().equals(publisher) && magazine.getPublicationYear() == year).collect(Collectors.toList());
        if (!list.isEmpty()) {
            list.forEach(Magazine::display);
        } else {
            System.out.println("No data");
        }
    }

    public static void getTop10() {
        List<Magazine> list = magazineList.stream().sorted(Comparator.reverseOrder()).limit(10).collect(Collectors.toList());
        if (!list.isEmpty()) {
            list.forEach(Magazine::display);
        } else {
            System.out.println("No data");
        }
    }
}
