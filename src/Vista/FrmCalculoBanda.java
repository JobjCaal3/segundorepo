
package Vista;

import Clases.Datos;
import static Clases.Datos.cerrar;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class FrmCalculoBanda extends javax.swing.JInternalFrame {
Datos rellenar = new Datos();

    public FrmCalculoBanda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtohms = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txttolerancia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt2banda = new javax.swing.JTextField();
        txt1banda = new javax.swing.JTextField();
        txtmultiplicador = new javax.swing.JTextField();
        txttolerancia2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbltolerancia = new javax.swing.JLabel();
        lbl1banda = new javax.swing.JLabel();
        lbl2banda = new javax.swing.JLabel();
        lblmulti = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(900, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(3, 121, 113));

        txtohms.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        txtohms.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tolerancia");

        txttolerancia.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        txttolerancia.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ohms");

        txt2banda.setForeground(new java.awt.Color(51, 51, 51));

        txt1banda.setForeground(new java.awt.Color(51, 51, 51));

        txtmultiplicador.setForeground(new java.awt.Color(51, 51, 51));

        txttolerancia2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1.ra Banda");

        jLabel4.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("2.da Banda");

        jLabel5.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Multiplicador");

        jLabel6.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tolerancia");

        lbltolerancia.setBackground(new java.awt.Color(255, 255, 255));
        lbltolerancia.setText(". ");

        lbl1banda.setBackground(new java.awt.Color(0, 204, 255));
        lbl1banda.setForeground(new java.awt.Color(255, 255, 255));
        lbl1banda.setText(". ");

        lbl2banda.setBackground(new java.awt.Color(255, 255, 255));
        lbl2banda.setText(". ");

        lblmulti.setBackground(new java.awt.Color(255, 255, 255));
        lblmulti.setText(". ");

        btnCalcular.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(242, 212, 146));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 141), 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(2, 52, 54));

        jLabel7.setFont(new java.awt.Font("Raleway Black", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ohms a colores");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(242, 212, 146));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 141), 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(242, 212, 146));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 141), 3));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(242, 212, 146));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 141), 3));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(242, 212, 146));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 141), 3));
        jPanel7.setForeground(new java.awt.Color(184, 176, 141));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbl1banda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbl2banda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbltolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtohms, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1banda, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txttolerancia2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt2banda, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtmultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl1banda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl2banda, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lbltolerancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt1banda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt2banda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttolerancia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtohms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addComponent(btnCalcular)))
                .addGap(0, 113, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            double valorOhmios = Double.parseDouble(txtohms.getText());
            double tolerancia = Double.parseDouble(txttolerancia.getText());
            String texto = txtohms.getText();

            //Longitud de la cadena de texto
            if (texto.length() >= 2) {
                //Primer banda
                char primerCaracter = texto.charAt(0);
                //Segunda Banda
                char segundoCaracter = texto.charAt(1);
                
                //En caso de que sea decimal, menor a 1
                if((valorOhmios < 1)&&(primerCaracter == '0')){
                    // Obtener el color según la posición caracteres
                    char tercerCaracter = texto.charAt(2);
                    char cuartoCaracter = texto.charAt(3);
                    //Obtenemos los colores desde la base de datos
                    String color = obtenerColorDesdeBD(tercerCaracter);
                    String color2 = obtenerColorDesdeBD(cuartoCaracter);
                    //Plateado (multiplicador)
                    Double multiplicador = 0.01;
                    String colorMultiplicador = obtenerColorMultiplicadorDesdeBD(multiplicador);
                    //Obtenemos la tolerancia
                    String colorTolerancia = obtenerColorToleranciaDesdeBD(tolerancia);
                    //Insertamos los datos obtenidos en los Textfields
                    txt1banda.setText(color);
                    txt2banda.setText(color2);
                    txtmultiplicador.setText(colorMultiplicador);
                    txttolerancia2.setText(colorTolerancia);
                    //Insertamos las imagenes de la base de datos desde la base
                    rellenar.obtenerImagen("Color", color, lbl1banda);
                    rellenar.obtenerImagen("Color", color2, lbl2banda);
                    rellenar.obtenerImagen("Color", colorMultiplicador, lblmulti);
                    rellenar.obtenerImagen("Color", colorTolerancia, lbltolerancia);
                    
                }
                //En caso de que sea mayor a uno y decimal (dorado)
                else if ((segundoCaracter == '.')&&(valorOhmios >=1)){
                    //Obtenemos el tercer caracter y obviamos el punto decimal
                    char tercerCaracter = texto.charAt(2);
                    String color = obtenerColorDesdeBD(primerCaracter);
                    String color2 = obtenerColorDesdeBD(tercerCaracter);
                    //Concatenamos los datos
                    String ConcatMultip = "" + primerCaracter + segundoCaracter + tercerCaracter;
                    //Designamos que el multiplicador es dorado
                    Double multiplicador = 0.1;
                    String colorMultiplicador = obtenerColorMultiplicadorDesdeBD(multiplicador);
                    //Obtenemos el color de la tolerancia desde la bd
                    String colorTolerancia = obtenerColorToleranciaDesdeBD(tolerancia);
                    //Insertamos los colores en los Textfields
                    txt1banda.setText(color);
                    txt2banda.setText(color2);
                    txtmultiplicador.setText(colorMultiplicador);
                    txttolerancia2.setText(colorTolerancia);
                    //Insertamos imagenes en los label
                    rellenar.obtenerImagen("Color", color, lbl1banda);
                    rellenar.obtenerImagen("Color", color2, lbl2banda);
                    rellenar.obtenerImagen("Color", colorMultiplicador, lblmulti);
                    rellenar.obtenerImagen("Color", colorTolerancia, lbltolerancia);
                } else {
                    // Obtenemos el color segun el primer y segundo caracter
                    String color = obtenerColorDesdeBD(primerCaracter);
                    String color2 = obtenerColorDesdeBD(segundoCaracter);
                    //Concatenamos los caracteres
                    String ConcatMultip = "" + primerCaracter + segundoCaracter;
                    //Obtenemos el dato de multiplicador (si coincide en la bd)
                    Double multiplicador = Multiplicador(valorOhmios, ConcatMultip);
                    //Obtenemos el color del multiplicador
                    String colorMultiplicador = obtenerColorMultiplicadorDesdeBD(multiplicador);
                    //Obtenemos el color de la tolerancia
                    String colorTolerancia = obtenerColorToleranciaDesdeBD(tolerancia);
                    //Insertamos los colores en los textfields
                    txt1banda.setText(color);
                    txt2banda.setText(color2);
                    txtmultiplicador.setText(colorMultiplicador);
                    txttolerancia2.setText(colorTolerancia);
                    //Insertamos las imagenes de los colores
                    rellenar.obtenerImagen("Color", color, lbl1banda);
                    rellenar.obtenerImagen("Color", color2, lbl2banda);
                    rellenar.obtenerImagen("Color", colorMultiplicador, lblmulti);
                    rellenar.obtenerImagen("Color", colorTolerancia, lbltolerancia);
                }
            } else {

            }
        } catch (NumberFormatException e) {

        } catch (StringIndexOutOfBoundsException e) {

        }
    }//GEN-LAST:event_btnCalcularActionPerformed

public static String obtenerColorToleranciaDesdeBD(double tolerancia) {
    Connection cn = Datos.abrir(); //Abrimos la conexion

    if (cn != null) {
        try {
            // Consulta para obtener el color de la tolerancia desde la BD
            String consulta = "SELECT Color FROM tb_valores_resistencia WHERE Tolerancia = ?";
            PreparedStatement ps = cn.prepareStatement(consulta);
            ps.setDouble(1, tolerancia);
            // Ejecución de la consulta
            ResultSet rs = ps.executeQuery();
            // Verificamos en las rows si coincide
            if (rs.next()) {
                // Obtenemos el nombre del color desde la base de datos
                String colorToleranciaDesdeBD = rs.getString("Color");
                // Cerramos la conexion
                rs.close();
                ps.close();
                //Datos.cerrar(cn);
                return colorToleranciaDesdeBD;
            } else {
                // Si no hay resultados
                return "Desconocido";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Devolver un valor por defecto si hay un error
    return "Desconocido";
}


    
public static Double Multiplicador(Double valorOhmios, String concatMultip) { //Obtenemos el valor total ingresado, y la concatenacion de las dos primeras bandas
    //Convertimos la concatenacion a tipo double
    double ConcatMultip = Double.parseDouble(concatMultip);
    //Se obtiene la lista de los multiplicadores en la BD (todos)
    List<Double> multiplicadoresBD = obtenerMultiplicadoresDesdeBD();
    
    //Recorre los multiplicadores en la BD
    for (Double multiplicador : multiplicadoresBD) {
        //Si la concatenacion por el multiplicador es igual al valor ingresado por el usuario. Ej: 45 * 1000 = 45000.
        if (ConcatMultip * multiplicador == valorOhmios) {
            //Se retorna el dato obtenido del multiplicador.
            return multiplicador;
        }
    }
    
    return null; //Si hay que devolver un valor por defecto en caso de error
}

private static List<Double> obtenerMultiplicadoresDesdeBD() {
    //Lista para almacenar los multiplicadores en la BD
    List<Double> multiplicadores = new ArrayList<>();
    //Abrimos conexión a la BD
    Connection cn = Datos.abrir();
    
    //Si la conexion no está cerrada
    if (cn != null) {
        try {
            // Consulta para obtener todos los valores de Multiplicador ordenados de menor a mayor
            String consulta = "SELECT * FROM tb_valores_resistencia ORDER BY Multiplicador ASC;";
            PreparedStatement ps = cn.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            // Recorre los resultados y agregar a la lista el multiplicador
            while (rs.next()) {
                multiplicadores.add(rs.getDouble("Multiplicador"));
            }

            // Cerramos conexión
            rs.close();
            ps.close();
            //Datos.cerrar(cn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Devuelve la lista de multiplicadores
    return multiplicadores;
}

public static String obtenerColorMultiplicadorDesdeBD(Double multiplicador) {
    //Abrimos conexión
    Connection cn = Datos.abrir();
    //Si se establece la conexion.
    if (cn != null) {
        try {
            // Consulta para obtener el color del multiplicador desde la base de datos
            String consulta = "SELECT Color FROM tb_valores_resistencia WHERE Multiplicador = ?";
            PreparedStatement ps = cn.prepareStatement(consulta);
            ps.setDouble(1, multiplicador);
            ResultSet rs = ps.executeQuery();

            // Verificar resultados en las rows
            if (rs.next()) {
                // Obtener el color desde la base de datos
                String colorDesdeBD = rs.getString("Color");

                // Cerramos conexion
                rs.close();
                ps.close();
                //Datos.cerrar(cn);

                return colorDesdeBD;
            } else {
                // Si no hay resultados
                return "Desconocido";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Valor por defecto(error)
    return "Desconocido";
}
    
    public static String obtenerColorDesdeBD(char caracter) {
    Connection cn = Datos.abrir();

    if (cn != null) {
        try {
            // Consulta para obtener el color desde la base de datos según el número
            String consulta = "SELECT Color FROM tb_valores_resistencia WHERE Valor_Banda = ?";
            PreparedStatement ps = cn.prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(String.valueOf(caracter)));
            ResultSet rs = ps.executeQuery();

            // Verificar en rows
            if (rs.next()) {
                // Obtener el color desde la bd
                String colorDesdeBD = rs.getString("Color");

                // Cerrar conexion
                rs.close();
                ps.close();
                //Datos.cerrar(cn);

                return colorDesdeBD;
            } else {
                // Si no hay resultados
                return "Desconocido";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Valor defecto
    return "Desconocido";
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl1banda;
    private javax.swing.JLabel lbl2banda;
    private javax.swing.JLabel lblmulti;
    private javax.swing.JLabel lbltolerancia;
    private javax.swing.JTextField txt1banda;
    private javax.swing.JTextField txt2banda;
    private javax.swing.JTextField txtmultiplicador;
    private javax.swing.JTextField txtohms;
    private javax.swing.JTextField txttolerancia;
    private javax.swing.JTextField txttolerancia2;
    // End of variables declaration//GEN-END:variables
}
