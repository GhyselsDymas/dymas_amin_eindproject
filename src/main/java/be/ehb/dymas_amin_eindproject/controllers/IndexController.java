package be.ehb.dymas_amin_eindproject.controllers;

import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
    @Autowired
    DierenProductDAO dao;
}
