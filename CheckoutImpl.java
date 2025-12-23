public class CheckoutImpl implements Checkout
{
    @Override
    public double total(IceCream order, String coupon)
    {
        double total = order.price();
        if ("SAVE10".equals(coupon)) total *= 0.90;
        return total;
    }
}
