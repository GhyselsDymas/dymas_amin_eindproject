package be.ehb.dymas_amin_eindproject.model.DierenProduct;

import org.springframework.data.repository.CrudRepository;


/**
 * @author Ghysels dymas
 * */

public interface DierenProductDAO extends CrudRepository <DierenProduct, Integer> {

    Iterable<DierenProduct> findBySoort(String soort);

    Iterable<DierenProduct> findByFilterProduct(String filterProduct);
}
