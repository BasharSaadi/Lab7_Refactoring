public class LifelineSite extends Site {

    @Override
    protected double getBase() {
        return units * rate * 0.5;
    }

    @Override
    protected double getTaxRate() {
        return 0.2;
    }
}