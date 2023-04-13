package zadatak;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Sale> sale = new ArrayList<>();

        sale.add(new Sale("Tomislav", "Grad Zagreb", 1500.0));
        sale.add(new Sale("Klara", "Zagrebačka županija", 800.00));
        sale.add(new Sale("Tihomir", "Istarska županija", 1000.00));
        sale.add(new Sale("Zdravko", "Grad Zagreb", 1200.00));
        sale.add(new Sale("Tihana", "PGŽ", 2000.00));
        sale.add(new Sale("Vlatka", "Zadarska županija", 1300.00));

        StreamProcessor processor = new StreamProcessor();

        double totalSales = processor.getTotalSales(sale);
        System.out.println("Ukupna prodaja: " + totalSales);
        System.out.println();

        List<Sale> salesByRegion = processor.getSalesByRegion(sale, "Grad Zagreb");
        System.out.println("Prodavatelji po regiji: ");
        for (Sale sale1 : salesByRegion) {
            System.out.println(sale1);
        }
        System.out.println();

        List<String> topSalesPeople = processor.getTopSalesPeople(sale, 3);
        System.out.println("Top prodavatelji: " + topSalesPeople);
        System.out.println();

        double averageSale = processor.getAverageSale(sale);
        System.out.println("Prosječan iznos prodaje: " + averageSale);

    }

}
