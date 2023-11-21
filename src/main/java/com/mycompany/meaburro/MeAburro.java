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
        while (queap) {
                System.out.println("El progrma se ha iniciado porfabor selecione el modo de uso");
                System.out.println("1 = Estandar las salidas no tendran formato");
                System.out.println("2 = Exe las salidas estaran formatadas para poderse mover a una hoja de calculos");
                int selector=teclado.nextInt();
                switch (selector) {
                case 1:
                    System.out.println("El progrma se a iniciado en el modo Exe esto significa que cada salida se formatara con tabulaciones");
                    System.out.println("Recuerda insertar un 0 para finalizar");
                    while (queap) {
                        int resp = teclado.nextInt();
                        if (resp != 0) {
                            BinaryGroup display = new BinaryGroup(resp);
                            display.tabE();
                        } else {
                            queap = false;
                        }
                    }
                    break;
                case 2:
                    System.out.println("El progrma se a iniciado en el modo standar esto significa que cada salida se formatara sin tabulaciones");
                    System.out.println("Recuerda insertar un 0 para finalizar");
                    while (queap) {
                        int resp = teclado.nextInt();
                        if (resp != 0) {
                            BinaryGroup display = new BinaryGroup(resp);
                            display.tab();
                        } else {
                            queap = false;
                        }
                    }
                    break;
                default:
                    System.out.println("El progrma se a iniciado en el modo standar esto significa que cada salida se formatara sin tabulaciones");
                    System.out.println("Recuerda insertar un 0 para finalizar");
                    while (queap) {
                        int resp = teclado.nextInt();
                        if (resp != 0) {
                            BinaryGroup display = new BinaryGroup(resp);
                            display.tab();
                        } else {
                            queap = false;
                        }
                    }
                    break;
            }
        }
    }
}
