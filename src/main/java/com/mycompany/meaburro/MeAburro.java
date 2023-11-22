/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.meaburro;

import com.mycompany.meaburro.Objetos.BinaryGroup;
import java.util.Scanner;

/**
 *
 * @author dimit
 */
public class MeAburro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean queap = true;
        final int inicial = 4;
        int cont = inicial;
        System.out.println("El progrma se ha iniciado porfabor inserte 0 para parar");
        while (queap) {
            int resp = teclado.nextInt();
            if (resp != 0) {
                BinaryGroup display = new BinaryGroup(resp);
                display.tab();
            } else {
                queap = false;
            }
            cont--;
            if(cont==0){
                cont=inicial;
                System.out.println("El progrma se ha iniciado porfabor inserte 0 para parar");
            }
        }

    }
}
