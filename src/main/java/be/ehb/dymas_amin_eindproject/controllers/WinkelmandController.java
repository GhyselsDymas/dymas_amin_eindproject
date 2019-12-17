package be.ehb.dymas_amin_eindproject.controllers;

import be.ehb.dymas_amin_eindproject.model.Shoppingcart.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WinkelmandController {

    @GetMapping(value = "/winkelmand")
    public String showCart(ModelMap map){
        map.addAttribute("all", Cart.getCartItems());
        return "winkelmand";
    }

}
