/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.table.DefaultTableModel;
import org.datacontract.schemas._2004._07.backend.ArrayOfPacienteNoPago;

/**
 *
 * @author raide
 */
public class FuncionesPaciente {
    
    /***
     * Retorna un modelo para la tabla, que incluye los datos retorandos del metodo listarPacientePorMedico
     * @param rut
     * @param id
     * @param modelo
     * @return DefaultTableModel
     */
    
    //VnetanaPacienteEspera -- VentanaPacientesEnEspera
    public static DefaultTableModel cargarTabla(String rut, int id, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (org.datacontract.schemas._2004._07.backend.Paciente dato : clases.FuncionesMedico.listarPacientePorMedico(rut, id).getPaciente()) {
            Object[] elementos = {dato.getNombre().getValue(), clases.FuncionesGenerales.darFormatoHora(dato.getHoras()), clases.FuncionesGenerales.darFormatoHora(dato.getMinutos()), dato.getDescripcion().getValue(), dato.getRut().getValue(), dato.getIdPago()};
            modelo.addRow(elementos);
        }
        return modelo;
    }
    
    /***
     * Devuelve la lista de pacientes que solo han reservado y no han pagado su hora
     * @return ArrayOfPacienteNoPago
     */
    
        public static ArrayOfPacienteNoPago listadoPacienteNoPago() {
        org.tempuri.BackendSVC service = new org.tempuri.BackendSVC();
        org.tempuri.IbackendSVC port = service.getBasicHttpBindingIbackendSVC();
        return port.listadoPacienteNoPago();
    }
}
