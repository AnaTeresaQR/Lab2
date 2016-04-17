package exercise1.ConcreteClients;

import exercise1.Person;

/**
 *
 * @author Ana Teresa
 */
public class GeneralClient {

    private String contactTel;
    private Person personApplying;

    public GeneralClient() {
    }

    public GeneralClient(String contactTel, Person personApplying) {
        this.contactTel = contactTel;
        this.personApplying = personApplying;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public Person getPersonApplying() {
        return personApplying;
    }

    public void setPersonApplying(Person personApplying) {
        this.personApplying = personApplying;
    }

    @Override
    public String toString() {
        return "Client{" + "contactTel: " + contactTel + "\nPersonApplying: " + personApplying;
    }

}
