
package org.datacontract.schemas._2004._07.backend;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfPacienteNoPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPacienteNoPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PacienteNoPago" type="{http://schemas.datacontract.org/2004/07/Backend.Negocio}PacienteNoPago" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPacienteNoPago", propOrder = {
    "pacienteNoPago"
})
public class ArrayOfPacienteNoPago {

    @XmlElement(name = "PacienteNoPago", nillable = true)
    protected List<PacienteNoPago> pacienteNoPago;

    /**
     * Gets the value of the pacienteNoPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pacienteNoPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPacienteNoPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PacienteNoPago }
     * 
     * 
     */
    public List<PacienteNoPago> getPacienteNoPago() {
        if (pacienteNoPago == null) {
            pacienteNoPago = new ArrayList<PacienteNoPago>();
        }
        return this.pacienteNoPago;
    }

}
