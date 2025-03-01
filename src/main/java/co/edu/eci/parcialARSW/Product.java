package co.edu.eci.parcialARSW;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.IdGenerator;

public class Product {

    private int id;
    private String nombre;
    private double precio;


    public Product(){

    }

    public Product(int id,String nombre, double precio){
        this.id = id;
        this.nombre= nombre;
        this.precio = precio;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }
    public  double getPrecio(){
        return precio;
    }

    public void setId(int id){
        this.id =id;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }

}
