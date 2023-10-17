/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;
import java.util.Objects;
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
    public Nodo getBuscarNom(String Nombre) {
      Nodo p;
        if (tope==null) {
            return null;
        } else {
            p=tope;
            do {                
                if (Nombre==p.NombreProducto) 
                return p;
                else 
                    p=p.sig;
                
            } while (p!=tope);
            return null;
        }
    }
    public Nodo getBuscarFecha(String FechaL){
        Nodo p;
        if (tope==null) {
            return null;
        } else {
            p=tope;
            do {                
                if (FechaL==p.FechaLote)  
                    p=p.sig;
                
            } while (p!=tope);
            return null;
        }
    }
    public Nodo getBuscarFechaVe(String FechaV){
        Nodo p;
        if (tope==null) {
            return null;
        } else {
            p=tope;
            do {                
                if (FechaV==p.FechadeVencimiento)  
                    p=p.sig;
                
            } while (p!=tope);
            return null;
        }
    }
    public Nodo getBuscarPreU(Double Precio){
        Nodo p;
        if (tope==null) {
            return null;
        } else {
            p=tope;
            do {                
                if (Objects.equals(Precio, p.PrecioUnitario))  
                    p=p.sig;
                
            } while (p!=tope);
            return null;
        }
    }   
    public Nodo getCrearNodo(){
        String IdPro, NomPro, FeLo, FeVe, Mes;
        Double Costo;
        Nodo info=null, b=null;
        try{
            do{
              IdPro=JOptionPane.showInputDialog(null,"INTRODUZCA CODIGO");
              b=getBuscarId(IdPro);
                if (b!=null) {
                    JOptionPane.showMessageDialog(null, "EL CÓDIGO DEL PRODUCTO YA SE ENCUENTRA REGISTRADO. INTENTE NUEVAMENTE");
                }
              NomPro=JOptionPane.showInputDialog(null,"INTRODUZCA NOMBRE DE PRODCTO");
              b=getBuscarNom(NomPro);
              if (b!=null);{
                    JOptionPane.showMessageDialog(null, "EL NOMBRE DEL PRODUCTO YA SE ENCUENTRA REGISTRADO. INTENTE NUEVAMENTE");
                }
              } while (b!=null);{
                   FeLo=JOptionPane.showInputDialog(null,"INTRODUZCA FECHA DE LOTE");
                FeVe=JOptionPane.showInputDialog(null,"INTRODUZCA FECHA DE VENCIMIENTO");
                Costo=Double.valueOf(JOptionPane.showInputDialog("INTRODUZCA PRECIO UNITARIO DEL PRODUCTO"));
                info=new Nodo(IdPro, NomPro, FeLo, FeVe, Costo);
                return info;  
                } 
            } catch(Exception e){
              JOptionPane.showMessageDialog(null, "Error "+e+
                " .  El producto no fue creado intente nuevamente!");
            return info;
            }
        }
    public Nodo getBase(){
        if (tope==null) {
            return null;
        } else {
            Nodo p=tope;
            while(p.sig!=tope)
                p=p.sig;
            return p;
        }
    }
    public void setPush(){
        Nodo info=getCrearNodo();
        if (tope==null) {
            tope=info;
           tope.sig=tope;
            JOptionPane.showMessageDialog(null, 
                "Nuevo elemento agregado a la pila!");
        } else {
         Nodo b=getBase();
         b.sig=info;
         info.sig=tope;
         tope=info;
         JOptionPane.showMessageDialog(null, 
                "Nuevo elemento agregado al tope!");
        }
    }
    public Nodo getPromedio(){
        Nodo p;
        if (tope==null) {
            return null;
         }
        return null;
    }
}




