public abstract class Topping implements IceCream {
    protected final IceCream inner;

    public Topping(IceCream inner) {
        this.inner = inner;
    }
    
}
