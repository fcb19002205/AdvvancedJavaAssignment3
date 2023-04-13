package zadatak;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProcessor {

    public double getTotalSales(List<Sale> sales) {
        return sales.stream()
                .mapToDouble(Sale::getAmount)
                .sum();
    }

    public List<Sale> getSalesByRegion(List<Sale> sales, String region) {
        return sales.stream()
                .filter(sale -> sale.getRegion().equals(region))
                .collect(Collectors.toList());
    }

    public List<String> getTopSalesPeople(List<Sale> sales, int n) {
        Map<String, Double> salesBySalesPerson = sales.stream()
                .collect(Collectors.groupingBy(Sale::getSalesPerson,
                        Collectors.summingDouble(Sale::getAmount)));

        return salesBySalesPerson.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(n)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public double getAverageSale(List<Sale> sales) {
        return sales.stream()
                .mapToDouble(Sale::getAmount)
                .average()
                .orElse(0.0);
    }

}
