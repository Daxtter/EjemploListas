/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplodelistas;

/**
 *
 * @author nunez
 */
public class NodoDoble<T> {


    private T dato;
    private NodoDoble sig;
    private NodoDoble ant;

    public NodoDoble(T dato, NodoDoble sig, NodoDoble ant) {
        this.dato = dato;
        this.sig = sig;
        this.ant = ant;
    }

    public NodoDoble() {
    }
    

    public T getDato() {
        return dato;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }
    
    
    
}
    

