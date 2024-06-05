import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Producto {
    private int idProducto;
    private String nombre;
    private int codigo;
    private double cantidad;

    public Producto(int producto, String nombre, int codigo, double cantidad){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public int getIdProducto(){
        return idProducto;
    }

    public void setIdProducto(int idProducto){
        this.idProducto = idProducto;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public double getCantidad(){
        return cantidad;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public String toString(){
        return "producto [idCantidad=" + getIdProducto() + ", nombre=" + nombre + ", codigo=" + codigo + "cantidad" + getCantidad() + "]";
    }
}

