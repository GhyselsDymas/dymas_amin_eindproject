package be.ehb.dymas_amin_eindproject.controllers;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;
import be.ehb.dymas_amin_eindproject.model.Persoon.PersoonVoorDierenWinkel;
import be.ehb.dymas_amin_eindproject.model.Persoon.PersoonVoorDierenWinkelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
/**
 * @author Ahmadi Baloutaki Amin
 * */
@Controller
public class PersoonController {

    @Autowired
    PersoonVoorDierenWinkelDAO persoonDao;


/*Nieuwe gebruiker aan te maken*/
    @ModelAttribute(value = "nUser")
    public PersoonVoorDierenWinkel userToSave() {
        return new PersoonVoorDierenWinkel();
    }

    @ModelAttribute(value = "allUser")
    public Iterable<PersoonVoorDierenWinkel> getAllProducts() {
        return persoonDao.findAll();
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "login";
    }

    /*validatie van nieuwe gebruiker + opslaan van nieuwe gebruiker*/
    @RequestMapping(value ={"/login"} ,method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("nUser") @Valid PersoonVoorDierenWinkel nUser, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "login";

        persoonDao.save(nUser);
        return "redirect:/index";
    }
}
