/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

/**
 *
 * @author Ricardo Fanghella
 */
public class StringHandling {
    
        public String getFileName (String file){
            String fileName =""; 
            int index;

            // Esta será la cadena invertida, primero está vacía
            java.lang.String invertida = "";
            // Recorremos la original del final al inicio
            for (int indice = file.length() - 1; indice >= 0; indice--) {
                    // Y vamos concatenando cada carácter a la nueva cadena
                    invertida += file.charAt(indice);
            }

            index = invertida.indexOf("\\".charAt(0));

            if (index != -1) {

            invertida = invertida.substring(0,index);
            }


            for (int indice = invertida.length() - 1; indice >= 0; indice--) {
                    // Y vamos concatenando cada carácter a la nueva cadena
                    fileName += invertida.charAt(indice);
            }
            return fileName;
        }
        
         public String getFilePath (String file){
             String caracteres = "\\\\";
             
        String fileName =""; 
        int index;
        
        // Esta será la cadena invertida, primero está vacía
        java.lang.String invertida = "";
        // Recorremos la original del final al inicio
        for (int indice = file.length() - 1; indice >= 0; indice--) {
                // Y vamos concatenando cada carácter a la nueva cadena
                
                //if (file.charAt(indice)==caracteres[1]){
                if (Character.compare(file.charAt(indice), caracteres.charAt(1)) > 0){
                    invertida += "/";
                } else
                invertida += file.charAt(indice);
        }
        
        index = invertida.indexOf("\\".charAt(0));
        
        if (index != -1) {
            
        invertida = invertida.substring(0,index);
        }
        
        
        for (int indice = 0; indice <= file.length(); indice++) {
                // Y vamos concatenando cada carácter a la nueva cadena
                fileName += file.charAt(indice);
        }
        
        
        
        return fileName;
    }
}
