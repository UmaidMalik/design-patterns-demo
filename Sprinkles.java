public class Sprinkles extends Topping {

    public Sprinkles(IceCream inner) {
        super(inner);
    }

    @Override
    public String flavour()
    {
        return inner.flavour() + " sprinkles";
    }
    
    @Override
    public double price()
    {
        return inner.price() + 0.30;
    }    
}
