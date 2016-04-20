/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.FactoryStrategy;

import exercise1.ConcreteClients.EducationalInstitution;
import exercise1.ConcreteClients.GeneralClient;
import exercise1.ConcreteClients.GovernmentEntity;
import exercise1.Strategy.AbstractGainStrategy;
import exercise1.Strategy.EducationalInstitutionGain;
import exercise1.Strategy.GovernmentEntityGain;
import exercise1.Strategy.PrivateEntityGain;

/**
 *
 * @author Ana Teresa
 */
public class SelectStrategy implements InterfaceSelectStrategy {

    @Override
    public AbstractGainStrategy chooseStrategy(GeneralClient client) {
        if (client instanceof EducationalInstitution) {
            return new EducationalInstitutionGain();
        } else if (client instanceof GovernmentEntity) {
            return new GovernmentEntityGain();
        } else {
            return new PrivateEntityGain();
        }

    }
}
