package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntity extends GrupalClient {

    public GovernmentEntity() {
    }

    public GovernmentEntity(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        super(InstitutionName, contactTel, TelDescription, personApplying);
    }

}
