/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplodelistas;

/**
 *
 * @author nunez
 */
public class Nodo<T> {
    private T dato;
    private Nodo sig;

    public Nodo(T dato, Nodo n) {
        this.dato = dato;
        this.sig = n;
    }

    public Nodo() {
    dato = null;
    sig = null;
    }

    public T getDato() {
        return dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
    
}
