package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class ClientDirector {

    public GeneralClient createIndividualClient(AbstractGeneralClientBuilder builder, String contactTel, Person personApplying) throws ClientException {
        if (builder == null) {
            builder = new ClientGeneralBuilder();
        }
        builder.createContactTel(contactTel);
        builder.createPersonApplying(personApplying);

        return builder.getClient();
    }

    public GrupalClient createGrupalClient(AbstractClientBuilder builder, String InstitutionName, String TelDescription, String contactTel, Person personApplying) throws ClientException {
        if (builder == null) {
            builder = new ClientGroupBuilder();
        }
        builder.createInstitutionName(contactTel);
        builder.createTelDescription(TelDescription);
        builder.createContactTel(contactTel);
        builder.createPersonApplying(personApplying);
        return null;

    }

}
