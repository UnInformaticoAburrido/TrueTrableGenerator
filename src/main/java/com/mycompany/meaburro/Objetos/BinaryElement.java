/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meaburro.Objetos;

/**
 *
 * @author dimit
 */
public class BinaryElement {
    private BinaryElement anterior;
    //private int Posicion; Este puede que lo aproveche para realizar la salida del sistema segun los valores de la tabla.
    private boolean State;//Si el estado es 0 es flaso si es 1 es true
    
    public BinaryElement(int a) {
        if (a == 0) {
            this.State = false;
        }
        if (a == 1) {
            this.State = true;
        } else {
            this.State = false;
        }
    }

    public BinaryElement() {
        this.State = false;
    }

    public int mas() {
        this.State = !this.State;
        if (State) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getState() {
        if (State) {
            return 1;
        } else {
            return 0;
        }
    }
    public void setState(boolean State) {
        this.State = State;
    }
}
