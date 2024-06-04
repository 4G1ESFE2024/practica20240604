/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practica20240604;

import javax.swing.JOptionPane;
import utilerias.OpcionesCRUD;

import accesoadatos.CategoriaDAL;
import accesoadatos.ProductoDAL;
import entidades.Categoria;
import entidades.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Mateo
 */
public class FrmProductosEsc extends javax.swing.JFrame {

    private OpcionesCRUD opcionCRUD;
    private Producto productActual = new Producto();
    private HashMap<Integer, Categoria> mapCategorias = new HashMap<Integer,Categoria>();

    /**
     * Creates new form FrmProductosEsc
     */
    public FrmProductosEsc(OpcionesCRUD opcion, Producto producto) {
        this.opcionCRUD = opcion;
        initComponents();
        ArrayList<Categoria> categorias = CategoriaDAL.obtenerTodos();
        DefaultComboBoxModel<Categoria> modelCombox = new DefaultComboBoxModel(categorias.toArray());
        for (Categoria cat : categorias) {
            mapCategorias.put(cat.getCategoriaId(), cat);
        }
        jComboCategorias.setModel(modelCombox);
        if (opcion != OpcionesCRUD.CREAR) {
            asingarDatos(producto);
            productActual = producto;
        }

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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtADescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTxtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboCategorias = new javax.swing.JComboBox<>();
        jBtnGuardar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setTitle("Mantenimiento productos");

        jLabel1.setText("Nombre");

        jLabel2.setText("Descripcion");

        jTxtADescripcion.setColumns(20);
        jTxtADescripcion.setRows(5);
        jScrollPane1.setViewportView(jTxtADescripcion);

        jLabel3.setText("Precio");

        jLabel4.setText("Categoria");

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardar)
                    .addComponent(jBtnCancelar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed
    private Producto obtenerDatos() {
        Producto producto = new Producto();
        producto.setNombre(jTxtNombre.getText());
        producto.setDescripcion(jTxtADescripcion.getText());
        producto.setPrecio(Double.parseDouble(jTxtPrecio.getText()));
        Categoria categoria = (Categoria) jComboCategorias.getSelectedItem();
        producto.setCategoriaId(categoria.getCategoriaId());
        producto.setProductoId(productActual.getProductoId());
        return producto;
    }

    private void asingarDatos(Producto producto) {
        jTxtNombre.setText(producto.getNombre());
        jTxtADescripcion.setText(producto.getDescripcion());
        jTxtPrecio.setText(Double.toString(producto.getPrecio()));
        // Categoria categoria = producto.getCategoria(); 
        Categoria categoria = mapCategorias.get(producto.getCategoriaId());
        jComboCategorias.setSelectedItem(categoria);
    }

    private void crearReg() {
        try {
            Producto producto = obtenerDatos();
            int result = ProductoDAL.crear(producto);
            if (result > 0) {
                JOptionPane.showMessageDialog(this,
                        "El producto fue registrado existosamente", "CREAR PRODUCTO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Sucedio un error al crear el producto", "ERROR PRODUCTO",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(), "ERROR PRODUCTO",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void modificarReg() {
        try {
            Producto producto = obtenerDatos();
            int result = ProductoDAL.modificar(producto);
            if (result > 0) {
                JOptionPane.showMessageDialog(this,
                        "El producto fue modificado existosamente", "MODIFICAR PRODUCTO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Sucedio un error al modificar el producto", "ERROR PRODUCTO",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(), "ERROR PRODUCTO",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void eliminarReg() {
        try {
            Producto producto = obtenerDatos();
            int result = ProductoDAL.eliminar(producto);
            if (result > 0) {
                JOptionPane.showMessageDialog(this,
                        "El producto fue eliminado existosamente", "ELIMINAR PRODUCTO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Sucedio un error al eliminar el producto", "ERROR PRODUCTO",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(), "ERROR PRODUCTO",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        if (null != opcionCRUD) // TODO add your handling code here:
            switch (opcionCRUD) {
                case CREAR:
                    crearReg();
                    this.setVisible(false);
                    break;
                case MODIFICAR:
                    modificarReg();
                    this.setVisible(false);
                    break;
                case ELIMINAR:
                    eliminarReg();
                    this.setVisible(false);
                    break;
                default:
                    break;
            }
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JComboBox<Categoria> jComboCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtADescripcion;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPrecio;
    // End of variables declaration//GEN-END:variables
}