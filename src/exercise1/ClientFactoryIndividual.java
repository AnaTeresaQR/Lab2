package exercise1;

/**
 *
 * @author Ana Teresa
 */
public interface ClientFactoryIndividual {

    AbstractGeneralClientBuilder abstGeneralC = new ClientGeneralBuilder();
    ClientDirector clientDirector = new ClientDirector();

    public GeneralClient createClient(String contactTel, Person personApplying) throws ClientException;

}
