/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.core;

/**
 *
 * @author camilovera
 */
public interface SimulationEventHandler extends EventHandler {
    void onSimulationEvent(SimulationEvent event);
}
