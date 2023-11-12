public abstract class Site {
    protected static final double TAX_RATE = 3;

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }
    public abstract double getBaseAmount();

    public abstract double getTaxAmount();



}
