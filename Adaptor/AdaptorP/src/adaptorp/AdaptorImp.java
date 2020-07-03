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
public class AdaptorImp implements AracAdaptor{
    private Arac ticari;
    
    AdaptorImp(Arac kango){
        ticari=kango;
    }
    
    @Override
    public double getSpeed() {
          return MiliKilometreyeCevir(ticari.getSpeed());
    }
    
    private double MiliKilometreyeCevir(double mph) {
        return mph * 1.60934;
    }
    

}
