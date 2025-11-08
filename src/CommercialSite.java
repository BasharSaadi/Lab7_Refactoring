public class CommercialSite {
    private double units;
    private double rate;

    private double getBase() {
        return units * rate;
    }

    public double getBillableAmount() {
        double base = getBase();
        double tax = base * 0.3;
        return base + tax;
    }
}