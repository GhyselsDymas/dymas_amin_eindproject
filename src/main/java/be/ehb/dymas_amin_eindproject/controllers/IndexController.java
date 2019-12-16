package be.ehb.dymas_amin_eindproject.controllers;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;
import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Ahmadi Baloutaki Amin
 * */
@Controller
public class IndexController {

    @Autowired
    DierenProductDAO dao;

/*een modelatribute aangemaakt om alle producten te kunnen overlopen met Iterable */
    @ModelAttribute(value = "allPruducts")
    public Iterable<DierenProduct>getAllProducts(){
        return dao.findAll();
    }
/*RequestMapping om op de pagina index terecht tekomen*/
    @RequestMapping(value = {"/index","/"},method = RequestMethod.GET)
    public String showIndex(ModelMap map){
        return "index";
    }
}
