package be.ehb.dymas_amin_eindproject.model.Persoon;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
/**
 * @author Ahmadi Baloutaki Amin
* */
@Entity
public
class PersoonVoorDierenWinkel {

    /*Ahmadi Baloutaki Amin */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersoon;
    @NotEmpty(message = "voornaam mag niet leeg zijn")
    private String voorNaam;
    @NotEmpty(message = "achternaam mag niet leeg zijn")
    private String achterNaam;
    @NotEmpty(message = "mail mag niet leeg zijn")
    private String mail;
    @NotEmpty(message = "telefoon-nummer mag niet leeg zijn")
    private String telefoonNr;
    @NotEmpty(message = "straatnaam mag niet leeg zijn")
    private String straatNaam;
    @NotEmpty(message = "huisnummer mag niet leeg zijn")
    private String huisNr;
    @NotEmpty(message = "postcode mag niet leeg zijn")
    private String postCode;
    @NotEmpty(message = "stad mag niet leeg zijn")
    private String gemeente;

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getHuisNr() {
        return huisNr;
    }

        public void setHuisNr(String huisNr) {
        this.huisNr = huisNr;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }
}




