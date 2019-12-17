package be.ehb.dymas_amin_eindproject.controllers;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;
import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProductDAO;
import be.ehb.dymas_amin_eindproject.model.Shoppingcart.Cart;
import be.ehb.dymas_amin_eindproject.model.Shoppingcart.CartRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class WinkelmandController {

    @Autowired
    DierenProductDAO dao;

    @GetMapping(value = "/winkelmand")
    public String showCart(ModelMap map){
        map.addAttribute("all", Cart.getCartItems());
        return "winkelmand";
    }

    @GetMapping(value = "/winkelmand/add/{id}")
    public String addToCart(@PathVariable(value = "id") int id){
        DierenProduct p = dao.findById(id).get();
        Cart.addToCart(p);
        return "redirect:/index";
    }

}
