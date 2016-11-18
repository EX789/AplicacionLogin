/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import org.datacontract.schemas._2004._07.backend.ArrayOfPacienteNoPago;
import org.datacontract.schemas._2004._07.backend.ArrayOfReserva;

/**
 *
 * @author raide
 */
public class FuncionesCajero {
    //Objeto que tiene la funcion de guardar la lista de reservas
    //sin tener que rehacer la peticion al web service
    
    private static ArrayOfReserva listaReserva;
    
    /***
     * Devuelve una lista de reservas de los pacientes
     * @return ArrayOfReserva 
     */
    //La usa VentanaTablaReservaPorPaciente.java
    public static ArrayOfReserva getListaReserva() {
        return listaReserva;
    }
    
    /***
     * Guarda la lista en el objeto previamente creado.
     * @param listaReserva 
     */
    
    //la usa BuscarClientePago.java
    public static void setListaReserva(ArrayOfReserva listaReserva) {
        FuncionesCajero.listaReserva = listaReserva;
    }
    
    /***
     * Ingresa los valores pedidos para ser enviados al WebService y concretar el pago, devuelve True
     * si es valido.
     * 
     * @param monto
     * @param formaPago
     * @param rut
     * @param agenda
     * @param prevision
     * @param porcPrev
     * @param idMedico
     * @return Boolean
     */
    
    //La usa VentanaPago.java
    public static Boolean crearPago(java.lang.Integer monto, java.lang.String formaPago, java.lang.String rut, java.lang.Integer agenda, java.lang.String prevision, java.lang.Integer porcPrev, java.lang.Integer idMedico) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.crearPago(monto, formaPago, rut, agenda, prevision, porcPrev, idMedico);
    }
    
    /***
     * Devuelve la lista de reservas de algun paciente en especifico.
     * @param rut
     * @return ArrayOfReserva 
     */
    
    //BuscarClientePago
    public static ArrayOfReserva listarReserva(java.lang.String rut) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.listarReserva(rut);
    }
    
    /***
     * Verifica si el cliente tiene o no pagos pendientes, devuelve true si es valido.
     * @param rut
     * @return Boolean 
     */
    
    //BuscarClientePago
    public static Boolean verificarListaReserva(java.lang.String rut) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.verificarListaReserva(rut);
    }


    
}
