package exercise1;

import exercise1.ConcreteClients.GroupClient;

/**
 *
 * @author Ana Teresa
 */
public class EducationalInstitution extends GroupClient {

    public EducationalInstitution() {
    }

    public EducationalInstitution(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        super(InstitutionName, contactTel, TelDescription, personApplying);
    }

}
