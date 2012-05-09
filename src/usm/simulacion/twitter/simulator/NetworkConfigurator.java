/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.simulator;

/**
 *
 * @author camilovera
 */
public interface NetworkConfigurator {
    public void addUser(User user);
    public void addFollower(User user, User folower);
    public void addFollowing(User user, User folowing);
}
