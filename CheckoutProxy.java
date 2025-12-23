public class CheckoutProxy implements Checkout {

    private  final Checkout checkout = new CheckoutImpl();

    public double total(IceCream order, String coupon)
    {
        System.out.println("[PROXY] Customer ordered: " + order.flavour());
        
        if (coupon != null && !coupon.isEmpty() && !"SAVE10".equals(coupon))
        {
            System.out.println("[PROXY] Invalid coupon: '" + coupon + "'");
            coupon = "";
        }

        double result = checkout.total(order, coupon);
        System.out.println("[PROXY] Total calculated");
        return result;
    }
    
}
