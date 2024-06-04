/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Mateo
 */
public class Producto {
    private int productoId;
    private String nombre;
    private String descripcion;
    private double precio;
    private int categoriaId;
    
    private Categoria categoria;

    public Producto() {
    }

    public Producto(int productoId, String nombre, String descripcion, double precio, int categoriaId, Categoria categoria) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoriaId = categoriaId;
        this.categoria = categoria;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
