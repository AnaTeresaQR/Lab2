package exercise1.ConcreteClients;

import exercise1.ConcreteObjects.Person;


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

    @Override
    public String toString() {
        return super.show();
    }
    
    

}
