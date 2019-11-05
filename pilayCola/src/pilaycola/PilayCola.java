/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaycola;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class PilayCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0, nuevo = 0;
        String o;
        int pila[] = new int [10]; //arreglo que se va a mandar a la otra clase 
        
      pila objetosEnteros = new pila(pila);
//      //arreglo (operacion push) elemento a la pila de datos.
//      //el fondo de la pila seria 90 y la sima 12
//    objetosEnteros.insertar(90);
//    objetosEnteros.insertar(55);
//    objetosEnteros.insertar(10);
//    objetosEnteros.insertar(2);
//    
//    // mostramos los elemntos dentro de la pila
//    objetosEnteros.mostrarPila();
        do{
        
       opcion =Integer.parseInt( JOptionPane.showInputDialog("Selecciona una opcion:"
                + "\n1.- Insertar"
                + "\n2.- Eliminar"
                + "\n3.- Mostrar"
                + "\n4.- Mostrar Fondo"
                + "\n5.- Mostrar Cima"
                + "\n6.- Salir" ));
     
        switch(opcion){
            case 1: 
                
                nuevo=Integer.parseInt(JOptionPane.showInputDialog(" insertar"));
                objetosEnteros.insertar(nuevo);
                objetosEnteros.mostrarPila();
                break;
                
                
            case 2: 
                
                System.out.println("Dato eliminado");
                objetosEnteros.retirar();
                System.out.println(nuevo);
            case 3:
                System.out.println("Datos ALMACENADOS");
                objetosEnteros.mostrarPila();
                
                break;
                
            case 4:
                System.out.println("Fondo");
                objetosEnteros.fondo();
                break;
                
            case 5:
                System.out.println("Cima");
                objetosEnteros.cima();
                break;
            case 6:
                System.exit(0);
                break;
                
                
                
        }
           
            o=JOptionPane.showInputDialog("Otra vez s/n");
        }while (o.equals(o)); 
    }
    
}
