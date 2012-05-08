/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.simulator;

import usm.simulacion.twitter.core.EventBus;
import usm.simulacion.twitter.core.TimeEvent;

/**
 *
 * @author camilovera
 */
public class SocialEventsSimulator {
    
    private EventBus eventBus;
    
    public SocialEventsSimulator(EventBus eventBus){
        this.eventBus = eventBus;
        bind();
    }
    
    private void bind(){
        this.eventBus.registerEventHandler(TimeEvent.TYPE,new usm.simulacion.twitter.core.TimeEventHandler() {

            @Override
            public void onTimeEvent(TimeEvent event) {
                SocialEventsSimulator.this.onTimeEvent(event.getTime());
            }
        });
        this.eventBus.registerEventHandler(NewTweetEvent.TYPE, new NewTweetEventHandler() {

            @Override
            public void onNewTweet(NewTweetEvent event) {
                SocialEventsSimulator.this.onNewTweet(event);
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
    
    /**
     * se ejecuta cada vez que recibe un evento de nuevo tweet
     * @param event 
     */
    public void onNewTweet(NewTweetEvent event){
        
    }
}
