package be.ehb.dymas_amin_eindproject.model.Shoppingcart;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    static List<CartRow> cartItems = new ArrayList<CartRow>();
    private BigDecimal totaalPrijs;

    public static void addToCart(DierenProduct product) {
        cartItems.add(new CartRow(product, 1));
    }

    public static void removeFromCart(CartRow cartItem){
        cartItems.clear();
    }

    public static List<CartRow> getCartItems(){
        return cartItems;
    }
    public static BigDecimal maakTotaalPrijs() {
        BigDecimal totaalPrijs = new BigDecimal(0);
        for (CartRow row : cartItems) {
            BigDecimal prijs = row.getDierenProduct().getPrijs();
            totaalPrijs = totaalPrijs.add(prijs);
        }
        return totaalPrijs;
    }
}
