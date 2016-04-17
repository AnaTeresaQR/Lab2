package exercise1.ConcreteClients;

import exercise1.ConcreteObjects.Person;
import exercise1.*;

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
