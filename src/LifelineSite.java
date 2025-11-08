public class LifelineSite {
    private double units;
    private double rate;

    private double getBase() {
        return units * rate * 0.5;
    }

    private double getTaxAmount() {
        return getBase() * 0.2;
    }

    public double getBillableAmount() {
        return getBase() + getTaxAmount();
    }
}