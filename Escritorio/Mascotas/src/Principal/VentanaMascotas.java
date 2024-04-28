
package Principal;

import Utils.ButtonEditor;
import Utils.ButtonRenderer;
import Utils.Mascota;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class VentanaMascotas extends javax.swing.JFrame {
    
    public void mostrar(JButton tabla){
        
        String sql = "select * from" + tabla;
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
        System.out.print(sql);
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Tipo");
        model.addColumn("Edad");
        visor.setModel(model);
        
        String [] datos = new String[4];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                model.addRow(datos);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
        
    }
    
    Basedatos db = new Basedatos(); 
    
    DefaultTableModel modeloTabla;

    Mascota[] mascotas = new Mascota[]{
        new Mascota("Zeus", "Perro", 6), 
        new Mascota("Tony", "Perro", 3),
        new Mascota("Niña", "Gato", 2),
        new Mascota("Rocko", "Perro", 16)
    };
    
    public VentanaMascotas() {
        initComponents();
        initAlternComponents();
    }
    
    private void initAlternComponents() {
        modeloTabla = (DefaultTableModel) visor.getModel();
        setVisible(true);
        setTitle("Tabla Botones");
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Lista Mascotas");
        
        ImageIcon iconoMascotas = new ImageIcon((URL)getClass().getClassLoader().getResource("Imagenes/icono_mascotas.png"));
        setIconImage(iconoMascotas.getImage());
        
        visor.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
        visor.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JCheckBox()));
        visor.setRowHeight(30);
        
        llenarTabla();
    }
    
    public void agregarMascota() {
        
        String nombre;
        String tipo;
        int edad;
        
        try {
            nombre = campoNombre.getText();
            tipo = (String) campoTipo.getSelectedItem();
            if(nombre.equals("") || tipo.equals("")) throw new Error("Todos los campos son obligatorios");
        }catch(Error e) {
            VentanaError ventana = new VentanaError(e.getMessage());
            return;
        }
        
        try {
            edad = Integer.parseInt(campoEdad.getText());
            if(edad < 0) throw new NumberFormatException();
        } catch(NumberFormatException e) {
            VentanaError ventana = new VentanaError("Por favor, digite una edad valida");
            return;
        }

        mascotas = Arrays.copyOf(mascotas, mascotas.length + 1);
        mascotas[mascotas.length - 1] = new Mascota(nombre, tipo, edad);
       
        llenarTabla();
    }
    
    public void llenarTabla() {
        
        modeloTabla.setRowCount(0);
        
        for(int i = 0; i < mascotas.length; i++) {
            Mascota mascota = mascotas[i];
            JButton botonMedicamentos = new JButton();
            
            botonMedicamentos.setBackground(Color.WHITE);
        
            ImageIcon medicamentoIcono = new ImageIcon((URL)getClass().getClassLoader().getResource("Imagenes/icono_medicamentos.png"));
            botonMedicamentos.setIcon(new ImageIcon(medicamentoIcono.getImage().getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH)));

            botonMedicamentos.addActionListener((ActionEvent e) -> {
                VentanaMedicamentos ventana = new VentanaMedicamentos(mascota);
            });
            
            Object[] objetoTabla = new Object[]{
                i + 1,
                mascota.getNombre(), 
                mascota.getTipo(), 
                mascota.getEdad(),
                botonMedicamentos
            };
            modeloTabla.addRow(objetoTabla);
        }
        
        repaint();
        revalidate();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMascota = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etiquetaTipo = new javax.swing.JLabel();
        campoTipo = new javax.swing.JComboBox<>();
        etiquetaEdad = new javax.swing.JLabel();
        campoEdad = new javax.swing.JTextField();
        botonCrear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        scroll = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloMascota.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tituloMascota.setText("MASCOTA:");

        etiquetaNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaNombre.setText("Nombre:");

        campoNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        etiquetaTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaTipo.setText("Tipo:");

        campoTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato" }));

        etiquetaEdad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaEdad.setText("Edad:");

        campoEdad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        botonCrear.setBackground(new java.awt.Color(0, 0, 153));
        botonCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonCrear.setForeground(new java.awt.Color(255, 255, 255));
        botonCrear.setText("CREAR");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nombre", "Tipo", "Edad", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        visor.setCellSelectionEnabled(true);
        scroll.setViewportView(visor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMascota)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiquetaNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaTipo)
                                        .addGap(100, 100, 100)
                                        .addComponent(etiquetaEdad)
                                        .addGap(120, 171, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(botonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jSeparator1)
                            .addComponent(scroll))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloMascota)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaTipo)
                    .addComponent(etiquetaEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonCrear)
                            .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(campoNombre))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        agregarMascota();
        mostrar(botonCrear);
        
        PreparedStatement pps = con.prepareStatement("INSERT INTO tablamascotas(Nombre,Tipo,Edad) VALUES");
    }//GEN-LAST:event_botonCrearActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCrear;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> campoTipo;
    private javax.swing.JLabel etiquetaEdad;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTipo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel tituloMascota;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables

    private static class conexion {

        public conexion() {
        }

        private Connection conectar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class con {

        private static PreparedStatement prepareStatement(String insert_into_tablamascotasNombreTipoEdad_V) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public con() {
        }
    }
}
