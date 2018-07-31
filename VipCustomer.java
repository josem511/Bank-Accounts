public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this.name = "name";
        this.creditLimit = 1000;
        this.emailAddress = "@gmail.com";
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = "@gmail.com";
    }

    public String getName() {
        System.out.println(this.name);
        return name;
    }

    public double getCreditLimit() {
        System.out.println(this.creditLimit);
        return creditLimit;
    }

    public String getEmailAddress() {
        System.out.println(this.emailAddress);
        return emailAddress;
    }
}
