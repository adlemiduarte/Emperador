/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.emperador.ui;

import java.util.Scanner;

/**
 *
 * @author Adlemi Duarte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Scanner se encargara de leer el texto y poder mostrarlo en la pantalla.       
       //String se encargara de leer la clase procedimiento.
        
       System.out.println("Escriba el ID y el nombre del alumno:");
        Scanner entrada = new Scanner(System.in);
         String alumnos = entrada.nextLine();
         String [] resultado = alumnos.split(",");
              for(String r: resultado){
                 
                  //System.out.println(x);
                  
        String [] alumno = r.split(" ");
        String id = alumno [0];
        String primerNombre = alumno [3];
        String primerApellido = alumno [1];
        System.out.println("ID: " + id + " - " + primerNombre + " - " + primerApellido);
          
         //divide la cadena en lineas
                
         String[]lineas = alumnos.split("/");
            for (String linea : lineas){
                //divide cada linea en campos utilizando la coma
                String[] campos = linea.split(",");
                
            }
        
    }
    
    }
}
