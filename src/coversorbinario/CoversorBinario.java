/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coversorbinario;

/**
 *
 * @author yudy-
 */
public class CoversorBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CoversorBinario b = new CoversorBinario();
        
        System.out.println(b.conversor(100,""));
    }
    
    public String conversor(int n, String s){
        if(n > 1){
            int t = n%2;
            return conversor(n/2, t+s);
        } else {
            return n+s;
        }
    }
    
}
