package exercise1.ConcreteClients;

import exercise1.ConcreteObjects.Person;

/**
 *
 * @author Ana Teresa
 */
public class GroupClient extends GeneralClient {

    private String InstitutionName;
    private String TelDescription;

    public GroupClient() {
    }

    public GroupClient(String InstitutionName, String TelDescription, String contactTel, Person personApplying) {
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

    public String show() {
        return super.toString() + "\n" + "InstitutionName: " + InstitutionName + ", TelDescription: " + TelDescription + '}';
    }

}
