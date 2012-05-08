/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.simulator;

import java.util.List;

/**
 *
 * @author camilovera
 */
public interface User {
    
    public String getName();
    public int getId();
    public List<User> getFollowers();
    public List<User> getFollowings();
    public List<Tweet> getFollowersTweets();
    public List<Tweet> getOwnTweets();
}
