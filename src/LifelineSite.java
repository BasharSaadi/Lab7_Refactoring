public class LifelineSite {
    private double units;
    private double rate;

    private double getBase() {
        return units * rate * 0.5;
    }

    public double getBillableAmount() {
        double base = getBase();
        double tax = base * 0.2;
        return base + tax;
    }
}