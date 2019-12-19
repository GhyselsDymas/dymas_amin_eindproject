package be.ehb.dymas_amin_eindproject.controllers;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;
import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProductDAO;
import be.ehb.dymas_amin_eindproject.model.Shoppingcart.Cart;
import be.ehb.dymas_amin_eindproject.model.Shoppingcart.CartRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.chrono.ChronoZonedDateTime;
import java.util.List;

@Controller
public class WinkelmandController {

    @Autowired
    DierenProductDAO dao;

    @GetMapping(value = "/winkelmand")
    public String showCart(ModelMap map) {
        map.addAttribute("all", Cart.getCartItems());
        map.addAttribute("totaalprijs", Cart.maakTotaalPrijs());
        return "winkelmand";
    }

    @GetMapping(value = "/winkelmand/add/{id}")
    public String addToCart(@PathVariable(value = "id") int id) {
        DierenProduct p = dao.findById(id).get();
        Cart.addToCart(p);
        return "redirect:/index";
    }

    @GetMapping(value = "/winkelmand/delete/{id}")
    public String deleteFromCart(@PathVariable(value = "id") int id) {
        CartRow p= Cart.getCartItems().get(id);
        Cart.removeFromCart(p);
        return "redirect:/winkelmand";
    }
}
