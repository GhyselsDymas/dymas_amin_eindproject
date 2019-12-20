package be.ehb.dymas_amin_eindproject.model.Shoppingcart;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * @author Ghysels Dymas & Ahmadi Baloutaki Amin
 * */
public class CartRow {

    private DierenProduct dierenProduct;
    private int amount;

    public CartRow(){
    }

    public CartRow(DierenProduct dierenProduct, int amount) {
        this.dierenProduct = dierenProduct;
        this.amount = amount;
    }

    public DierenProduct getDierenProduct() {
        return dierenProduct;
    }

    public void setDierenProduct(DierenProduct dierenProduct) {
        this.dierenProduct = dierenProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
