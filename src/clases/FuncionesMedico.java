/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;



import javax.swing.DefaultComboBoxModel;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.backend.ArrayOfAgendaMedico;
import org.datacontract.schemas._2004._07.backend.ArrayOfMedico;
import org.datacontract.schemas._2004._07.backend.ArrayOfPaciente;

/**
 *
 * @author raide
 */
public class FuncionesMedico {

    private static XMLGregorianCalendar fecha;

    /***
     * Retorna una lista de medicos desde el WebService
     * @return ArrayOfMedico 
     */
    
    
    //La usa FechaCalendarioBase.java y el metodo cargarComboBox de esta clase
    public static ArrayOfMedico listarMedico() {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.listarMedico();
    }

    /***
     * Elimina una hora seleccionada a travez de un id de la Tabla de la base de datos "Agenda medico",
     * de vuelve true si se concreto la accion
     * @param id
     * @return Boolean
     */
    //La usa VentanaEliminarHora.java
    public static Boolean eliminarHora(java.lang.Integer id) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.eliminarHora(id);
    }

    /***
     * 
     * Crea una hora en la agenda del medico, devuelve true si se valido la accion
     * 
     * @param fecha
     * @param rut
     * @param horas
     * @param minutos
     * @param descp
     * @return Boolean
     */
    //Ventanaagregarnuevahora.JAVA
    public static Boolean creaHora(javax.xml.datatype.XMLGregorianCalendar fecha, java.lang.String rut, java.lang.Integer horas, java.lang.Integer minutos, java.lang.String descp) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.creaHora(fecha, rut, horas, minutos, descp);
    }
    
    /***
     * Retorna el id del medico seleccionado
     * @param rut
     * @return Integer
     */
    //CargaAgendaMedico
    public static Integer retornarIdMedico(java.lang.String rut) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.recuperarIdMedico(rut);
    }

    /***
     * Obtiene el listado generadado desde la ventana y lo lleva al WebService para crear las horas medicas
     * seleccionadas, devuelve true si se concreto la accion
     * @param lista
     * @return Boolean
     */
    
    //CargaAgendaMedico.java
    public static Boolean recibeListado(org.datacontract.schemas._2004._07.backend.ArrayOfAgendaMedico lista) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.recibeListado(lista);
    }
    
    /***
     * Marca por parte del medico, los pacientes en estado "Espera" de la tabla de la base de datos,
     * en "Atendido", devuelve TRUE si se concreto la accion.
     * @param idPago
     * @return Boolean 
     */
    
    //VentanaMarcarPacienteAtendido.java
    public static Boolean pacienteAtendido(java.lang.Integer idPago) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.pacienteAtendido(idPago);
    }
    
    /***
     * Devuelve una lista de los pacientes que tienen una hora con el medico seleccionado
     * @param rut
     * @param id
     * @return ArrayOfPaciente
     */
    
    //Funciones paciente
    public static ArrayOfPaciente listarPacientePorMedico(java.lang.String rut, java.lang.Integer id) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.listadePacientePorMedico(rut, id);
    }
    
    /***
     * Retorna un Modelo para el Combobox que tiene incluido los datos de los medicos
     * @return DefaultComboBoxModel 
     */
    
    //CargaAgendaMedico.Java y VentanaPacientesEnEspera.Java
    public static DefaultComboBoxModel cargarComboBox() {
        DefaultComboBoxModel nuevoModelo = new DefaultComboBoxModel();
        ArrayOfMedico medico = listarMedico();
        for (org.datacontract.schemas._2004._07.backend.Medico med : medico.getMedico()) {
            nuevoModelo.addElement(new Medico(med.getNombre().getValue(), med.getRut().getValue(), med.getEspecialidad().getValue()));
        }
        return nuevoModelo;
    }

    /***
     * Retorna el listado de horas disponibles desde un WebService, por un medico y dia seleccionado
     * @param rut
     * @param fecha
     * @return ArrayOfAgendaMedico
     */
    //VentanaEliminarHora.Java
    public static ArrayOfAgendaMedico listadoDeHoras_1(java.lang.String rut, javax.xml.datatype.XMLGregorianCalendar fecha) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.listadoDeHoras(rut, fecha);
    }

    public static ArrayOfAgendaMedico listarHoraxFechayMedico(javax.xml.datatype.XMLGregorianCalendar fecha, java.lang.Integer idMedico) {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.listarHoraxFechayMedico(fecha, idMedico);
    }
    
    
}
