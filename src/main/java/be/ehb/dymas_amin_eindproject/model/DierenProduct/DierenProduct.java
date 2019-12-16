package be.ehb.dymas_amin_eindproject.model.DierenProduct;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DierenProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
