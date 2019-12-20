package be.ehb.dymas_amin_eindproject.model.Persoon;


import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Ahmadi Baloutaki Amin
 * */
public interface PersoonVoorDierenWinkelDAO extends CrudRepository<PersoonVoorDierenWinkel,Integer> {

    Optional<PersoonVoorDierenWinkel> findByMail(String email);
}
