package usm.simulacion.twitter.core;

/**
 *
 * @author camilovera
 */
public class LoopManager {
    
    private EventBus eventBus;
    private long simulationTime;
    private boolean working;
    
    public LoopManager(EventBus eventBus){
        this.simulationTime = 0;
        this.working = false;
        this.eventBus = eventBus;
        bind();
    }
    
    public long getSimulationTime(){
        return simulationTime;
    }
    
    private void bind(){
        eventBus.registerEventHandler(SimulationEvent.TYPE, new SimulationEventHandler() {

            @Override
            public void onSimulationEvent(SimulationEvent event) {
                if(event.getState() == SimulationEvent.START){
                    working = true;
                    startLooping();
                }else if(event.getState() == SimulationEvent.FINISH){
                    working = false;
                }
            }
        });
    }
    
    private void startLooping(){
        while(working){
            eventBus.fireEvent(new TimeEvent(simulationTime));
            simulationTime++;
        }
    }
}
