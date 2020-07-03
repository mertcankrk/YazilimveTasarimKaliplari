
package observerdemo;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void doNotify();

}

class DolarKur implements Subject{

    private List<Observer> observerList;
    private double price;
    private double tampo;
    

    DolarKur(double price){
        observerList = new ArrayList<>();
        this.price=price;
    }
    
    public void setPrice(double price) {
        tampo=this.price;
        this.price = price;
        doNotify();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void doNotify() {
        for (Observer observer : observerList) {
           if(observer.getClass()==DolarKurMusteri1.class){
           if(checkprice()==true){
               observer.update(price);
           }
           }
            if(observer.getClass()==DolarKurMusteri2.class){
           if(checkprice2()==true){
               observer.update(price);
           }
           }
        }
    }
    
    public boolean checkprice(){
        if(Math.abs(price-tampo)<0.8){
            return true; 
        } 
        return false;
    }
    
     public boolean checkprice2(){
        if(Math.abs(price-tampo)<0.2){
           
            return true;
            
        } 
        return false;
    
    }
            

}
 interface Observer {
    void update(double price);
}


class DolarKurMusteri1 implements Observer {

    @Override
    public void update(double price) {
        System.out.println("tip1: "+price);
    }

}

class DolarKurMusteri2 implements Observer {

    @Override
    public void update(double price) {
        System.out.println("tip2: "+price);
    }
}

public class ObserverDemo {

    public static void main(String[] args) {
      DolarKur dolarkur=new DolarKur(7.1);
      DolarKurMusteri1 dc1=new DolarKurMusteri1();
      DolarKurMusteri2 dc2=new DolarKurMusteri2();
      
      dolarkur.addObserver(dc1);
      dolarkur.addObserver(dc2);
     
      
       priceThread pt=new priceThread(dolarkur);
        pt.start();


    }
    
}

class priceThread extends Thread{
    DolarKur dk;
    priceThread(DolarKur dolarkur){
        this.dk=dolarkur;
    }
    
    @Override
    public void run() {
        double kur=5.00;
        double artisMiktari;
        for (int i = 0; i < 12; i++) {
            artisMiktari = (Math.random() * 50)%1;
            kur=kur+artisMiktari;
            System.out.println("güncel dolar kuru ="+kur);
            dk.setPrice(kur);
            
        }
    }
    
}
