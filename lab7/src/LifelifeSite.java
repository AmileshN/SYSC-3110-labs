public class LifelifeSite extends Site {

    @Override
    public double getBaseAmount() {
        double _units=10;
        double _rate = 3;
        double base = _units * _rate;
        return base;
    }
    @Override
    public double getTaxAmount() {
        double tax = getBaseAmount() * Site.TAX_RATE;
        return tax;
    }
}
