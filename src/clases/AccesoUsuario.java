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
public class AccesoUsuario {

    /***
     * Valida el ingreso de sesion de un usuario, devuelve True si es valido
     * 
     * @param rut
     * @param pass
     * @return Boolean
     */
    
    public static Boolean validarPersona(java.lang.String rut, java.lang.String pass) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.validarPersona(rut, pass);
    }
    
}
