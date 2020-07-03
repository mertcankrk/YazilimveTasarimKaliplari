 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementop;

/**
 *
 * @author Mert
 */
public class Originator {
     private String state;
   /* lots of memory consumptive private data that is not necessary to define the
    * state and should thus not be saved. Hence the small memento object. */

    public void setState(String state) {
        System.out.println("State ayarlandı" + state);
        this.state = state;
    }

    public Memento save() {
        System.out.println("Memento kaydedildi");
        return new Memento(state);
    }
    public void restore(Memento m) {
        state = m.getState();
        System.out.println("restoreden sonra memento: " + state);
    }
}
