/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplodelistas;

/**
 *
 * @author nunez
 */
public class ListaCircularDoble<T> {
    NodoDoble inicio;
    NodoDoble fin;
    
    
    public void insertarInicio(T dato){
    NodoDoble n = new NodoDoble(dato, null, null);
    if (inicio ==null)
    {
        inicio = fin = n;
        n.setSig(inicio);
        n.setAnt(inicio);
        
        
    }
    else
    {
        n.setSig(inicio);
        n.setAnt(fin);
        inicio.setAnt(n);
        inicio = n;
        fin.setSig(inicio);
        
        
    }
    
    
    }
    
    public void insertarFin(T dato){
        NodoDoble n = new NodoDoble(dato, null, null);
    if (inicio ==null)
    {
        inicio = fin = n;
        n.setSig(inicio);
        n.setAnt(inicio);
        
        
    }
    else
    {
        n.setSig(inicio);
        n.setAnt(fin);
        fin.setSig(n);
        fin = n;
        inicio.setAnt(fin);
        
        
    }
    
    }
    public T eliminarInicio()
    {
        T dato = null;
        if(inicio == null)
        {
        
        }
        else
        {
            if (inicio == fin)
            {
                inicio = null;
                fin = null;
            
            }
            else
            {
                dato = (T) inicio.getDato();
                fin.setSig(inicio.getSig());
                inicio = inicio.getSig();
                inicio.setAnt(fin);   
            }
        }
        return dato;
    }
    public T eliminarFin()
    {
        T dato = null;
         if(inicio == null)
        {
        
        }
        else
        {
            if (inicio == fin)
            {
                inicio = null;
                fin = null;
            
            }
            else
            {
                dato = (T) fin.getDato();
                fin = fin.getAnt();
                fin.setSig(inicio);
                inicio.setAnt(fin);   
            }
        }
        return dato;
    }
    
    
    private NodoDoble regresarNodoXposicion(int x) {
        int contador = 1;
        if (inicio != null) {
            NodoDoble r = inicio.getSig();
            if(x==0)
            {
                return inicio;
            }
            if(x>=size())
            {
                return null;
            }
            while (r !=inicio && contador != x) {
                contador++;
                r = r.getSig();
            }
            if (contador == x) {
                return r;
            }

        }
        return null;

    }
    
    
    
    public T eliminarDeXPosicion(int x) {
        T dato = null;
        if (inicio != null) {
            if (x == 0) {
                return eliminarInicio();

            }
            if (x == size() - 1) {
                return eliminarFin();

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
    
    
        public void insertarEnXPosicion(T dato, int x) {
        if (inicio != null) {
            if (x == 0) {
                insertarInicio(dato);

            } else {

                if (x == size()) {
                    insertarFin(dato);

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
    
    public int size() {
        NodoDoble r = inicio.getSig();
        
        int i = 1;
        if(inicio == null)
        {
            return 0;
        }
        if(inicio.getSig()==null)
        {
            return 1;
        
        }
        while (r != inicio) {
            i++;
            r = r.getSig();

        }
        return i;

    }
    private T BuscarXposicion(int x) {
        int contador = 1;
        if (inicio != null) {
            NodoDoble r = inicio.getSig();
            if(x==0)
            {
                return (T) inicio.getDato();
            }
            while (r !=inicio && contador != x) {
                contador++;
                r = r.getSig();
            }
            if (contador == x) {
                return (T)r.getDato();
            }

        }
        return null;

    }
    
    public T eliminarX (T x)
    {
     int indice =buscar(x);
     if(indice==-1)
     {
         return null;
     
     }
        return eliminarDeXPosicion(indice);
     
    
    
    }
    public int buscar(T x)
    {
        if(inicio == null)
        {
            return -1;
        }
        int contador=1;
        int indice=-1;
        if(inicio.getDato() == x)
        {
            return 0;
        
        }
        NodoDoble r = inicio.getSig();
        while(r!=inicio && r.getDato()!=x)
        {
            contador++;
            r=r.getSig();        
        }
        if(r.getDato()==x)
        {
            indice = contador;
        
        }
        return indice;
    
    
    
    
    }
    private String mostrarRecursivo(NodoDoble n) {
        
        if(n==null){
        return "";
        
        }
        if (n.getSig() == inicio) {
            return n.getDato().toString() + "";

        }
        return n.getDato().toString() + "," + mostrarRecursivo(n.getSig());
    }
    public String recorrer()
    {
        StringBuffer cadena = new StringBuffer();
        NodoDoble r =inicio;
        if(inicio!=null){
        do
        {
            cadena.append("").append(r.getDato());
            r = r.getSig();
            //System.out.println("" + r.getDato());
        }while(r.getSig()!=inicio.getSig());
    
        }
    return cadena.toString();
    
    }
}
