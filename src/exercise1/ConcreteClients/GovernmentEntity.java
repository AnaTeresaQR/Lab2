package exercise1.ConcreteClients;

import exercise1.ConcreteObjects.Person;


/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntity extends GroupClient {

    public GovernmentEntity() {
    }

    public GovernmentEntity(String InstitutionName, String TelDescription, String contactTel, Person personApplying) {
        super(InstitutionName, TelDescription, contactTel, personApplying);
    }
    
    @Override
    public String toString() {
        return super.show();
    }

}
