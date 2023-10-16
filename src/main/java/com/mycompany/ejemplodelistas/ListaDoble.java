/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplodelistas;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author nunez
 */
public class ListaDoble<T> {

    private NodoDoble inicio;

    public ListaDoble(NodoDoble inicio) {
        this.inicio = inicio;
    }

    public ListaDoble() {
    }

    public void insertarInicio(T dato) {

        NodoDoble n = new NodoDoble(dato, inicio, null);
        System.out.println("Inicio es " + inicio);
        if (inicio != null) {
            System.out.println("Se guarda en el anterior");
            inicio.setAnt(n);

        }

        System.out.println("Se guarda solo como inicio = n");
        inicio = n;

    }

    //Le hice cambios con respecto al apunte
    public void insertarFinal(T dato) {
        NodoDoble n = new NodoDoble(dato, null, null);

        if (inicio == null) {
            inicio = n;
        } else {
            NodoDoble r = inicio;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(n);
            n.setAnt(r);

        }
    }

    public T eliminarInicio() {
        T dato = null;
        if (inicio == null) {
            System.out.println("Esta vacio");
        } else {
            dato = (T) inicio.getDato();
            if (inicio.getSig() == null) {
                inicio = null;
            } else {
                inicio = inicio.getSig();
                inicio.setAnt(null);
            }
        }
        return dato;
    }

    public T eliminarFinal() {
        T dato = null;
        if (inicio == null) {
            System.out.println("Esta vacia");
            dato = null;

        } else {
            if (inicio.getSig() == null) {
                dato = (T) inicio.getDato();
                inicio = null;
            } else {
                NodoDoble r = inicio;
                while (r.getSig() != null) {
                    r = r.getSig();
                }
                //r.setAnt(r.getSig());
                r = r.getAnt();
                r.setSig(null);
            }
        }
        return dato;
    }

    public String recorrer() {
        StringBuilder cadena = new StringBuilder("");
        if (inicio == null) {
            return cadena.toString();
        }
        NodoDoble r = inicio;

        do {
            cadena.append(r.getDato().toString()).append(" ");
            r = r.getSig();
        } while (r != null);
        return cadena.toString();

    }

    public int size() {
        NodoDoble r = inicio;
        int i = 0;
        while (r != null) {
            i++;
            r = r.getSig();

        }
        return i;

    }


    public void insertarEnXPosicion(T dato, int x) {
        if (inicio != null) {
            if (x == 0) {
                insertarInicio(dato);

            } else {

                if (x == size()) {
                    insertarFinal(dato);

                } else {
                    NodoDoble n = regresarNodoXposicion(x);
                    if (n != null) {
                        NodoDoble r = new NodoDoble(dato, n, n.getAnt());
                        n.getAnt().setSig(r);

                    }
                    else
                    {
                        System.out.println("No existe esa posicion");
                    
                    
                    }
                }
            }

        }

    }

    public ListaDoble<T> eliminarPares()
    {
        ListaDoble<T> listaDeValoresEliminados =  new ListaDoble<>();
        int x = 1;
        T dato;
        
        do{
            dato =eliminarDeXPosicion(x);
            listaDeValoresEliminados.insertarFinal(dato);
            x=x+1;
        }while(dato !=null);
       listaDeValoresEliminados.eliminarFinal();
        
        
        return listaDeValoresEliminados;
    
    
        
    }
    public T eliminarDeXPosicion(int x) {
        T dato = null;
        if (inicio != null) {
            if (x == 0) {
                return eliminarInicio();

            }
            if (x == size() - 1) {
                return eliminarFinal();

            }
            NodoDoble r = regresarNodoXposicion(x);
            if (r != null) {

                NodoDoble rA = r.getAnt();
                dato = (T) r.getDato();
                rA.setSig(r.getSig());
                r.getSig().setAnt(rA);
                return dato;

            }

        }
        System.out.println("indice no disponible");

        return dato;

    }

    private NodoDoble regresarNodoXposicion(int x) {
        int contador = 0;
        if (inicio != null) {
            NodoDoble r = inicio;
            while (r != null && contador != x) {
                contador++;
                r = r.getSig();
            }
            if (contador == x) {
                return r;
            }

        }
        return null;

    }

    public void ordenar(Comparator<T> c){
    T dato;
    NodoDoble r = inicio;
    NodoDoble r2 = r;
    int contador=0;
        if(inicio!=null && inicio.getSig()!=null)
        {
            while(r2.getSig()!=null){
            while(r.getSig()!=null)
                
            {
                if(c.compare((T)r.getDato(),(T)r.getSig().getDato()) >0)
                {
                    //Todos se apunta a r
                    
                    dato = (T) eliminarDeXPosicion(contador);
                    
                    insertarEnXPosicion(dato, contador+1);
                    r = r.getSig();
                    
                }
            
            
            contador++;
            r= r.getSig();
            }
            contador = 0;
            r2=r2.getSig();
            r=r2;
            
            }
        
        
        
        }
    
    
    }
    public String mostrar() {
        return mostrarRecursivo(inicio);
    }

    
    private String mostrarAlreves(NodoDoble n) {
        if (n.getSig() == null) {
            return n.getDato().toString() + "";

        }
        return mostrarAlreves(n.getSig()) + "," + n.getDato();
    }
    public String mostrarAlReves() {
        return mostrarAlreves(inicio);
    }

    private String mostrarRecursivo(NodoDoble n) {
        if (n.getSig() == null) {
            return n.getDato().toString() + "";

        }
        return n.getDato().toString() + "," + mostrarRecursivo(n.getSig());
    }

}
