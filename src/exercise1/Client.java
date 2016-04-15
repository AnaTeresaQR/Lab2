package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class Client {

    private String InstitutionName;
    private String contactTel;
    private String TelDescription;
    private Person personApplying;

    public Client(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        this.InstitutionName = InstitutionName;
        this.contactTel = contactTel;
        this.TelDescription = TelDescription;
        this.personApplying = personApplying;
    }

    public String getInstitutionName() {
        return InstitutionName;
    }

    public void setInstitutionName(String InstitutionName) {
        this.InstitutionName = InstitutionName;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getTelDescription() {
        return TelDescription;
    }

    public void setTelDescription(String TelDescription) {
        this.TelDescription = TelDescription;
    }

    public Person getPersonApplying() {
        return personApplying;
    }

    public void setPersonApplying(Person personApplying) throws EventsException {
        this.personApplying = personApplying;
    }

    @Override
    public String toString() {
        return "Client{" + "InstitutionName: " + InstitutionName + "\ncontactTel: " + contactTel + ", TelDescription: " + TelDescription + "\npersonApplying: " + personApplying + '}';
    }

}
