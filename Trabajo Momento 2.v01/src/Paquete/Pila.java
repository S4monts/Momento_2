/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;
import javax.swing.JOptionPane;
/**
 *
 * @author academico
 */
public class Pila {
    Nodo tope;
    Pila() { 
    tope=null;
    }
    public Nodo getBuscarId(String IdP){
        Nodo p;
        if (tope==null) {
            return null;
        } else {
            p=tope;
            do {                
                if (IdP==p.IdProducto) 
                return p;
                else 
                    p=p.sig;
                
            } while (p!=tope);
            return null;
        }
    }
    public Nodo getCrearNodo(){
        String IdPro, NomPro, FeLo, FeVe;
        Double Costo;
        Nodo info=null, b=null;
        try {
            do{
              IdPro=  
            }
        }
    }
}


