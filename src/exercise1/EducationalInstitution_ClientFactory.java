package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class EducationalInstitution_ClientFactory implements ClientFactory {

    @Override
    public Client createClient(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        return new EducationalInstitution(InstitutionName, contactTel, TelDescription, personApplying);
    }

}
