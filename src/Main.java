public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        LifelineSite site1 = new LifelineSite(20.00, 25.00);
        ResidentialSite site2 = new ResidentialSite(40.00, 45.00);

        double site1Amount = site1.getBillableAmount();
        double site2Amount = site2.getBillableAmount();

        System.out.println("LifelineSite Amount: $" + site1Amount );
        System.out.println("ResidentialSite Amount: $" + site2Amount);
    }
}