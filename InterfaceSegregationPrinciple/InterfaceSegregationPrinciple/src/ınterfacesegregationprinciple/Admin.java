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
public class Admin implements BanAtmak,TakipEtmek,MesajGöndermek{

    @Override
    public void BanAtmak() {
        System.out.println("Admin Banlama Yetkisi");
    }

    @Override
    public void TakipEtmek() {
          System.out.println("Admin Takip Etme Yetkisi");
    }

    @Override
    public void MesajGöndermek() {
           System.out.println("Admin Mesaj Gönderme Yetkisi");
    }
    
}
