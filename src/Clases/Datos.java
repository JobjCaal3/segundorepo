/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class Datos {
    
    private static Connection conexion;

    // Método para abrir la conexión a la base de datos
    public static Connection abrir() {
        try {
            if (conexion == null || conexion.isClosed()) {
                conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbproyecto?serverTimezone=UTC", "root", "12Eliu34."); 
            }
        } catch (SQLException e) {
            System.out.println("Error al abrir la conexión a la base de datos: " + e.getMessage());
        }
        return conexion;
    }            
    
    // Método para cerrar la conexión a la base de datos
    public static void cerrar() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión a la base de datos: " + e.getMessage());
            }
        }
    }
    
    public void RellenarDatos(String columna, String columna1,JComboBox Combo){
        Connection cn = abrir();
        try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery("SELECT "+ columna +" FROM tb_valores_resistencia WHERE " + columna1 + " IS NOT NULL");

           while(rs.next()){
               Combo.addItem(rs.getString(columna));
           }
            
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Producto no registrado." + e.getMessage());
        }finally{
            cerrar();
        }
        
    }

    public void obtenerImagen(String columna, String valorSeleccionado, JLabel label) {
        Connection cn = abrir();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT imagen FROM tb_valores_resistencia WHERE " + columna + " = ?");
            ps.setString(1, valorSeleccionado);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                byte[] imagenBytes = rs.getBytes("imagen");
                ImageIcon imagen = new ImageIcon(imagenBytes);

                // Escalar la imagen al tamaño del JLabel
                Image imagenEscalada = imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);

                label.setIcon(new ImageIcon(imagenEscalada)); // Establecer la imagen en el JLabel
            } else {
                // Manejar el caso en el que no se encontró la imagen
            }
        } catch (SQLException e) {
            // Manejar excepciones de SQL
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } finally {
            cerrar();
        }    
    }
    
    public String ObtenerDatoV(String Columna1, String Columna2, String Dato){
        Connection cn = abrir();
        String valor = null;
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT "+ Columna1 +" FROM tb_valores_resistencia where "+ Columna2 +" = '" + Dato + "'");
            if (rs.next()) {
            valor = rs.getString(1); // Obtener el valor de la primera columna del resultado
        }
            
        }catch (SQLException e) {
            // Manejar excepciones de SQL
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } finally {
            cerrar();
        }   
        return valor;
        
    }
    
    public void InsertarDatos(JTextField Color, JTextField Valor_Banda, JTextField Multiplicador, JTextField Tolerancia, JTextField PPM, byte[] imagenData){
        Connection cn = abrir(); 
        try {
            String DColor = Color.getText();
            int DValor_Banda = Integer.parseInt(Valor_Banda.getText());
            double DMultiplicador = Double.parseDouble(Multiplicador.getText()); 
            double DTolerancia = Double.parseDouble(Tolerancia.getText()); 
            int DPPM = Integer.parseInt(PPM.getText()); 

            System.out.println("DColor: " + DColor);
            System.out.println("DValor_Banda: " + DValor_Banda);
            System.out.println("DMultiplicador: " + DMultiplicador);
            System.out.println("DTolerancia: " + DTolerancia);
            System.out.println("DPPM: " + DPPM);

            PreparedStatement ps = cn.prepareStatement("INSERT INTO tb_valores_resistencia (Color, Valor_Banda, Multiplicador, Tolerancia, PPM, imagen) VALUES (?,?,?,?,?,?)");

            ps.setString(1, DColor);
            ps.setInt(2, DValor_Banda);
            ps.setDouble(3, DMultiplicador);
            ps.setDouble(4, DTolerancia);
            ps.setInt(5, DPPM);
            ps.setBytes(6, imagenData);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se han ingresado los datos correctamente");
        } catch(SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            cerrar();
        }   
    }
    
    public void ActualizarDatos(JTextField ID ,JTextField Color, JTextField Valor_Banda, JTextField Multiplicador, JTextField Tolerancia, JTextField PPM, byte[] imagenData){
        Connection cn = abrir(); 
        try{
            String DColor = Color.getText();
            int DValor_Banda = Integer.parseInt(Valor_Banda.getText());
            double DMultiplicador = Double.parseDouble(Multiplicador.getText()); 
            double DTolerancia = Double.parseDouble(Tolerancia.getText()); 
            int DPPM = Integer.parseInt(PPM.getText());
            int DId = Integer.parseInt(ID.getText());
            PreparedStatement ps = cn.prepareStatement("UPDATE tb_valores_resistencia SET Color = ?, Valor_Banda = ?, Multiplicador = ?, Tolerancia = ?, PPM = ?, imagen = ? WHERE IdResistencia = ? ");
            
            ps.setString(1, DColor);
            ps.setInt(2,DValor_Banda);
            ps.setDouble(3, DMultiplicador);
            ps.setDouble(4, DTolerancia);
            ps.setInt(5, DPPM);
            ps.setBytes(6, imagenData);
            ps.setInt(7, DId);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actulizacion de datos Exitosa");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }finally {
            cerrar();
        }   
    }
    
    public void ConsultarDatos(JTable Tabla){
        Connection cn = abrir(); 
        DefaultTableModel modeloTabla = new DefaultTableModel();
                
        modeloTabla.addColumn("IdResistencia");
        modeloTabla.addColumn("Color");
        modeloTabla.addColumn("Valor_Banda");
        modeloTabla.addColumn("Multiplicador");
        modeloTabla.addColumn("Tolerancia");
        modeloTabla.addColumn("PPM");
        
        
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM tb_valores_resistencia"); 
            ResultSet rs = ps.executeQuery();
            // Agregar filas con los datos recuperados
            while (rs.next()) {
                Object[] fila = new Object[7];
                fila[0] = rs.getInt("IdResistencia");
                fila[1] = rs.getString("Color");
                fila[2] = rs.getInt("Valor_Banda");
                fila[3] = rs.getDouble("Multiplicador");
                fila[4] = rs.getDouble("Tolerancia");
                fila[5] = rs.getInt("PPM");

                modeloTabla.addRow(fila);
            }
            // Asigna el modelo de tabla al JTable
            Tabla.setModel(modeloTabla);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }finally {
            cerrar();
        }   
        
    }
    
    public void Seleccionar(JTable Tabla,JTextField ID, JTextField Color, JTextField Valor_Banda, JTextField Multiplicador, JTextField Tolerancia, JTextField PPM){
        try{
            int fila = Tabla.getSelectedRow();
            if(fila >= 0){
                ID.setText((Tabla.getValueAt(fila, 0).toString()));
                Color.setText((Tabla.getValueAt(fila, 1).toString()));
                Valor_Banda.setText((Tabla.getValueAt(fila, 2).toString()));
                Multiplicador.setText((Tabla.getValueAt(fila, 3).toString()));
                Tolerancia.setText((Tabla.getValueAt(fila, 4).toString()));
                PPM.setText((Tabla.getValueAt(fila, 5).toString()));
            }else{
                JOptionPane.showMessageDialog(null, "Fila no selecionada");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    public void EliminarDatos(JTextField ID){
        Connection cn = abrir(); 
        try{
            int DId = Integer.parseInt(ID.getText());
            PreparedStatement ps = cn.prepareStatement("DELETE FROM tb_valores_resistencia WHERE IdResistencia = ?"); 
            ps.setInt(1, DId);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }finally {
            cerrar();
        }   
        
    }
    
    
}
