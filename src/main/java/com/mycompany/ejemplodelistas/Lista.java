/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplodelistas;

import java.util.Stack;

/**
 *
 * @author nunez
 */
public class Lista<T> {
    private Nodo inicio;

    public Lista(Nodo inicio) {
        this.inicio = inicio;
    }

    public Lista() {
    }
    
    public void insertarInicio(T dato)
    {
        Nodo n =  new Nodo(dato, inicio);
        inicio = n;
    }
    //Le hice cambios con respecto al apunte
    public void insertarFinal(T dato)
    { Nodo n =  new Nodo(dato, null);
      
      if(inicio == null)
      {
          inicio = n;
      }
      else{Nodo r = inicio;
      while(r.getSig()!=null)
      {
          r=r.getSig();
      }
      r.setSig(n);
        
    }
    }
    public T eliminarInicio()
    {
        T dato = null;
        if(inicio == null)
        {
            return dato;
        }
        
        dato = (T) inicio.getDato();
        inicio = inicio.getSig();
        return dato;
    }
    public T eliminarFinal()
    {
        T dato = null;
        if(inicio == null)
        {
            System.out.println("Esta vacia");
            dato = null;
        
        }
        else{
            if(inicio.getSig()==null)
            {
                inicio = null;
            
            }
            else
            {
        Nodo r = inicio;
        Nodo a = r;
        while(r.getSig()!=null)
        {
            a = r;
          r = r.getSig();
        }
        dato = (T) r.getDato();
        a.setSig(null);
        
    }
        }
    return dato;
    }
    public int size()
    {
        Nodo r =inicio;
        int i=0;
        while(r!=null)
        {
            i++;
            r = r.getSig();
        
        }
    return i;
    
    }
    private String mostrarAlreves(Nodo n)
    {   
        if (n.getSig()==null)
        {
            return n.getDato().toString()+"";
        
        }
        return mostrarAlreves(n.getSig())+","+n.getDato();
    }
    
    
    
    public String mostrar()
    {
        return mostrarRecursivo(inicio);
    }
    
    public String mostrarAlReves()
    {
        return mostrarAlreves(inicio);
    }
    private String mostrarRecursivo(Nodo n)
    {   
        if (n.getSig()==null)
        {
            return n.getDato().toString()+"";
        
        }
        return n.getDato().toString()+","+mostrarRecursivo(n.getSig());
    }
    public String pilaVoltear()
    {
        StringBuilder cadena; 
        cadena = new StringBuilder(mostrar());
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));
        }
        for (int i = 0; i < cadena.length(); i++) {
        cadena.append(pila.pop());
        }
        return cadena.toString();
        
    
    
    
    }
    
    
    
    
    
}
