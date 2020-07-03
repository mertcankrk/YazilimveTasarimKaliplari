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
public class köpek implements Koşmak,Havlamak{

    
    @Override
    public void koşmak() {
              System.out.println("köpek, koşmak");
    }

    @Override
    public void havlamak() {
             System.out.println("köpek, havlamak");
    }
    
}
