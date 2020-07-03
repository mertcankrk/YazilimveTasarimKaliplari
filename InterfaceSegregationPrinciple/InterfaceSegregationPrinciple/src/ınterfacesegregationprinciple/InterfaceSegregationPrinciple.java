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
public class InterfaceSegregationPrinciple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
   Kullanıcı k = new Kullanıcı();
   Admin a = new Admin();
   
   a.BanAtmak();
   a.MesajGöndermek();
   a.TakipEtmek();
   
   k.MesajGöndermek();
   k.TakipEtmek();
                
        
    }
    
}
