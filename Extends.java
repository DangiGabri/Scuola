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
public class Extends extends Thread{
    private int[] array;
    
    public Extends(){
        this.array=new int[100];
    }
    
    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            this.array[i] = (int)(Math.random() * 100);
        }
        
        for(int i = 0; i < 100; i++){
            System.out.println("Extends " + (i+1) + "-" + this.array[i]);
        }
    }
}
