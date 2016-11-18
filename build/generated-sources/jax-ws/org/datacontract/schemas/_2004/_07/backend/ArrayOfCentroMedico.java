
package org.datacontract.schemas._2004._07.backend;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCentroMedico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCentroMedico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CentroMedico" type="{http://schemas.datacontract.org/2004/07/Backend.Negocio}CentroMedico" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCentroMedico", propOrder = {
    "centroMedico"
})
public class ArrayOfCentroMedico {

    @XmlElement(name = "CentroMedico", nillable = true)
    protected List<CentroMedico> centroMedico;

    /**
     * Gets the value of the centroMedico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centroMedico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCentroMedico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CentroMedico }
     * 
     * 
     */
    public List<CentroMedico> getCentroMedico() {
        if (centroMedico == null) {
            centroMedico = new ArrayList<CentroMedico>();
        }
        return this.centroMedico;
    }

}
