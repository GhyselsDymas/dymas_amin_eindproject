package be.ehb.dymas_amin_eindproject.controllers;

import be.ehb.dymas_amin_eindproject.model.Persoon.PersoonVoorDierenWinkel;
import be.ehb.dymas_amin_eindproject.model.Persoon.PersoonVoorDierenWinkelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    /*validatie van nieuwe gebruiker + opslaan van nieuwe gebruiker*/
    @RequestMapping(value ={"/menu"} ,method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("nUser") @Valid PersoonVoorDierenWinkel nProduct, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "login";

        persoonDao.save(nProduct);
        return "redirect:/index";
    }
}
