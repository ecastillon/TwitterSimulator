/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.simulator;

import usm.simulacion.twitter.core.EventHandler;

/**
 *
 * @author camilovera
 */
public interface NewReTweetEventHandler extends EventHandler {
    void onReTweet(NewReTweetEvent event);
}
