public class Main {
    public static void main(String[] args) {

        GroceryItem item1 = new GroceryItem("carrots", 2.34, "vegetables");
        System.out.println(item1);

        GroceryItem item2 = new GroceryItem("bread", 2.89, "bread");
        System.out.println(item2);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item1);
        System.out.println("Items in the cart are: "+cart);

        System.out.printf("The total price of the items in the cart is: $%.2f", cart.getTotalPrice());
    }
}
