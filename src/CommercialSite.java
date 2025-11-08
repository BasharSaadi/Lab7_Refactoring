public class CommercialSite {
    private double units;
    private double rate;

    private double getBase() {
        return units * rate;
    }

    private double getTaxAmount() {
        return getBase() * 0.3;
    }

    public double getBillableAmount() {
        return getBase() + getTaxAmount();
    }
}