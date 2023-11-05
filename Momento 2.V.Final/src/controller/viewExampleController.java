/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;
import Codigo.Pila;
import Codigo.tienda;
/**
 * FXML Controller class
 *
 * @author VALENTINAYSARAH
 */
public class viewExampleController implements Initializable {
 
    
    private Pila Codigo = new Pila();
    private ObservableList<tienda> Producto  = FXCollections.observableArrayList();
    //BOTONES DE MENU
    @FXML
    private MenuBar menu;
    
    @FXML
    private Menu buscar;
    
    @FXML
    private MenuItem idp;
    
    @FXML
    private MenuItem npb;
    
    @FXML
    private MenuItem flb;
    
    @FXML
    private MenuItem fvb;
    
    @FXML
    private MenuItem pub;
       
    @FXML
    private Menu listar;
    
    
    @FXML
    private MenuItem fechalote;
    
    @FXML
    private MenuItem fechavencimiento;
    
    //BOTONES cerrar y limpiar
     @FXML
    private Button cerrarboton;
    
    @FXML
    private Button botonLim;

   @FXML
    private void limpiarTabla(ActionEvent event) {
    Producto.clear();
}
    @FXML
    private void cerrar(ActionEvent event) {
    System.exit(0);
}
    /**
     * BOTONES PRECIO, PROMEDIO Y FECHA
     */
    @FXML
    private Button BotonR;
    @FXML
    Button botonp;
    
    @FXML
    Button mayboton;
    
    @FXML
    Button menboton;
    
    @FXML
    Button meboton;
    
    @FXML
    Button maboton;
    @FXML
    private AnchorPane Anchor;
    
    @FXML
    private Label texto;
    @FXML
    DatePicker FechaVencimientoDate;
    
    @FXML
    DatePicker FechaLoteDate;
    
    //TABLA
     @FXML
    private TableView<tienda> tablavis;
     
    @FXML
    private TableColumn<tienda, String> IdProducto;
    
    @FXML
    private TableColumn<tienda, String> NombreProducto;
    
    @FXML
    private TableColumn<tienda, LocalDate> FechaLoteD;

    @FXML
    private TableColumn<tienda, LocalDate> FechadeVencimiento;
    @FXML
    private TableColumn<tienda, Double> PrecioUnitario;
    
    //Finalización de la identificación de tabla

    // ACCIÓN BUSCAR PRODUCTO,PRECIO,FECHA ETC.
    @FXML
    private void Action(ActionEvent event){
        String IdP = JOptionPane.showInputDialog("Proporcione el ID que desea buscar");
        tienda Tienda = Codigo.getInfoId(IdP);
        
        if (Tienda!= null) {
                String Info = "ID : " + Tienda.getIdProducto() +
                              "\nNombre: " + Tienda.getNombreProducto() +
                              "\nFecha Lote: " +Tienda.getFechaLoteD().getValue() +
                              "\nFecha Vencimiento: " + Tienda.getFechadeVencimiento().getValue() +
                              "\nPrecio : " + Tienda.getPrecioUnitario();
                JOptionPane.showConfirmDialog(null,"ID  Producto Localizado"+Info);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un producto con el ID " + IdP);
            }
        }
    @FXML
    private void Action1(ActionEvent event){
        String NomP = JOptionPane.showInputDialog("Proporcione el Nombre que desea buscar");
        tienda Tienda = Codigo.getInfoNombre(NomP);
        
        if (Tienda!= null) {
                String Info = "ID : " + Tienda.getIdProducto() +
                              "\nNombre: " + Tienda.getNombreProducto() +
                              "\nFecha Lote: " +Tienda.getFechaLoteD().getValue() +
                              "\nFecha Vencimiento: " + Tienda.getFechadeVencimiento().getValue() +
                              "\nPrecio : " + Tienda.getPrecioUnitario();
                JOptionPane.showConfirmDialog(null,"Nombre Producto Localizado"+Info);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un producto con el Nombre " + NomP);
            }
        }
        @FXML
    private void Action2(ActionEvent event){
    try {
        LocalDate FechaL = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la Fecha Lote que desea buscar (dd/MM/yyyy)"));
        tienda Tienda = Codigo.getInfoFechaLote(FechaL);

        if (Tienda!= null) {
            String Info = "ID : " + Tienda.getIdProducto() +
                              "\nNombre: " + Tienda.getNombreProducto() +
                              "\nFecha Lote: " +Tienda.getFechaLoteD().getValue() +
                              "\nFecha Vencimiento: " + Tienda.getFechadeVencimiento().getValue() +
                              "\nPrecio : " + Tienda.getPrecioUnitario();
            
            JOptionPane.showMessageDialog(null,"Producto Encontrado"+Info);
        } else {
            JOptionPane.showConfirmDialog(null, "Producto No Encontrado.No se encontró un producto con la Fecha Lote " + FechaL);
        }
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(null, "Formato de fecha inválido, por favor ingrese una fecha en el formato dd/MM/yyyy", "Fecha Inválida", JOptionPane.ERROR_MESSAGE);
    }
    }
        @FXML
    private void Action3(ActionEvent event){
    try {
        LocalDate FechaVencimiento = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la Fecha Vencimiento que desea buscar (dd/MM/yyyy)"));
        tienda Tienda = Codigo.getInfoFechaV(FechaVencimiento);

        if (Tienda!= null) {
            String Info = "ID : " + Tienda.getIdProducto() +
                              "\nNombre: " + Tienda.getNombreProducto() +
                              "\nFecha Lote: " +Tienda.getFechaLoteD().getValue() +
                              "\nFecha Vencimiento: " + Tienda.getFechadeVencimiento().getValue() +
                              "\nPrecio : " + Tienda.getPrecioUnitario();
            
            JOptionPane.showMessageDialog(null,"Producto Encontrado"+Info);
        } else {
            JOptionPane.showConfirmDialog(null, "Producto No Encontrado.No se encontró un producto con la Fecha de Vencimiento " + FechaVencimiento);
        }
    } catch (DateTimeParseException e) {
JOptionPane.showMessageDialog(null, "Formato de fecha inválido, por favor ingrese una fecha en el formato dd/MM/yyyy", "Fecha Inválida", JOptionPane.ERROR_MESSAGE);
    }
}
    @FXML
    private void Action4(ActionEvent event){
        
        double Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio que desea buscar"));
        tienda Tienda = Codigo.getInfoPrecio(Precio);
        
         if (Tienda!= null) {
            String Info = "ID : " + Tienda.getIdProducto() +
                              "\nNombre: " + Tienda.getNombreProducto() +
                              "\nFecha Lote: " +Tienda.getFechaLoteD().getValue() +
                              "\nFecha Vencimiento: " + Tienda.getFechadeVencimiento().getValue() +
                              "\nPrecio : " + Tienda.getPrecioUnitario();
            
            JOptionPane.showMessageDialog(null,"Producto Encontrado"+Info);
        } else {
            JOptionPane.showConfirmDialog(null, "Producto No Encontrado.No se encontró un producto con el precio siguiente : " +Precio);
        }
            }


      // PRECIOS
       @FXML
    private void mayorp(ActionEvent event){
        tienda MayorPrecio = Codigo.getMayorPrecio();

    if (MayorPrecio != null) {
        String info = "ID  " + MayorPrecio.getIdProducto()+
                          "\nNOMBRE PRODUCTO : " + MayorPrecio.getNombreProducto()+
                          "\nPRECIO PRODUCTO : " + MayorPrecio.getPrecioUnitario();
        JOptionPane.showMessageDialog(null,"PRODUCTO CON MENOR PRECIO ES " +info);
    } else {
        JOptionPane.showConfirmDialog(null, "LA LISTA ESTÁ VACIA. INTRODUZCA DATOS ");
      }
    }
      @FXML
    private void menorpr(ActionEvent event){
        tienda menorPrecio = Codigo.getMenorPrecio();

    if (menorPrecio != null) {
        String info = "ID  " + menorPrecio.getIdProducto()+
                          "\nNOMBRE PRODUCTO : " + menorPrecio.getNombreProducto()+
                          "\nPRECIO PRODUCTO : " + menorPrecio.getPrecioUnitario();
        JOptionPane.showMessageDialog(null,"PRODUCTO CON MENOR PRECIO ES " +info);
    } else {
        JOptionPane.showConfirmDialog(null, "LA LISTA ESTÁ VACIA. INTRODUZCA DATOS ");
      }
    }
 @FXML
    private void ProductosMesLote(ActionEvent event) {
    int MesL = Integer.parseInt(JOptionPane.showInputDialog("Especifique el mes que desea buscar"));

    List<tienda> TiendaMes = Codigo.getProductosPorMesLote(MesL);

    if (!TiendaMes.isEmpty()) {
        StringBuilder Info = new StringBuilder("Producto(s) con mes de lote " +MesL + ":\n");

        for (tienda Tienda : TiendaMes ) {
        Info.append("ID: ").append(Tienda.getIdProducto())
                .append("  NOMBRE : ").append(Tienda.getNombreProducto())
                .append("  PRECIO : ").append(Tienda.getPrecioUnitario())
                .append("\n");
    }

        JOptionPane.showMessageDialog(null,"Producto(s) por mes de lote " +Info);
    } else {
        JOptionPane.showMessageDialog(null, "No se encontraron productos con mes de lote " +MesL, "No se encontraron productos", JOptionPane.ERROR_MESSAGE);
    }
}
    @FXML
    private void ProductosMesVencimiento(ActionEvent event) {
    int MesV = Integer.parseInt(JOptionPane.showInputDialog("Especifique el mes que desea buscar"));

    List<tienda> TiendaMes = Codigo.getProductosPorMesLote(MesV);

    if (!TiendaMes.isEmpty()) {
        StringBuilder Info = new StringBuilder("Producto(s) con mes de vencimiento " +MesV + ":\n");
        for (tienda Tienda : TiendaMes ) {
        Info.append("ID: ").append(Tienda.getIdProducto())
                .append("  NOMBRE : ").append(Tienda.getNombreProducto())
                .append("  PRECIO : ").append(Tienda.getPrecioUnitario())
                .append("\n");
    }

        JOptionPane.showMessageDialog(null,"Producto(s) por mes de vencimiento " +Info);
    } else {
        JOptionPane.showMessageDialog(null, "No se encontraron productos con mes de lote " +MesV, "No se encontraron productos", JOptionPane.ERROR_MESSAGE);
    }
}
// PROMEDIO
  
    @FXML
    private void promedio(ActionEvent event){
        double pPromedio = Codigo.Promedio();
        JOptionPane.showMessageDialog(null, "Costo promedio de los productos es : " +pPromedio+ "!!!!");
    }
    @FXML
    private void Mepromedio(ActionEvent event){
            List<tienda> MenorPromedio = Codigo.getMenorPromedio();

    StringBuilder Info = new StringBuilder("Producto(s) con precio menor al promedio:\n");

    for (tienda Tienda : MenorPromedio) {
        Info.append("ID: ").append(Tienda.getIdProducto())
                .append(" NOMBRE : ").append(Tienda.getNombreProducto())
                .append(" PRECIO : ").append(Tienda.getPrecioUnitario())
                .append("\n");
        }
    
    JOptionPane.showMessageDialog(null,"PRODUCTO CON MENOR PRECIO ES " +Info);
    }
    @FXML
    private void mayorpro(ActionEvent event){
            List<tienda> MayorPromedio = Codigo.getMayorPromedio();

    StringBuilder Info = new StringBuilder("Producto(s) con precio mayor al promedio:\n");

    for (tienda Tienda : MayorPromedio) {
        Info.append("ID: ").append(Tienda.getIdProducto())
                .append("  NOMBRE : ").append(Tienda.getNombreProducto())
                .append("  PRECIO : ").append(Tienda.getPrecioUnitario())
                .append("\n");
    }
    JOptionPane.showMessageDialog(null,"PRODUCTO CON MAYOR PRECIO ES " +Info);
}
    
    
    
    //tabla-acción
    @FXML
    private TextField IdProductoTextField,NombreProductoTextField,PrecioUnitarioTextField;
    
    @FXML
    private void eventKey(KeyEvent event){
        
        Object evt = event.getSource();
        
     
        if(evt.equals(IdProductoTextField)){
        
            if(!Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }
           
         }else if (evt.equals(NombreProductoTextField)){
            
            if(!Character.isLetter(event.getCharacter().charAt(0))){
                event.consume();
            }
            
        }else if (evt.equals(PrecioUnitarioTextField)){ 
            
            if(!Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }
            
        }    
            
    }
    @FXML
    private void Registrar(ActionEvent event){
    String IdP = IdProductoTextField.getText();
    String NomP = NombreProductoTextField.getText();
    double Precio = Double.parseDouble(PrecioUnitarioTextField.getText());
    LocalDate FechLo = FechaLoteDate.getValue();
    LocalDate FechVen = FechaVencimientoDate.getValue();
        if (Codigo.Buscarid(IdP)){
        JOptionPane.showConfirmDialog(null,"ID  REPETIDO. REGISTRE OTRO");
    }else if (Codigo.BuscarNombre( NomP)){
        JOptionPane.showConfirmDialog(null,
                " NOMBRE PRODUCTO REPETIDO. REGISTRE OTRO");
        }else{
        tienda Tienda = new tienda(IdP, NomP,FechLo, FechVen,Precio);
        Codigo.setPush(Tienda);
        Producto.add(Tienda);
        IdProductoTextField.clear();
        NombreProductoTextField.clear();
        PrecioUnitarioTextField.clear();

        JOptionPane.showMessageDialog(null, "ELEMENTO AGREGADO");
    }
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    IdProducto.setCellValueFactory(new PropertyValueFactory<tienda, String>("Id  Producto"));
    NombreProducto.setCellValueFactory(new PropertyValueFactory<tienda, String>("Nombre Producto"));
    PrecioUnitario.setCellValueFactory(new PropertyValueFactory<tienda, Double>("Precio Unitario"));
    FechaLoteD.setCellValueFactory(cellData -> cellData.getValue().getFechaLoteD());
    FechadeVencimiento.setCellValueFactory(cellData -> cellData.getValue().getFechadeVencimiento());    
    tablavis.setItems(Producto);
    }
}

    
    
    

