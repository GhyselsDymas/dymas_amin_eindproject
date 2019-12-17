package be.ehb.dymas_amin_eindproject.model.Shoppingcart;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    static List<CartRow> cartItems = new ArrayList<CartRow>();

    public static void addToCart(DierenProduct product) {
        cartItems.add(new CartRow(product, 1));
    }

    public static List<CartRow> getCartItems(){
        return cartItems;
    }
}
