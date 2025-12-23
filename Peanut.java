public class Peanut extends Topping 
{

    public Peanut(IceCream inner)
    {
        super(inner);
    }
    
    @Override
    public String flavour()
    {
        return this.inner.flavour() + " + peanuts";
    }

    @Override
    public double price()
    {
        return this.inner.price() + 0.60;
    }
    
}
