package exercise1.ConcreteClientBuilders;

import exercise1.AbstractClientBuilders.ClientGroupBuilder;
import exercise1.ConcreteClients.EducationalInstitution;
import exercise1.ConcreteClients.GroupClient;

/**
 *
 * @author Ana Teresa
 */
public class EducationalInstitutionBuilder extends ClientGroupBuilder {

    @Override
    public GroupClient createSpecificGroupClient() {
        return new EducationalInstitution();
    }
}
