package fa.training.utils;

import java.util.Scanner;

public class ScannerUtils {
    public static Scanner scanner;

    private ScannerUtils() {
    }

    public static Scanner getInstance(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
