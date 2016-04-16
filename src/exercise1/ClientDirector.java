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
            throw new ClientException("No se puede crear la instancia de cliente correctamente");
        }
        builder.createSpecificGroupClient();
        builder.createInstitutionName(InstitutionName);
        builder.createTelDescription(TelDescription);
        builder.createContactTel(contactTel);
        builder.createPersonApplying(personApplying);
        return builder.getgClient();

    }

}
