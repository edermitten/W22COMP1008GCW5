import java.util.Arrays;
import java.util.List;

public class GroceryItem {
    private String name;
    private double price;
    private String category;

    /**
     * This is the constructor.  It allocates system memory when called to store
     * the following attributes.
     * @param name - name of the GroceryItem (String)
     * @param price - the price in CAD (double)
     * @param category - the category in the Canada Food Guide (String)
     */
    public GroceryItem(String name, double price, String category) {
        setName(name);
        setPrice(price);
        setCategory(category);
    }


    public String getName() {
        return name;
    }

    /**
     * A valid name is at least 3 characters long
     * @param name
     */
    public void setName(String name) {
        if (name.length()>=3)
            this.name = name;
        else
            throw new IllegalArgumentException("name must be 3 or more characters");
    }

    public double getPrice() {
        return price;
    }

    /**
     * The price reflects what the customer would need to pay in CAD
     * @param price double
     */
    public void setPrice(double price) {
        if (price >=0 )
            this.price = price;
        else
            throw new IllegalArgumentException("price must be 0 or higher");
    }

    public String getCategory() {
        return category;
    }

    /**
     * This reflects the categories of the Canada Food Guide
     * @param category - meats, vegetables, dairy, bread
     */
    public void setCategory(String category) {
        List<String> categories = Arrays.asList("meats", "vegetables", "dairy", "bread");
        category = category.toLowerCase();

        if (categories.contains(category))
            this.category = category;
        else
            throw new IllegalArgumentException(category + " is not valid, please use one" +
                    " of "+ categories);
    }

    @Override
    public String toString(){
        return String.format("%s price: $%.2f", name, price);
    }
}
