package be.ehb.dymas_amin_eindproject.model.Persoon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
/**
 * @author Ahmadi Baloutaki Amin
* */
@Entity
class PersoonVoorDierenWinkel {

    /*Ahmadi Baloutaki Amin */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersoon;
    @NotNull
    private String voorNaam;
    @NotNull
    private String achterNaam;
    @NotNull
    private String telefoonNr;
    @NotNull
    private String straatNaam;
    @NotNull
    private int huisNr;
    @NotNull
    private String postcode;

    public PersoonVoorDierenWinkel() {
    }

    public int getIdPersoon() {
        return idPersoon;
    }

    public void setIdPersoon(int idPersoon) {
        this.idPersoon = idPersoon;
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public String getTelefoonNr() {
        return telefoonNr;
    }

    public void setTelefoonNr(String telefoonNr) {
        this.telefoonNr = telefoonNr;
    }

    public String getStraatNaam() {
        return straatNaam;
    }

    public void setStraatNaam(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public int getHuisNr() {
        return huisNr;
    }

    public void setHuisNr(int huisNr) {
        this.huisNr = huisNr;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
