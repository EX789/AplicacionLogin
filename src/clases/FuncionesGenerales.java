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
public class FuncionesGenerales {
    
    private static String rut;//Objeto que guarda el estado del rut de la persona logueada
    private static Integer id;//Objeto que guarda la id del perfil de la persona logueada
    
    /***
     * Obtiene el rut de la persona
     * @return String 
     */
    
    public static String getRut() {
        return rut;
    }

    public static void setRut(String rut) {
        FuncionesGenerales.rut = rut;
    }

    /***
     * Obtiene el id de la persona
     * @return int 
     */
    
    public static int getId() {
        return id;
    }

    public static void setId(Integer id) {
        FuncionesGenerales.id = id;
    }
    
    
    /***
     * Daun nuevo formato a los campos hora y minutos devuletos desde el Web Service, les agrega
     * un cero a la izquierda si el valor ingresado como parametro de entrada es mayor o igual que cero
     * y menor o igual que nueve.
     * @param elemento
     * @return String
     */
    public static String darFormatoHora(Integer elemento){
        if (elemento >=0 && elemento<=9) {
            String nuevoFormato = "0"+elemento;
            return nuevoFormato;
        } else{
            return elemento.toString();
        }
    }
}
