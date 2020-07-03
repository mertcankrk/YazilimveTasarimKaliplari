/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınterfacesegregationprinciple;

/**
 *
 * @author Mert
 */
public class kuşlar implements Uçmak,Koşmak{

    @Override
    public void uçmak() {
              System.out.println("kuş, uçmak");
    }

    @Override
    public void koşmak() {
        System.out.println("kuş, koşmak");
    }
    
}
