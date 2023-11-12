public class LifelifeSite extends Site {
    public double getBillableAmount(){
        double _units=10;
        double _rate = 3;
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
