package be.ehb.dymas_amin_eindproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BedanktController {

    @RequestMapping(value = {"/bedankt"}, method = RequestMethod.GET)
    public String showBedankt(ModelMap map) {
        return "bedankt";
    }
}
