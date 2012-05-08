/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.core;

/**
 *
 * @author camilovera
 */
public class TimeEvent implements Event<TimeEventHandler> {
    
    public static Type<TimeEventHandler> TYPE = new Type<TimeEventHandler>();
    
    private long time;
    
    public TimeEvent(long time) {
        this.time = time;
    }
    
    public long getTime(){
        return this.time;
    }

    @Override
    public Type<TimeEventHandler> getType() {
        return TYPE;
    }
    
    @Override
    public void dispach(TimeEventHandler eventHandler) {
        eventHandler.onTimeEvent(this);
    }
}
