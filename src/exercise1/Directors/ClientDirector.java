package exercise1.Directors;

import exercise1.AbstractClientBuilders.AbstractGeneralClientBuilder;
import exercise1.AbstractClientBuilders.AbstractClientBuilder;
import exercise1.AbstractClientBuilders.ClientGeneralBuilder;
import exercise1.AbstractClientBuilders.ClientGroupBuilder;
import exercise1.Exceptions.ClientException;
import exercise1.ConcreteClients.GeneralClient;
import exercise1.ConcreteClients.GroupClient;
import exercise1.ConcreteObjects.Person;

/**
 *
 * @author Ana Teresa
 */
public class ClientDirector {

    public GeneralClient createIndividualClient(AbstractGeneralClientBuilder builder, String contactTel, Person personApplying) throws ClientException {
        if (builder == null) {
            throw new ClientException("No se puede crear la instancia de cliente correctamente");
        }
        builder.createSpecificGroupClient();
        builder.createContactTel(contactTel);
        builder.createPersonApplying(personApplying);

        return builder.getClient();
    }

    public GroupClient createGroupClient(AbstractClientBuilder builder, String InstitutionName, String TelDescription, String contactTel, Person personApplying) throws ClientException {
        if (builder == null) {
            throw new ClientException("No se puede crear la instancia de cliente correctamente");
        }
        builder.createSpecificGroupClient();
        builder.createInstitutionName(InstitutionName);
        builder.createTelDescription(TelDescription);
        builder.createContactTel(contactTel);
        builder.createPersonApplying(personApplying);
        return (GroupClient) builder.getClient();

    }

}
