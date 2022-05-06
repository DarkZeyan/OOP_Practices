/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_arreglos_4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_14_ARREGLOS_4 {

    public static final int TAMA = 100;

    public static void main(String[] args) {
        int[] arregloEdad = new int[TAMA];//bytes que ocupa un entero --> 4 bytes
        System.out.println("Tamaño del arreglo: " + arregloEdad.length);
        Scanner input = new Scanner(System.in);
        //32 capturas --> for
        //CAPTURA DE DATOS
        for (int i = 0; i < arregloEdad.length; i++) {//i --> index --> índice
            System.out.println("Cuál es tu edad? ");
            arregloEdad[i] = input.nextInt();
        }
        //MOSTRAR LOS DATOS
        for (int i = 0; i < arregloEdad.length; i++) {
            System.out.println("[" + arregloEdad[i] + "]");
        }
    }
}

