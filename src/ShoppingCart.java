import java.util.ArrayList;

public class ShoppingCart {
    //shopping
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Apples");
        cart.add("Bananas");
        cart.add("Oranges");

        System.out.println("Items in your cart:");
        for (String item : cart) {
            System.out.println("- " + item);
        }
    }
}
