public abstract class Site {
    protected double units;
    protected double rate;

    public double getBillableAmount() {
        return getBase() + getTaxAmount();
    }

    protected double getTaxAmount() {
        return getBase() * getTaxRate();
    }

    protected abstract double getBase();
    protected abstract double getTaxRate();
}