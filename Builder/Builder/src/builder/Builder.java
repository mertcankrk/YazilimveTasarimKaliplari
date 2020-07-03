/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;




/**
 *
 * @author Mert
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlmanTank AT = new AlmanTank();
        Contractor CT = new Contractor(AT);
        CT.buildTank();
        

        System.out.println("Canon = "+CT.getTank().Canon);
        System.out.println("Engine = "+CT.getTank().Engine);
        System.out.println("Palet = "+CT.getTank().Palet);
    }

}


   interface TankBuilder {

        public Tank getTank();

        public void builtPalet();

        public void buildtEngine();

        public void buildCanon();
 
    }

  
    class Tank {

        public String Palet;
        public String Engine;
        public String Canon;

        public void setCanon(String tampon) {
            this.Canon=tampon;
        }

        public void setEngine(String tampon) {
            this.Engine = tampon;
        }

        public void setPalet(String tampon) {
            this.Palet = tampon;
        }

    }

    class Contractor {

        private TankBuilder TankB;

        Contractor(TankBuilder TB) {
            this.TankB = TB;
        }

        public Tank getTank() {
      
           return TankB.getTank();
        }

        public void buildTank() {

            TankB.buildCanon();
            TankB.buildtEngine();
            TankB.builtPalet();

        }

    }
    
 class AlmanTank implements TankBuilder{

     private Tank AlmanTanki = new Tank();
     
    @Override
    public Tank getTank() {
     return this.AlmanTanki;
    }

    @Override
    public void builtPalet() {
       AlmanTanki.setPalet("Dişli Palet");
    }

    @Override
    public void buildtEngine() {
      AlmanTanki.setEngine("Dizel Motor");
    }

    @Override
    public void buildCanon() {
      AlmanTanki.setCanon("Uzun Menzilli");
    }
      
  }

class JaponTank implements TankBuilder{
    
      private Tank JaponTanki = new Tank();
     
    @Override
    public Tank getTank() {
        return this.JaponTanki;
    }

    @Override
    public void builtPalet() {
       JaponTanki.setPalet("Hızlı Palet");
    }

    @Override
    public void buildtEngine() {
      JaponTanki.setEngine("Yakıt Motoru");
    }

    @Override
    public void buildCanon() {
      JaponTanki.setCanon("Kısa Menzilli");
    }
      
    
}



