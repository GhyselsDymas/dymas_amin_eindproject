package be.ehb.dymas_amin_eindproject.model.Persoon;


import be.ehb.dymas_amin_eindproject.model.DierenProduct.DierenProduct;
import org.springframework.data.repository.CrudRepository;
/**
 * @author Ahmadi Baloutaki Amin
 * */
public interface PersoonVoorDierenWinkelDAO extends CrudRepository<PersoonVoorDierenWinkel,Integer> {
    Iterable<PersoonVoorDierenWinkel> findByMail(String mail);
}
