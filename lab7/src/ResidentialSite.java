public class ResidentialSite extends Site {
    public double getBillableAmount(){
        double _units=10;
        double _rate = 3;
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    public static void main(String[] args) {
        ResidentialSite rs = new ResidentialSite();
        System.out.println(rs.getBillableAmount());
    }

}
