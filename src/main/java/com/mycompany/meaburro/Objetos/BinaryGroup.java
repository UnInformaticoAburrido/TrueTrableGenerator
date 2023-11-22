/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meaburro.Objetos;

import com.mycompany.meaburro.Objetos.BinaryElement;

/**
 *
 * @author dimit
 */
public class BinaryGroup {

    private int ancho;
    private int altura;
    private int[][] numeros;

    public BinaryGroup(int tamano) {
        this.ancho = tamano;
        this.altura = (int) Math.pow(2, tamano);
        this.numeros = new int[altura][ancho];
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.numeros[i][j] = 0;
            }
        }
    }

    public void tab() {
        int over = 1;
        BinaryElement[] numero = new BinaryElement[this.ancho];
        for (int i = 0; i < this.ancho; i++) {
            numero[i] = new BinaryElement(0);
        }
        for (int linea = 1; linea < this.altura; linea++) {
            for (int i = this.ancho; over != 0 && i > 0; i--) {
                over = numero[i - 1].mas();
            }
            over = 1;
            for (int i = 0; i < this.ancho; i++) {
                this.numeros[linea][i] = numero[i].getState();
            }
        }
        this.show();
    }

    private void show() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.ancho; j++) {
                System.out.print(this.numeros[i][j]);
            }
            System.out.println(" ");
        }

    }
}
