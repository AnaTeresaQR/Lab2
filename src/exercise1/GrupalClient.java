package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class GrupalClient extends GeneralClient {

    private String InstitutionName;
    private String TelDescription;

    public GrupalClient() {
    }

    public GrupalClient(String InstitutionName, String TelDescription, String contactTel, Person personApplying) {
        super(contactTel, personApplying);
        this.InstitutionName = InstitutionName;
        this.TelDescription = TelDescription;
    }

    public String getInstitutionName() {
        return InstitutionName;
    }

    public void setInstitutionName(String InstitutionName) {
        this.InstitutionName = InstitutionName;
    }

    public String getTelDescription() {
        return TelDescription;
    }

    public void setTelDescription(String TelDescription) {
        this.TelDescription = TelDescription;
    }

    @Override
    public String toString() {
        return super.toString() + " InstitutionName: " + InstitutionName + ", TelDescription: " + TelDescription + '}';
    }

}
