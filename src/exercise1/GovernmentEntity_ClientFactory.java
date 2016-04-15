package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntity_ClientFactory implements ClientFactory {

    @Override
    public Client createClient(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        return new GovernmentEntity(InstitutionName, contactTel, TelDescription, personApplying);
    }

}
