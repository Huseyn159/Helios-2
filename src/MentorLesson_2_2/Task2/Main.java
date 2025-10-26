package MentorLesson_2_2.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice("N-1","ABB",299.99));

        List<Report> reports = new ArrayList<>();
        reports.add(new Report("Musteri sorgusu","Huseyn",5,"Xidmetden herkes razidir"));

        List<Certificate> certificates = new ArrayList<>();
        certificates.add(new Certificate("Cavad","TechAcademy","A"));

        PrintService printer = new PrintService();

        System.out.println("=== Invoices ===");
        printer.printAll(invoices);

        System.out.println("\n=== Reports ===");
        printer.printAll(reports);

        System.out.println("\n=== Certificates ===");
        printer.printAll(certificates);
    }
}
