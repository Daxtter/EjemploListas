/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplodelistas;

/**
 *
 * @author nunez
 */
public class ListaCircular<T> {
    Nodo inicio;
    Nodo fin ;

    public ListaCircular() {
    }
    
    
    
    
    public void insertarInicio(T dato)
    {
        Nodo n = new Nodo();
        n.setDato(dato);
        if(inicio == null)
        {
            //inicio = fin = n;
            inicio = n;
            fin = n;
            n.setSig(inicio);
            
            
        }
        else{
        n.setSig(inicio) ;
        inicio = n;
        fin.setSig(inicio);
        
        }
    
    }
    
    public void insertarFin(T dato)
    {
        Nodo n = new Nodo(dato, null);
        if(inicio == null)
        {
            inicio = n;
            fin = n;
        }
        else
        {
            fin.setSig(n);
            n.setSig(inicio);
            fin = n;
        
        }
    
    
    
    
    }
    public T eliminarFin()
    {
        T dato = null;
       if(inicio == null)
       {
           System.out.println("Lista vacio");
           
       }
       else
       {
           if(inicio == fin)
           {
               inicio = null;
               fin = null;
           
           }
           else
           {
               Nodo r = inicio;
               while(r.getSig()!=fin)
               {
                   r = r.getSig();
               }
               dato = (T) r.getDato();
               r.setSig(inicio);
               fin = r;
               
           
           }
       
       
       
       }
        
        
        return dato;
    }
    public T eliminarInicio()
    { 
        T dato = null;
    if(inicio == null)
       {
           System.out.println("Lista vacio");
           
       }
       else
       {
           if(inicio == fin)
           {
               inicio = null;
               fin = null;
           
           }
           else
           {
               dato = (T) inicio.getDato();
               inicio = inicio.getSig();
               fin.setSig(inicio);
           
           
           }
       
       }
    
    
    
        return dato;
    }

    
        
    private Nodo regresarNodoXposicion(int x) {
        int contador = 1;
        if (inicio != null) {
            Nodo r = inicio.getSig();
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
            Nodo r = regresarNodoXposicion(x);
            Nodo ra = regresarNodoXposicion(x-1);
            if (r != null) {
                ra.setSig(r.getSig());
                return dato;

            }

        }
        System.out.println("indice no disponible");

        return dato;

    }
    
    
        public void insertarEnXPosicion(T dato, int x) {
            Nodo t = new Nodo(dato, null);
        if (inicio != null) {
            if (x == 0) {
                insertarInicio(dato);

            } else {

                if (x == size()) {
                    insertarFin(dato);

                } else {
                    Nodo n = regresarNodoXposicion(x);
                    Nodo na = regresarNodoXposicion(x-1);
                    if (n != null) {
                        na.setSig(t);
                        t.setSig(n);

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
        Nodo r = inicio.getSig();
        
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
            Nodo r = inicio.getSig();
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
        Nodo r = inicio.getSig();
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
    private String mostrarRecursivo(Nodo n) {
        
        if(n==null){
        return "";
        
        }
        if (n.getSig() == inicio) {
            return n.getDato().toString() + "";

        }
        return n.getDato().toString() + "," + mostrarRecursivo(n.getSig());
    }
    //Metodo para mostrar
    public String recorrer()
    {
        StringBuilder cadena =  new StringBuilder();
        Nodo r = inicio;
        while(r.getSig()!=inicio)
            
        {
            
            //System.out.println("dato" + r.getDato());
            cadena.append(r.getDato());
            r = r.getSig();
        
        }
        cadena.append(r.getDato());
        return cadena.toString();
    
    
    
    }


}

