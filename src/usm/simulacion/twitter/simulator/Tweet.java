/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.simulator;

/**
 *
 * @author camilovera
 */
public interface Tweet {
    
    public String getMesagge();
    public int getId();
    public int getSteps();
    public User getOwner();
}
