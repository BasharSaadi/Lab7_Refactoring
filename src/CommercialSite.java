public class CommercialSite extends Site {

    @Override
    protected double getBase() {
        return units * rate;
    }

    @Override
    protected double getTaxRate() {
        return 0.3;
    }
}