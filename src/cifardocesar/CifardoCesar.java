/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifardocesar;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class CifardoCesar {

    /**
     * @param args the command line arguments
     */
    
    static final Scanner lee = new Scanner(System.in);
    
    
    public static void Cifrado(){
        
        int b = -1;
        String texto;      //variable para el texto
        Scanner sc = new Scanner(System.in); //Sirve para la lectura de texto
        int clave = 0;
        while (b!=0){
            System.out.println("Menu Cifrado Cesar... \nSalir    0\nCifrar   1\nDescifrar   2");
            b = lee.nextInt();
            switch(b){
                case 0:
                    break;
                case 1:
                    System.out.println("Introduce texto a cifrar: ");
                    texto = sc.nextLine();
                    System.out.println("Dijite la clave con la que se codificara el texto:  ");  //Lugar de correr el alfabeto
                    clave = lee.nextInt();
                    System.out.println("Texto cifrada con clave: " + clave + "|  " + cifrar(texto, clave) + "  |"); // Impresion del texto con la calve se va a void de cifrar
                    
                    break;
                           
                case 2:
                    System.out.println("Introduce el texto cifrado: ");
                    texto = sc.nextLine();
                    System.out.println("Dijite la clave con la que se codifico el texto:  ");
                    clave = lee.nextInt();
                    System.out.println("Texto descifrado con clave = " + clave + " |" + descifrar(texto, clave) + "|");// Impresion del texto con la calve se va a void de descifrar
                    break;
                default:
                    System.out.println("No esta dentro de la seleccion, pruba de nuevo...");
            }
            
        }
        
    }
    /*voy a usar el codigo ascii, ya que este contiene
    lo que necesito y si el usuario ingresa mas signos
    aun asi lo puede tanto desecriptar como encriptar
    
    */
    static String cifrar(String original, int clave){
        StringBuilder cifrado = new StringBuilder(original.length());
        for(int i = 0;i < original.length(); i++)
            cifrado.append((char)((int)(original.charAt(i)) + clave % 255)); //255 Porque es del lenguaje ascci de 0 a 255
        return cifrado.toString();
    }
    
    static String descifrar(String original, int clave){
        StringBuilder descifrado = new StringBuilder(original.length());
        for(int i = 0;i < original.length(); i++)
            descifrado.append((char)((int)(original.charAt(i)) - clave % 255));
        return descifrado.toString();
    }


    
 public static void main(String[] args) {
        // TODO code application logic here
        Cifrado();
}

} 