public class LifelineSite {
    private double units;
    private double rate;

    public double getBillableAmount() {
        double base = units * rate * 0.5;
        double tax = base * 0.2;
        return base + tax;
    }
}