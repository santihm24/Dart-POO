
package Principal;

import Utils.ButtonEditor;
import Utils.ButtonRenderer;
import Utils.Mascota;
import Utils.Medicamento;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;


public class VentanaMedicamentos extends javax.swing.JFrame {
    
    Basedatos db = new Basedatos(); 
    
    DefaultTableModel modeloTabla;
    Mascota mascota;
    
    public VentanaMedicamentos(Mascota mascota) {
        this.mascota = mascota;
        initComponents();
        initAlternComponents();
    }
    
    private void initAlternComponents() {
        
        setTitle("Medicamentos");
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        ImageIcon iconoMedicamento = new ImageIcon((URL)getClass().getClassLoader().getResource("Imagenes/icono_medicamentos.png"));
        setIconImage(iconoMedicamento.getImage());
        
        nombreMascota.setText(mascota.getNombre());
        
        this.modeloTabla = (DefaultTableModel) tablaMedicamentos.getModel();
        
        tablaMedicamentos.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
        tablaMedicamentos.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaMedicamentos.setRowHeight(30);
        
        llenarTabla();
    }
    
    public void agregarMedicamento() {
        
        String nombre;
        String fechaInicio;
        String fechaFin;
        
        try {
            nombre = campoNombre.getText();
            fechaInicio = campoInicio.getText();
            fechaFin = campoFin.getText();
            if(nombre.equals("") || fechaInicio.equals("") || fechaFin.equals("")) throw new Error("Todos los campos son obligatorios");
        }catch(Error e) {
            VentanaError ventana = new VentanaError(e.getMessage());
            return;
        }
        mascota.agregarMedicamento(new Medicamento(
                nombre, fechaInicio, fechaFin
        ));
       
        llenarTabla();
    }
    
    public void llenarTabla() {
        
        modeloTabla.setRowCount(0);
        
        Medicamento[] medicamentosActuales = mascota.getMedicamentos();
        
        for(int i = 0; i < medicamentosActuales.length; i++) {
            Medicamento medicamentoActual = medicamentosActuales[i];
            JButton botonBorrar = new JButton();
            
            botonBorrar.setBackground(Color.WHITE);
        
            ImageIcon borrarIcono = new ImageIcon((URL)getClass().getClassLoader().getResource("Imagenes/icono_eliminar.png"));
            botonBorrar.setIcon(new ImageIcon(borrarIcono.getImage().getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH)));
            
            final int indiceActual = i;
            
            botonBorrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mascota.borrarMedicamento(indiceActual);
                    llenarTabla();
                }
            });
            
            Object[] objetoTabla = new Object[]{
                i + 1,
                medicamentoActual.getNombre(),
                medicamentoActual.getFechaInicio(),
                medicamentoActual.getFechaFin(),
                botonBorrar
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
        etiquetaInicio = new javax.swing.JLabel();
        etiquetaFin = new javax.swing.JLabel();
        campoFin = new javax.swing.JTextField();
        botonCrear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedicamentos = new javax.swing.JTable();
        nombreMascota = new javax.swing.JLabel();
        campoInicio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 102));

        tituloMascota.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tituloMascota.setText("MASCOTA:");

        etiquetaNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaNombre.setText("Nombre medicamento:");

        campoNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        etiquetaInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaInicio.setText("Fecha Inicio:");

        etiquetaFin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaFin.setText("Fecha Fin");

        campoFin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        botonCrear.setBackground(new java.awt.Color(255, 255, 0));
        botonCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonCrear.setText("CREAR");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        tablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nombre", "Fecha Inicio", "Fecha Fin", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMedicamentos.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tablaMedicamentos);

        nombreMascota.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        nombreMascota.setForeground(new java.awt.Color(0, 153, 153));
        nombreMascota.setText("Texto de Prueba");

        campoInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloMascota)
                        .addGap(18, 18, 18)
                        .addComponent(nombreMascota))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiquetaNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaInicio)
                                    .addComponent(campoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaFin)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloMascota)
                    .addComponent(nombreMascota))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaInicio)
                    .addComponent(etiquetaFin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonCrear)
                        .addComponent(campoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoInicio))
                    .addComponent(campoNombre))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        agregarMedicamento();
    }//GEN-LAST:event_botonCrearActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoInicioActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMedicamentos(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrear;
    private javax.swing.JTextField campoFin;
    private javax.swing.JTextField campoInicio;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel etiquetaFin;
    private javax.swing.JLabel etiquetaInicio;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreMascota;
    private javax.swing.JTable tablaMedicamentos;
    private javax.swing.JLabel tituloMascota;
    // End of variables declaration//GEN-END:variables
}
