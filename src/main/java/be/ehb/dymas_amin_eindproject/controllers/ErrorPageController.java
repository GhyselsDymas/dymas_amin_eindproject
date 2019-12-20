package be.ehb.dymas_amin_eindproject.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ErrorPageController {

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String showError(ModelMap map) {
        return "error";
    }
}
