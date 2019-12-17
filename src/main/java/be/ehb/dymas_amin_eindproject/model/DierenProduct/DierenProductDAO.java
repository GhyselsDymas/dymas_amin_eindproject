package be.ehb.dymas_amin_eindproject.model.DierenProduct;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author Ghysels dymas
 * */

public interface DierenProductDAO extends CrudRepository <DierenProduct, Integer> {

    Iterable<DierenProduct> findBySoort(String soort);

}
