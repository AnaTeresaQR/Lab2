package exercise1.FactoryStrategy;

import exercise1.ConcreteClients.GeneralClient;
import exercise1.Strategy.AbstractGainStrategy;

/**
 *
 * @author Ana Teresa
 */
public interface InterfaceSelectStrategy {

    public AbstractGainStrategy chooseStrategy(GeneralClient client);
}
