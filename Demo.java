public class Demo 
{
    public static void main(String[] args)
    {

        IceCream order1 = new BaseIceCream("Vanilla", 2.0);

        IceCream order2 = new Peanut(new BaseIceCream("Vanilla", 2.0));

        Checkout checkout = new CheckoutProxy();

        System.out.println("Checkout with coupon");
        double total1 = checkout.total(order1, "SAVE10");
        System.out.printf("Total: $%.2f%n", total1);


        System.out.println("Checkout with invalid coupon");
        double total2 = checkout.total(order1, "SAVE05");
        System.out.printf("Total: $%.2f%n", total2);


        System.out.println("Checkout with coupon and peanuts");
        double total3 = checkout.total(order2, "SAVE10");
        System.out.printf("Total: $%.2f%n", total3);
    }
}
