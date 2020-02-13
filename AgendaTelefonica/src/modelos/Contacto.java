/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author damar
 */
public class Contacto {
    private String telefono; 
    private String nombre; 
    private String direccion;
    private double adeudo;

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the adeudo
     */
    public double getAdeudo() {
       if (Permiso.isPermiso()){
           return adeudo;
       }else{
           return 0;
       }
    }

    /**
     * @param adeudo the adeudo to set
     */
    public void setAdeudo(double adeudo) {
        if (adeudo>=0){
        this.adeudo = adeudo;
        }else{
            this.adeudo = 0;
        }
    }
}
