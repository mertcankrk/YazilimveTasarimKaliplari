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
public class Kullanıcı implements TakipEtmek,MesajGöndermek{

    @Override
    public void TakipEtmek() {
        System.out.println("Kullanıcı Takip Etme Yetkisi");
    }

    @Override
    public void MesajGöndermek() {
        System.out.println("Kullanıcı Mesja Gönderme Yetkisi");
    }
    
}
