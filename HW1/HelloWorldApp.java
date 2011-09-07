/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author andrewgarin
 */
public class HelloWorldApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = (int) (Math.random() * 20);
        System.out.println("Hello World!");
        while (x>1){
             System.out.println("THE SINGULARITY IS NEAR");
             x=x-1;
        }
        System.out.println("No, just kidding. I wish, though, right?");
    }
}
