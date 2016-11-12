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
public class Tecnologia1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread a = new Thread(new Implements());
        Extends b = new Extends();
        
        a.start();
        try {
            a.join();
        } catch (Exception e) {
        }
        b.start();
    }    
}
