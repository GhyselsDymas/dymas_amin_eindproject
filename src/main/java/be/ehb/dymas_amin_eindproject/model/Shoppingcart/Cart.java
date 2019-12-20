package be.ehb.dymas_amin_eindproject.model.Shoppingcart;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Ghysels Dymas & Ahmadi Baloutaki Amin
 * */
public class Cart {

    static List<CartRow> cartItems = new ArrayList<CartRow>();
    private BigDecimal totaalPrijs;

    public static void addToCart(DierenProduct product) {
        cartItems.add(new CartRow(product, 1));
    }

    public static void removeFromCart(DierenProduct cartItem){
        CartRow toRemove = null;

        for (CartRow cr : cartItems) {
            if(cr.getDierenProduct().equals(cartItem)){
                toRemove = cr;
            }
        }

        cartItems.remove(toRemove);
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

    public static void deleteCart(){
        cartItems.clear();
    }


}
