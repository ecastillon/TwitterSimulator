/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.simulator;

import usm.simulacion.twitter.core.Event;
import usm.simulacion.twitter.core.Type;

/**
 *
 * @author camilovera
 */
public class NewReTweetEvent implements Event<NewReTweetEventHandler> {
    
    public static Type<NewReTweetEventHandler> TYPE = new Type<NewReTweetEventHandler>();
    
    private User user;
    private Tweet tweet;
    
    public NewReTweetEvent(User user, Tweet tweet){
        this.user = user;
        this.tweet = tweet;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public User getUser() {
        return user;
    }

    @Override
    public Type<NewReTweetEventHandler> getType() {
        return TYPE;
    }

    @Override
    public void dispach(NewReTweetEventHandler eventHandler) {
        eventHandler.onReTweet(this);
    }
    
}
