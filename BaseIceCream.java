public class BaseIceCream implements IceCream {
    private final String flavour;
    private final double basePrice;

    public BaseIceCream() {
        this.flavour = null;
        this.basePrice = 0;
    }

    BaseIceCream(String flavour, double basePrice) {
            this.flavour = flavour;
            this.basePrice = basePrice;
        }

    @Override
    public String flavour()
    { 
        return flavour + " ice cream"; 
    }
    
    @Override
    public double price() 
    { 
        return basePrice; 
    }
}
