/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplodelistas;

import java.awt.Taskbar;
import java.util.Comparator;

/**
 *
 * @author nunez
 */
public class EjemploDeListas {

    public static void main(String[] args) {
        //listad.eliminarDeXPosicion(1);
        //listad.in
        ListaCircular<Character> listC = new ListaCircular<>();
        listC.insertarFin('a');
        listC.insertarFin('B');
        listC.insertarFin('C');
        System.out.println(""+listC.recorrer());
        listC.insertarEnXPosicion('h', 2);
        System.out.println(""+listC.recorrer());
        
        Comparator<Character> c =  (Character o1, Character o2) -> {
            return o1-o2;
        };
      //  
        //listad.eliminarDeXPosicion(3);
        //System.out.println("" + listad.recorrer());
        //listad.eliminarInicio();
        //System.out.println("" + listad.recorrer());
        
        /*Lista<Integer> lista = new Lista();
        lista.insertarFinal(2);
        lista.insertarInicio(4);
        lista.insertarFinal(5);
        
        System.out.println("El orden es de "+lista.mostrar());
        System.out.println("El al reves es de"+lista.mostrarAlReves());
        lista.eliminarFinal();
        lista.eliminarInicio();
        

        System.out.println("El orden es de "+lista.mostrar());
        System.out.println("El al reves es de"+lista.mostrarAlReves());
*/
        
        /*
        ListaDoble<Integer> listaDoble = new ListaDoble<>();
        listaDoble.insertarInicio(2);
        listaDoble.insertarInicio(8);
        listaDoble.insertarInicio(9);
//        System.out.println("com.mycompany.ejemplodelistas.EjemploDeListas.main()");
         System.out.println("orden Con recorrer"+listaDoble.recorrer());
        System.out.println("orden Con recursivo"+listaDoble.mostrar());
        listaDoble.insertarFinal(12);
        System.out.println("orden Con recorrer"+listaDoble.recorrer());
        listaDoble.eliminarInicio();
        System.out.println("orden Con recorrer"+listaDoble.recorrer());
        listaDoble.eliminarFinal();
        System.out.println("orden Con recorrer"+listaDoble.recorrer());
        
    
*/
        /*
        ListaCircularDoble<Character> lista = new ListaCircularDoble<>();
        lista.insertarFin('a');
        lista.insertarInicio('b');
        lista.insertarFin('c');
        lista.insertarFin('d');
        lista.insertarInicio('e');
        lista.insertarFin('f');
        lista.insertarFin('g');
        System.out.println(""+lista.recorrer());
        lista.eliminarInicio();
        System.out.println("" + lista.recorrer());
        lista.eliminarFin();
        System.out.println(""+lista.recorrer());
        */
        
        /*
        ListaCircular<Character> listaCircular =  new ListaCircular<>();
        listaCircular.insertarFin('a');
        listaCircular.insertarFin('b');
        listaCircular.insertarFin('c');
        System.out.println("" + listaCircular.recorrer());
        listaCircular.eliminarFin();
        System.out.println("" + listaCircular.recorrer());
        listaCircular.eliminarInicio();
        System.out.println("" + listaCircular.recorrer());
        */
        
        
        
    }
        
        
}
