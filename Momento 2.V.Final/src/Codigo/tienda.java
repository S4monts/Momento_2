/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;
import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 *
 * @author VALENTINAYSARAH
 */
public class tienda {
String IdProducto;
String NombreProducto;
public ObjectProperty<LocalDate> FechaLoteD;
public ObjectProperty<LocalDate> FechadeVencimiento;
double PrecioUnitario;

public tienda() {
        int IdProducto=-1;
        NombreProducto="";
        PrecioUnitario=1;
        FechaLoteD=FechadeVencimiento=new SimpleObjectProperty<>(LocalDate.now());
    }

    public tienda(String IdProducto, String NombreProducto, LocalDate FechaLoteD, LocalDate FechadeVencimiento, double PrecioUnitario) {
        this.IdProducto = IdProducto;
        this.NombreProducto = NombreProducto;
        this.FechaLoteD = new SimpleObjectProperty<>(FechaLoteD);
        this.FechadeVencimiento = new SimpleObjectProperty<>(FechadeVencimiento);
        this.PrecioUnitario = PrecioUnitario;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public ObjectProperty<LocalDate> getFechaLoteD() {
        return FechaLoteD;
    }

    public void setFechaLoteD(ObjectProperty<LocalDate> FechaLoteD) {
        this.FechaLoteD = FechaLoteD;
    }

    public ObjectProperty<LocalDate> getFechadeVencimiento() {
        return FechadeVencimiento;
    }

    public void setFechadeVencimiento(ObjectProperty<LocalDate> FechadeVencimiento) {
        this.FechadeVencimiento = FechadeVencimiento;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    
    
}

