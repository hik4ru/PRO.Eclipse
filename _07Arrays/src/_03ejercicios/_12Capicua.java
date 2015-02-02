/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package _03ejercicios;

public class _12Capicua {
	
    public static boolean esCapicua(String frase[]){
    	
        boolean es = true;
        
        int i=0;
        int j = frase.length-1;
        
        while(i<j && es){
            if(!(frase[i].equals(frase[j]))) es = false;
            else {
                i++;
                j--;
            }
        }
        return es;
    }
    
    public static void main(String[] args) {
        String frase1[] = {"a","b","b","a"};
        String frase2[] = {"c","b","b","a"};
        System.out.println(esCapicua(frase1));
        System.out.println(esCapicua(frase2));
        
    }
}
