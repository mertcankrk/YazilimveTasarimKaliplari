/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptorp;

/**
 *
 * @author Mert
 */
public class AdaptorP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        
        Kango kangoo = new Kango();
        
        System.out.println("Azami Hız Saatte"+kangoo.getSpeed()+" Mil");
        
        AdaptorImp AI = new AdaptorImp(kangoo);
        
        System.out.println("Azami Hız Saatte"+AI.getSpeed()+" Kilometre");
        
        
    
}
}
