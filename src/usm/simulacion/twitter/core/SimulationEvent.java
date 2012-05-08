package usm.simulacion.twitter.core;

/**
 *
 * @author camilovera
 */
public class SimulationEvent implements Event<SimulationEventHandler> {

    public static final int START = 1;
    public static final int FINISH = 2;
    
    public static Type<SimulationEventHandler> TYPE = new Type<SimulationEventHandler>();
    
    private int state;
    
    
    public SimulationEvent(int state){
        this.state = state;
    }

    public int getState() {
        return state;
    }
    
    @Override
    public Type<SimulationEventHandler> getType() {
        return TYPE;
    }

    @Override
    public void dispach(SimulationEventHandler eventHandler) {
        eventHandler.onSimulationEvent(this);
    }
    
}
