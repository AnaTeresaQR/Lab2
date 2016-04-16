package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class EducationalInstitutionBuilder extends ClientGroupBuilder {

    @Override
    public GrupalClient createSpecificGroupClient() {
        return new EducationalInstitution();
    }
}
