package be.ehb.dymas_amin_eindproject.model.DierenProduct;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author Ahmadi Baloutaki Amin
 * */

@Entity
public class DierenProduct {

    /*Ghysels Dymas*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank (message = "Product naam kan niet leeg zijn")
    private String productNaam;
    @DecimalMin(value = "0.01", message = "Prijs kan niet leeg zijn")
    @NotNull (message = "Prijs kan niet leeg zijn")
    private BigDecimal prijs;
    @NotBlank (message = "Geef een korte beschijving")
    private String beschrijving;
    @NotBlank (message = "Voor wat soort dier is dit")
    private String soort;
    @NotBlank (message = "Is het Voedsel, Speelgoed of iets anders")
    private String filterProduct;

    public DierenProduct() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductNaam() {
        return productNaam;
    }

    public void setProductNaam(String productNaam) {
        this.productNaam = productNaam;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getFilterProduct() {
        return filterProduct;
    }

    public void setFilterProduct(String filterProduct) {
        this.filterProduct = filterProduct;
    }
}
