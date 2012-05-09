package usm.simulacion.twitter;

import usm.simulacion.twitter.core.EventBus;
import usm.simulacion.twitter.core.LoopManager;
import usm.simulacion.twitter.core.SimulationEvent;
import usm.simulacion.twitter.simulator.NetworkConfigurator;
import usm.simulacion.twitter.simulator.SocialEventsSimulator;
import usm.simulacion.twitter.simulator.SocialNetworkSimulator;

/**
 *
 * @author camilovera
 */
public class MainSimulator {
    
    public static void main(String[] args){
        
        EventBus bus = new EventBus();
        LoopManager loopManager = new LoopManager(bus);
        SocialNetworkSimulator networkSimulator = new SocialNetworkSimulator(bus);
        SocialEventsSimulator eventsSimulator = new SocialEventsSimulator(bus);
        //Configuración: leer datos de entrada y asignar parametros al simulador
        NetworkConfigurator ns = networkSimulator;
        
        //Fin configuración
        //inicio de simulación
        bus.fireEvent(new SimulationEvent(SimulationEvent.START));
    }
    
}
