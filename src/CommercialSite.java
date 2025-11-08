public class CommercialSite {
    private double units;
    private double rate;

    public double getBillableAmount() {
        double base = units * rate;
        double tax = base * 0.3;
        return base + tax;
    }
}