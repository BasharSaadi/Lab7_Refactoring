public class ResidentialSite {
    private double units;
    private double rate;

    private double getBase() {
        return units * rate;
    }

    private double getTaxAmount() {
        return getBase() * 0.2;
    }

    public double getBillableAmount() {
        return getBase() + getTaxAmount();
    }
}