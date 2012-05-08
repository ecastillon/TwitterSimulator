/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usm.simulacion.twitter.core;

/**
 *
 * @author camilovera
 */
public class Registrator {
    private Type t;
    private EventHandler h;

    protected EventHandler getH() {
        return h;
    }

    protected void setH(EventHandler h) {
        this.h = h;
    }

    protected Type getT() {
        return t;
    }

    protected void setT(Type t) {
        this.t = t;
    }
    
    
}
