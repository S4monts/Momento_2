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
public class Nodo {
String IdProducto;
String NombreProducto;
String FechaLote;
String FechadeVencimiento;
Double PrecioUnitario;
Nodo sig, ant;

    public Nodo(String IdProducto, String NombreProducto, String FechaLote, String FechadeVencimiento, Double PrecioUnitario) {
        this.IdProducto = IdProducto;
        this.NombreProducto = NombreProducto;
        this.FechaLote = FechaLote;
        this.FechadeVencimiento = FechadeVencimiento;
        this.PrecioUnitario = PrecioUnitario;
         sig=ant=null;
    }
    public void getMostrarNodo() {
    String info="La información del producto  es: \n";
        info+="Id Producto : "+IdProducto+"\n";
        info+="Nombre de Producto: "+NombreProducto+"\n";
        info+="Fecha Lote : "+FechaLote+"\n";
        info+="Fecha de Vencimiento : "+FechadeVencimiento+"\n";
        info+="Precio Unitario: "+PrecioUnitario+"\n";
        JOptionPane.showMessageDialog(null, info);
}

}
