package be.ehb.dymas_amin_eindproject.controllers;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;
import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Ghysels dymas
 * */

@Controller
public class FilterController {

    @Autowired
    DierenProductDAO dao;

    /*een modelatribute aangemaakt om alle producten te kunnen overlopen met Iterable */
    @ModelAttribute(value = "allSoort")
    public Iterable<DierenProduct> findAll() {
        return dao.findAll();
    }

    /*RequestMapping om op de pagina index terecht te komen, het zorgt voor te filteren op soort*/
    @RequestMapping(value = {"/soortFilter/{soort}"}, method = RequestMethod.GET)
    public String showFilterSoort(ModelMap map , @PathVariable(value = "soort") String soort) {
        map.addAttribute("TheSoort", dao.findBySoort(soort));
        return "soortFilter";
    }
}
