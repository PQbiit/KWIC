/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class KWIC {

  
    public static void main(String[] args) throws IOException {
        
        int cantidadCasos;
        //Sirve para adquirir datos como nombres, cantidad de archivos a analizar etc
        BufferedReader brDatosArchivos = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader brContenidoArchivos = null;
        String fraseActual;
        String frasePermutada = "";
        ArrayList<String> alPalabras = new ArrayList<String>();
        ArrayList<String> alFrases = new ArrayList<String>();
        ArrayList<String> alPermutaciones = new ArrayList<String>();


       // MARK: - OBTENER NUMERO DE ARCHIVOS PARA ANALIZAR
        
        System.out.println("Ingrese el número de archivos para analizar");
        
            cantidadCasos = Integer.parseInt(brDatosArchivos.readLine());
                      
        
            for(int ia=0; ia < cantidadCasos; ia++){

                    System.out.println("Ingrese la frase número " + (ia+1));
                    alFrases.add(brDatosArchivos.readLine());
             
            }
                    
            for(int ia=0; ia < alFrases.size(); ia++){
                        
                fraseActual = alFrases.get(ia);
                   
                    for(String word : fraseActual.split(" ")){
                        alPalabras.add(word);
                    }
                
                    for(int ib=0; ib < alPalabras.size(); ib++){
                        
                        alPalabras.add(alPalabras.get(0));
                        alPalabras.remove(0);
                        frasePermutada += (alPalabras.get(ib) + " ");
                    }
                     
                    alPermutaciones.add(frasePermutada);
            }
            
            Collections.sort(alPermutaciones);     
            
            for(int ia=0; ia<alPermutaciones.size(); ia++){
                System.out.println(alPermutaciones.get(ia) + " ");
            }

   }
}
 