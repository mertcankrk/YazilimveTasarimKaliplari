/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementop;

import java.util.ArrayList;

/**
 *
 * @author Mert
 */
public class Caretaker {
      private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
        mementos.add(m);
    }

    public Memento getMemento() {
        return mementos.get(1);
    }
}
