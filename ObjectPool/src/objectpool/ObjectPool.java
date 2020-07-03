package objectpool;

import java.util.ArrayList;
import java.util.Stack;

class thread extends Thread {

    private alici alici;
    private ObjectPool objectPool;

    public thread(ObjectPool objectPool, alici alici) {
        this.objectPool = objectPool;
        this.alici = alici;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (objectPool.flag) {
            System.out.println("Havuz Boş");
        } else {
            Global.tampon--;
            System.out.println("Havuzdan Alındı");
            alici = objectPool.takeProduct();
            try {
                Thread.sleep((long) (Math.random()*25000));
            }catch (InterruptedException e) {
            e.printStackTrace();
        }
            objectPool.releaseProduct(alici);
            System.out.print("Havuza Verildi Güncel Havuz Boyutu = ");
            objectPool.havuzBüyüklügü();
        }
    }

}

class alici {

}

public class ObjectPool {

    public static final int buyukluk = 5;
    //private int sayac = 0;
    private static Stack<alici> havuz;
    private static ObjectPool instance;
    public boolean flag = false;


  

    public static void main(String[] args) {
        ObjectPool pool = ObjectPool.getInstance();

        for (int i = 0; i < buyukluk; i++) {
            alici p = new alici();
            havuz.add(p);
        }


        alici product1 = null;

     
       while(Global.tampon >1){
            thread thread = new thread(pool, product1);
           
                 thread.start();
     
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
       }
       
    }
    
        private ObjectPool() {
        havuz = new Stack<alici>();
    }

    public static ObjectPool getInstance() {

        if (instance == null) {
            synchronized (ObjectPool.class) {
                if (instance == null) {
                    instance = new ObjectPool();
                }
            }
        }
        return instance;
    }

    synchronized alici takeProduct() {
        if (havuz.size() > 1 && havuz.size() < 6) {
            flag = false;
            return this.havuz.pop();
        } else {
            flag = true;
            return this.havuz.pop();
        }
    }
    
    
      void havuzBüyüklügü() {
        System.out.println(havuz.size());
    }

    synchronized void releaseProduct(alici p) {
        havuz.add(p);
        flag = false;
        
    }
}
