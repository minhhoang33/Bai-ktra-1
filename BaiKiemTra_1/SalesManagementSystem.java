package BaiKiemTra_1;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesManagementSystem {
    private static ArrayList<Product> productList = new ArrayList<>();
    private static ArrayList<Salesperson> salespersonList = new ArrayList<>();
    private static ArrayList<SalesRecord> salesRecordList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static Menu menu = new Menu();

    public static void main(String[] args) {
        while (true) {
            menu.displayMenu(productList,salespersonList,salesRecordList,scanner);
        }
    }
}


