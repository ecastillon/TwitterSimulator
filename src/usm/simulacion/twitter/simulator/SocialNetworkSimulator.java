/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.simulator;

import usm.simulacion.twitter.core.EventBus;
import usm.simulacion.twitter.core.TimeEvent;

/**
 * Esta clase contiene la información de toda la red,
 * ademas de determinar cuando una persona genera un nuevo
 * tweet o re-tweet
 * @author camilovera
 */
public class SocialNetworkSimulator implements NetworkConfigurator {
    
    private EventBus eventBus;
    
    public SocialNetworkSimulator(EventBus eventBus){
        this.eventBus = eventBus;
        bind();
    }
    
    private void bind(){
        this.eventBus.registerEventHandler(TimeEvent.TYPE,new usm.simulacion.twitter.core.TimeEventHandler() {

            @Override
            public void onTimeEvent(TimeEvent event) {
                SocialNetworkSimulator.this.onTimeEvent(event.getTime());
            }
        });
    }
    
    
    /**
     * se ejecuta constantemente a medida que avanza la simulación.
     * implementa la generación de eventos relacionados con la red
     * @param time 
     */
    public void onTimeEvent(long time){
        
    }

    @Override
    public void addUser(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addFollower(User user, User folower) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addFollowing(User user, User folowing) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
