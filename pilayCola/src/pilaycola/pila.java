/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaycola;

/**
 *
 * @author Alumno
 */
public class pila {
    int[] pila;
    int cima=0;
    int fondo =0; //primer elemento del arreglo y se deja en 0 
    public pila(int[] pila){
        this.pila = pila;
    }
    
    public void insertar(int dato){
        pila[cima] = dato;
        cima ++;
    }
    
    public void retirar(){
        pila[cima - 1] =0;
        cima++;
    }

    void mostrarPila() {

        for (int i =pila.length; i>0; i--) {
            if (pila[i - 1] !=0) {
                System.out.println(pila[i - 1]);
            }
            
        }
    }
        
    public int cima(){
        System.out.println("La cima de la pila es: " + pila[cima -1]);
        return pila[cima]; // el pirmero  
    }
    
        public int fondo(){
            System.out.println("El fondo de la pila es: " + pila[fondo]);
            return pila[fondo];
        }
    }

