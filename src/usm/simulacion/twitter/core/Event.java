/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.core;

/**
 *
 * @author camilovera
 */
public interface Event<H extends EventHandler> {
    public Type<H> getType();
    public void dispach(H eventHandler);
}
