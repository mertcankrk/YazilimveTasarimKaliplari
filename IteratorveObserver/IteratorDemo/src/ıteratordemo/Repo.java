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
public class Repo implements Container{
     public int numbers[] = {1,2,3,4};

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {

      int tampon;

      @Override
      public boolean hasNext() {
      
         if(tampon < numbers.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return numbers[tampon++];
         }
         return null;
      }		
   }
}
