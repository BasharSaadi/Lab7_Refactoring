public class ResidentialSite {
    private double units;
    private double rate;

    public double getBillableAmount() {
        double base = units * rate;
        double tax = base * 0.2;
        return base + tax;
    }
}