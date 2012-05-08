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
public class NewTweetEvent implements Event<NewTweetEventHandler>{

    public static Type<NewTweetEventHandler> TYPE = new Type<NewTweetEventHandler>();
    
    private User user;
    private Tweet tweet;
    
    public NewTweetEvent(User user, Tweet tweet){
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
    public Type<NewTweetEventHandler> getType() {
        return TYPE;
    }

    @Override
    public void dispach(NewTweetEventHandler eventHandler) {
        eventHandler.onNewTweet(this);
    }
    
}
