package exercise1.AbstractClientBuilders;

import exercise1.ConcreteObjects.Person;
import exercise1.Exceptions.ClientException;
import exercise1.ConcreteClients.GeneralClient;
import exercise1.ConcreteClients.IndividualPerson;

/**
 *
 * @author Ana Teresa
 */
public class ClientGeneralBuilder implements AbstractGeneralClientBuilder {
    
    private GeneralClient client;
    
    public ClientGeneralBuilder() {
        
    }
    
    @Override
    public void createContactTel(String contactTel) throws ClientException {
        if (contactTel != null && !contactTel.equals("")) {
            client.setContactTel(contactTel);
        } else {
            throw new ClientException("El teléfono de contacto es requerido");
        }
    }
    
    @Override
    public void createPersonApplying(Person personApplying) throws ClientException {
        if (createPerson(personApplying)) {
            client.setPersonApplying(personApplying);
        } else {
            throw new ClientException("Se requiere una persona solicitante");
        }
    }
    
    private boolean createPerson(Person person) throws ClientException {
        if (person == null) {
            throw new ClientException("La persona no puede ser creada porque no existe");
        } else {
            String schedule = person.getSchedule();
            String name = person.getName();
            String secondName = person.getSecondName();
            String lastName = person.getLastName();
            String secondLastName = person.getSecondLastName();
            
            if ((schedule != null && !schedule.equals(""))
                    && (name != null && !name.equals(""))
                    && (secondName != null && !secondName.equals(""))
                    && (lastName != null && !lastName.equals(""))
                    && (secondLastName != null && !secondLastName.equals(""))) {
                
                return true;
            } else {
                throw new ClientException("La personas no puede ser creada");
            }
        }
    }
    
    public void setClient(GeneralClient client) {
        this.client = client;
    }
    
    @Override
    public GeneralClient getClient() {
        return client;
    }
    
    @Override
    public void createSpecificGroupClient() {
        setClient(new IndividualPerson());
    }
    
}
