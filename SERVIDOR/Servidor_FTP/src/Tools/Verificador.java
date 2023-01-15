
package Tools;

public class Verificador {
    
    
     public Verificador() {
        
    }
     
    public boolean noVacio (String validar){
        int x= validar.length();
        if (!validar.isEmpty()) {
            for (int i = 0; i < x; i++) {
                if ((' '!=(validar.charAt(i)))) {
                    return true;
                }
            }
        } 
           return false;      
    }
    
}
