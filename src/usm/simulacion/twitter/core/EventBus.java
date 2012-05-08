/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author camilovera
 */
public class EventBus {
    
    private Map<Type,List<EventHandler>> handlers;
    
    
    public EventBus(){
        handlers = new HashMap<Type, List<EventHandler>>();
    }
    
    public void fireEvent(Event event){
        if(handlers.containsKey(event.getType())){
            List<EventHandler> handlerList = handlers.get(event.getType());
            for(EventHandler handler:handlerList){
                event.dispach(handler);
            }
        }
    }
    
    public Registrator registerEventHandler(Type t,EventHandler handler){   
        if(handlers.containsKey(t)){
            handlers.get(t).add(handler);
        }else{
            List<EventHandler> handlerList = new ArrayList<EventHandler>();
            handlerList.add(handler);
            handlers.put(t, handlerList);
        }
        Registrator r = new Registrator();
        r.setH(handler);
        r.setT(t);
        return r;
    }
    
    public void DeregisterEventHandler(Registrator registrator){
        if(handlers.containsKey(registrator.getT())){
            handlers.get(registrator.getT()).remove(registrator.getH());
        }
    }
    
}
