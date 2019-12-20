package be.ehb.dymas_amin_eindproject.controllers;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;
import be.ehb.dymas_amin_eindproject.model.Shoppingcart.Cart;
import be.ehb.dymas_amin_eindproject.model.Shoppingcart.CartRow;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @author Ahmadi Baloutaki Amin
 * */
@Controller
public class BedanktController {

    @RequestMapping(value = {"/bedankt"}, method = RequestMethod.GET)
    public String showBedankt(ModelMap map) {
        return "bedankt";
    }
}
