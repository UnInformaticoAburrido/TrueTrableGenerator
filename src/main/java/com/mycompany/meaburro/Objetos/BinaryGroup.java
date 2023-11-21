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
    private BinaryElement[][] numeros;
    
    public BinaryGroup(int tamano) {
        this.ancho = tamano;
        this.altura = (int)Math.pow(2, tamano);
        this.numeros= new BinaryElement[altura][ancho];
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.numeros[i][j] =  new BinaryElement();
            }
        }
    }
    
    public void tab(){
        int over=1;
        BinaryElement[] numero = new BinaryElement[this.ancho];
        for (int i = 0; i < this.ancho; i++) {
            numero[i]= new BinaryElement(0);
        }
        for (int linea = 1; linea < this.altura; linea++) {
            for (int i = this.ancho; over!=0&& i>0; i--) {
                over=numero[i-1].mas();
            }
            over=1;
            for (int i = 0; i<this.ancho ; i++) {
                
                this.numeros[linea][i].setState(numero[i].getState());
            }
        }
        this.show();
    }
    public void tabE(){
        int over=1;
        //BinaryElement[] numero = new BinaryElement[this.ancho];
        BinaryElement[] numero = new BinaryElement[this.ancho];
        for (int linea = 1; linea < this.altura; linea++) {
            for (int i = this.ancho; over!=0&& i>0; i--) {
                over=numero[i-1].mas();
            }
            over=1;
            for (int i = 0; i<this.ancho ; i++) {
                
                this.numeros[linea][i].setState(numero[i].getState());
            }
        }
        this.showE();
    }
    private void show(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.numeros[i][j].mostrar();
            }
            System.out.println(" ");
        }
        
    }
    private void showE(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.numeros[i][j].mostrarE();
            }
            System.out.println(" ");
        }
        
    }
}
