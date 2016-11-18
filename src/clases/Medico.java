/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author raide
 */
public class Medico {

    private String nombre; //Nombre del medico
    private String rut;//Rut del medico
    private String especialidad; //Tipo de especialidad u trabajo que desempeña

    public Medico() {
    }

    public Medico(String nombre, String rut, String especialidad) {
        this.nombre = nombre;
        this.rut = rut;
        this.especialidad = especialidad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    //Metodo que usara los ComboBox, para visualizar el nombre del especialista
    @Override
    public String toString() {
        return nombre;
    }
}
