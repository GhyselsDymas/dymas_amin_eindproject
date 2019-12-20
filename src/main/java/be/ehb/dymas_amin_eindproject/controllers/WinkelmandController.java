package be.ehb.dymas_amin_eindproject.controllers;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;
import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProductDAO;
import be.ehb.dymas_amin_eindproject.model.Persoon.PersoonVoorDierenWinkel;
import be.ehb.dymas_amin_eindproject.model.Persoon.PersoonVoorDierenWinkelDAO;
import be.ehb.dymas_amin_eindproject.model.Shoppingcart.Cart;
import be.ehb.dymas_amin_eindproject.model.Shoppingcart.CartRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.chrono.ChronoZonedDateTime;
import java.util.List;
import java.util.Optional;

/**
 * @author Ghysels Dymas & Ahmadi Baloutaki Amin
 * */
@Controller
public class WinkelmandController {

    @Autowired
    DierenProductDAO dao;

    @Autowired
    PersoonVoorDierenWinkelDAO daoPersoon;

    @ModelAttribute(value = "email")
    public PersoonVoorDierenWinkel findAllMail() {
        return new PersoonVoorDierenWinkel();
    }

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
        DierenProduct p = dao.findById(id).get();
        Cart.removeFromCart(p);

        return "redirect:/winkelmand";
    }

    @PostMapping(value = "/winkelmand/check")
    public String checkIfEmailExist(@ModelAttribute("email") PersoonVoorDierenWinkel persoon, ModelMap map) {
        Optional<PersoonVoorDierenWinkel> p = daoPersoon.findByMail(persoon.getMail());
        map.addAttribute("email", p);
        if (p.isPresent()) {
            return "redirect:/winkelmand/deleteCart";
        } else {
            return "redirect:/error";
        }
    }

    @GetMapping(value = "/winkelmand/deleteCart")
    public String deleteCart(){
        Cart.deleteCart();

        return "redirect:/bedankt";
    }
}
