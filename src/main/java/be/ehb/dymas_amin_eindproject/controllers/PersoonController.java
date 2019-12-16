package be.ehb.dymas_amin_eindproject.controllers;
/**
 * @author Ahmadi Baloutaki Amin
 * */

import be.ehb.dymas_amin_eindproject.model.Persoon.PersoonVoorDierenWinkel;
import be.ehb.dymas_amin_eindproject.model.Persoon.PersoonVoorDierenWinkelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PersoonController {

    @Autowired
    PersoonVoorDierenWinkelDAO persoondao;


    @ModelAttribute(value = "nUser")
    public PersoonVoorDierenWinkel userToSave() {
        return new PersoonVoorDierenWinkel();
    }
}
