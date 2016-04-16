package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntity extends GrupalClient {

    public GovernmentEntity() {
    }

    public GovernmentEntity(String InstitutionName, String TelDescription, String contactTel, Person personApplying) {
        super(InstitutionName, TelDescription, contactTel, personApplying);
    }

}
