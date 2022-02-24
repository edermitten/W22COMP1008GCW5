import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<GroceryItem> cart;

    /**
     * the constructor will allocate space in system memory and initialize
     * the instance variable
     *
     * Constructors (unlike methods) do not have a return type and the name
     * must match the class name
     */

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    /**
     * this method will add a GroceryItem into the cart
     */
    //                 date type      variable name
    public void addItem(GroceryItem groceryItem) {
        cart.add(groceryItem);
    }

    /**
     * thos method eill sum the total cost of all the items in the cart
     */
    public double getTotalPrice(){
        double sum=0;

        for (GroceryItem item : cart)
            sum += item.getPrice();

        return sum;
    }

    /**
     * this method return all of the items in the cart as a String
     * @return
     */
    @Override
    public String toString(){
        String itemsInCart="";
        //each item             collection to loop over
        for (GroceryItem item : cart)
            itemsInCart += item + ", ";
        return itemsInCart.substring(0,itemsInCart.length()-2);
    }
}
