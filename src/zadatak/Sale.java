package zadatak;

public class Sale {

    private String salesPerson;
    private String region;
    private double amount;

    public Sale(String salesPerson, String region, double amount) {
        this.salesPerson = salesPerson;
        this.region = region;
        this.amount = amount;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Prodavatelj='" + salesPerson + '\'' +
                ", Regija='" + region + '\'' +
                ", Iznos prodaje=" + amount;
    }
}
