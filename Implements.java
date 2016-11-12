/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnologia.pkg1;

/**
 *
 * @author ENEA
 */
public class Implements implements Runnable{
    private int[] array;
    
    public Implements(){
        this.array = new int[100];
    }
    
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            this.array[i] = (int)(Math.random() * 100);
        }
        
        for(int i = 0; i < 100; i++){
            System.out.println("Runnable " + (i+1) + "-" + this.array[i]);
        }
    }
    
}
