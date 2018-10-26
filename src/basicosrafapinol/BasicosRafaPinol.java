/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosrafapinol;

/**
 *
 * @author usuario
 */
public class BasicosRafaPinol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    numericos();
        // TODO code application logic here
  
    }
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;//8bits
        short chiquitin;//16 bits
        int entero;//32 bits
        long duplicaEntero;//64bits
        float grande;//32bits
        double doble;//64bits;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;
        elMasPeque= 5;
        chiquitin=9;
        duplicaEntero=2000;
        grande= 8;
        

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
        System.out.println("Valor elMasPeque");
        System.out.println(elMasPeque);
        System.out.println("Valor chiquitin");
        System.out.println(chiquitin);
        System.out.println("Valor duplicaEntero");
        System.out.println(duplicaEntero);
        System.out.println("Valor grande");
        System.out.println(grande);
    }
    
}
