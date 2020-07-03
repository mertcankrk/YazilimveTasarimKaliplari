/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.ArrayList;

/**
 *
 * @author Mert
 */
public class Prototype {

    class Motor {
        String isim;
        public String pistontipi;
        int pistonsayisi;
        float motorhacmi;
        public ArrayList<String> arabalar;

        public Motor() {

        }

        public Motor(int pistons, String pistont, float motorh,String isim) {
            this.isim = isim;
            this.pistonsayisi = pistons;
            this.motorhacmi = motorh;
            this.pistontipi = pistont;
            this.arabalar = new ArrayList<String>();
        }

        public void yazdir() {
            System.out.println("motorun ismi ="+ isim);
            System.out.println("Piston Sayisi = " + this.pistonsayisi);
            System.out.println("Motor Hacmi = " + this.motorhacmi);
            System.out.println("Piston Yipi = " + this.pistontipi);
            System.out.print("Motorun Kullanıldığı Arabalar =");
            for (int i = 0; i < this.arabalar.size(); i++) {
                System.out.print(this.arabalar.get(i) + " ");

            }
            System.out.println(" ");
            System.out.println(" ");
        }

        public void Arabaekle(String tampon) {
            this.arabalar.add(tampon);

        }

        public Motor Shallowcopy() {
            return this;
        }

        public Motor Deepcopy() {
            Motor tampon = new Motor();
            tampon.isim = this.isim;
            tampon.motorhacmi = this.motorhacmi;
            tampon.pistonsayisi = this.pistonsayisi;
            tampon.pistontipi = this.pistontipi;
            tampon.arabalar = new ArrayList<String>(this.arabalar);
            return tampon;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Prototype p1 = new Prototype();

        Prototype.Motor motor1 = p1.new Motor(6, "sıralı", 2,"motor1");
        motor1.Arabaekle("kango");
        motor1.Arabaekle("doblo");

        Motor motor2 = motor1.Shallowcopy();
        Motor motor3 = motor1.Deepcopy();
        
        
        motor1.yazdir();
        motor2.yazdir();
        motor3.yazdir();
        
        System.out.println("----------------------------------");
        
        
        motor1.isim="2jk";
        motor1.Arabaekle("partner");
        
        motor1.yazdir();
        motor2.yazdir();
        motor3.yazdir();
        
    }

}
