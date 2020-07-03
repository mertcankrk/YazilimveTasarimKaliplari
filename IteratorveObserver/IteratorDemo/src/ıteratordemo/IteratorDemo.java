/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıteratordemo;

/**
 *
 * @author Mert
 */
public class IteratorDemo extends Thread{
 Repo namesRepository = new Repo();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IteratorDemo ıt = new IteratorDemo();
        ıt.start();
    
    }
    
     @Override
    public void run() {
          for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         int sayi = (Integer)iter.next();
         System.out.println("sayı = " + sayi);
      } 
    }
    
}
