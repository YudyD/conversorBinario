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
        int n, n1, j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite el numero a convertir");
        n= sc.nextInt();
        n1=n;
        j=0;
        int []R;
        R= new int[20];
        while((n1/2) != 1){
            j=j+1;
            R[j]=n1%2;
            n1= n1/2;
        }
        if(n1==3){
           j=j+1;
           R[j]=1;
           j=j+1;
           R[j]=1;
        }else{
            j=j+1;
            R[j]=0;
            j=j+1;
            R[j]=1;
        }
        for(int i=j;i<=1;i--){
            System.out.println(""+R[i]);
        }
    }
    
}
