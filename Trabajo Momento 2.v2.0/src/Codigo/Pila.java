/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;
import java.util.ArrayList;
import java.util.Stack;
import java.time.LocalDate;
import java.util.List;
/**
 *
 * @author VALENTINAYSARAH
 */
public class Pila {
    
    private Stack<tienda> Producto;

    public Pila() {
        this.Producto = new Stack<>();
    }
    public void setPush(tienda Tienda) {
        Producto.push(Tienda);
    }

    public tienda setPop() {
        if (!Producto.isEmpty()) {
            return Producto.pop();
        } else {
            return null;
        }
    }
    public boolean Buscarid(String IdP) {
        for (tienda Tienda : Producto) {
            if (Tienda.getIdProducto()== IdP) {
                return true;
            }
        }
        return false;
    }
     
     public boolean BuscarNombre(String NomP) {
        for (tienda Tienda : Producto) {
            if (Tienda.getNombreProducto() == null ? NomP == null : Tienda.getNombreProducto().equals(NomP)) {
                return true;
            }
        }
        return false;
  }
    public tienda getInfoId (String IdP){
    for (tienda Tienda : Producto) {
        
            if (Tienda.getIdProducto()== IdP) {
                
                return Tienda;
            }
        }
        return null;
    }
    public tienda getInfoNombre (String NomP){
    for (tienda Tienda : Producto) {
        
            if (Tienda.getNombreProducto() == null ? NomP == null : Tienda.getNombreProducto().equals(NomP)) {
                
                return Tienda;
            }
        }
        return null;
    }
    public tienda getInfoFechaLote (LocalDate FechaL){
    for (tienda Tienda : Producto) {
        if (Tienda.getFechaLoteD().getValue().equals(FechaL)) {
            return Tienda;
        }
    }
    return null;
    }
    public tienda getInfoFechaV (LocalDate FechaVencimiento){
    for (tienda Tienda : Producto) {
        if (Tienda.getFechadeVencimiento().getValue().equals(FechaVencimiento)) {
            return Tienda;
        }
    }
    return null;
    }
    public tienda getInfoPrecio (double Precio){
    for (tienda Tienda : Producto) {
        
            if (Tienda.getPrecioUnitario()==Precio) {
                
                return Tienda;
            }
        }
        return null;
    }
    public double Promedio(){
   double Suma = 0;

        for (tienda Tienda : Producto) {
            Suma= Tienda.getPrecioUnitario();
        }

        if (!Producto.isEmpty()) {
            return Suma / Producto.size();
        }

        return 0;
    }
    public List<tienda> getMayorPromedio() {
        double MayorPromedio = Promedio();
        List<tienda> pMayorPromedio = new ArrayList<>();

        for (tienda Tienda : Producto) {
            if (Tienda.getPrecioUnitario()> MayorPromedio) {
                pMayorPromedio.add(Tienda);
            }
        }

        return pMayorPromedio;
    }
    public List<tienda> getMenorPromedio() {
        double menorPromedio = Promedio();
        List<tienda> pMenorPromedio = new ArrayList<>();

        for (tienda Tienda : Producto)
          if (Tienda.getPrecioUnitario()< menorPromedio) {
                pMenorPromedio.add(Tienda);
            }
        return pMenorPromedio;
    }
    public tienda getMayorPrecio() {
        if (Producto.isEmpty()) {
            return null;
        }
    tienda MayorPrecio = Producto.get(0);

        for (tienda Tienda : Producto) {
            if (Tienda.getPrecioUnitario()> MayorPrecio.getPrecioUnitario()) {
                MayorPrecio =Tienda;
            }
        }

        return MayorPrecio;
    }
    public tienda getMenorPrecio() {
        if (Producto.isEmpty()) {
            return null;
        }    
        tienda MenorPrecio = Producto.get(0);

        for (tienda Tienda : Producto) {
            if (Tienda.getPrecioUnitario()< MenorPrecio.getPrecioUnitario()) {
                MenorPrecio =Tienda;
            }
        }

        return MenorPrecio;
    }
    public List<tienda> getProductosPorMesLote(int MesL) {
    List<tienda> MesLote = new ArrayList<>();
    for (tienda Tienda : Producto) {
        if (Tienda.getFechaLoteD().getValue().getMonthValue() == MesL) {
            MesLote.add(Tienda);
        }
    }
    return MesLote;
    }
    public List<tienda> getMesVencimiento(int MesV) {
    List<tienda> MesVencimiento = new ArrayList<>();
    for (tienda Tienda : Producto) {
        if (Tienda.getFechadeVencimiento().getValue().getMonthValue() == MesV) {
            MesVencimiento.add(Tienda);
        }
    }
    return MesVencimiento;
    }
    
}
