/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practica20240604;

import accesoadatos.ProductoDAL;
import entidades.Categoria;
import entidades.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import utilerias.OpcionesCRUD;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateo
 */
public class FrmProductosLec extends javax.swing.JFrame {

    private OpcionesCRUD opcionCRUD;

    /**
     * Creates new form FrmProductosLec
     */
    public FrmProductosLec() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();
        jBtnIrACrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jBtnEditar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setTitle("Buscar productos");

        jLabel1.setText("Nombre");

        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jBtnIrACrear.setText("Ir a Crear");
        jBtnIrACrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIrACrearActionPerformed(evt);
            }
        });

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableProductos);

        jBtnEditar.setText("Editar");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnIrACrear))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscar)
                    .addComponent(jBtnIrACrear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEditar)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnCancelar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIrACrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIrACrearActionPerformed
        // TODO add your handling code here:
        opcionCRUD = OpcionesCRUD.CREAR;
        FrmProductosEsc frmProductosEsc = new FrmProductosEsc(opcionCRUD, new Producto());
        frmProductosEsc.setTitle("Crear producto");
        frmProductosEsc.setVisible(true);
    }//GEN-LAST:event_jBtnIrACrearActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private Producto obtenerDatos() {
        Producto producto = new Producto();
        int row = jTableProductos.getSelectedRow();
        producto.setProductoId((int) jTableProductos.getValueAt(row, 0));
        producto.setNombre(jTableProductos.getValueAt(row, 1).toString());
        producto.setDescripcion(jTableProductos.getValueAt(row, 2).toString());
        producto.setPrecio((double) jTableProductos.getValueAt(row, 3));
        producto.setCategoriaId((int) jTableProductos.getValueAt(row, 4));
        
        Categoria categoria= new Categoria();
        categoria.setNombre(jTableProductos.getValueAt(row, 5).toString());
        categoria.setCategoriaId((int)jTableProductos.getValueAt(row, 4));
        producto.setCategoria(categoria);
        return producto;
    }
    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        // TODO add your handling code here:
        int row = jTableProductos.getSelectedRow();
        if (row != -1) {
            opcionCRUD = OpcionesCRUD.MODIFICAR;
            FrmProductosEsc frmProductosEsc = new FrmProductosEsc(opcionCRUD, obtenerDatos());
            frmProductosEsc.setTitle("Modificar producto");
            frmProductosEsc.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Seleccionar una fila", "Producto",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        int row = jTableProductos.getSelectedRow();
        if (row != -1) {
            opcionCRUD = OpcionesCRUD.ELIMINAR;
            FrmProductosEsc frmProductosEsc = new FrmProductosEsc(opcionCRUD, obtenerDatos());
            frmProductosEsc.setTitle("Eliminar producto");
            frmProductosEsc.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Seleccionar una fila", "Producto",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        // TODO add your handling code here:
        Producto producto = new Producto();
        producto.setNombre(jTxtNombre.getText());
        ArrayList<Producto> productos = ProductoDAL.buscar(producto);
        String[] columnas = {"ID PRoducto", "Nombre", "Descripcion", "Precio","CategoriaID", "Categoria"};
        Object[][] datos = new Object[productos.size()][6];
        for (int i = 0; i < productos.size(); i++) {
            Producto item = productos.get(i);
            datos[i][0] = item.getProductoId();
            datos[i][1] = item.getNombre();
            datos[i][2] = item.getDescripcion();
            datos[i][3] = item.getPrecio();
            datos[i][4] = item.getCategoriaId();
             datos[i][5] = item.getCategoria().getNombre();
        }
        DefaultTableModel modelTable = new DefaultTableModel(datos, columnas);
        jTableProductos.setModel(modelTable);

    }//GEN-LAST:event_jBtnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProductosLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductosLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductosLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductosLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductosLec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnIrACrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
