package es.aviva;

import java.io.*;

public class UnixToWindowsConvert {

	public String convertir(String ficheroIn, String ficheroOut) {
		
            File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
            FileWriter fw = null;
            PrintWriter pw = null;
	                 
	    try {
	    	// Apertura del fichero y creacion de BufferedReader para poder
	        // hacer una lectura comoda (disponer del metodo readLine()).
	        archivo = new File (ficheroIn);
	        fr = new FileReader (archivo);
	        br = new BufferedReader(fr);
	        
                fw = new FileWriter(ficheroOut);
                pw = new PrintWriter(fw);
	 
	        // Lectura del fichero
	        String linea;
	        while((linea=br.readLine())!=null){
                    System.out.println(linea);
	            pw.println(linea);
                }
                return "";
	      }
	      catch(Exception e){
	    	  return e.getMessage();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta
	         // una excepcion.
	         try{                   
	            if( null != fr ){  
                        fr.close();
                        fw.close();
                        return "";
	            }                 
	         }catch (Exception e2){
                        return e2.getMessage();
	         }
	      }
	}
}
