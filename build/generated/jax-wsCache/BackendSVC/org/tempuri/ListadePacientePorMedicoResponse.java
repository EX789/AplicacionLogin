
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.backend.ArrayOfPaciente;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListadePacientePorMedicoResult" type="{http://schemas.datacontract.org/2004/07/Backend.Negocio}ArrayOfPaciente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listadePacientePorMedicoResult"
})
@XmlRootElement(name = "ListadePacientePorMedicoResponse")
public class ListadePacientePorMedicoResponse {

    @XmlElementRef(name = "ListadePacientePorMedicoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPaciente> listadePacientePorMedicoResult;

    /**
     * Obtiene el valor de la propiedad listadePacientePorMedicoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaciente }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPaciente> getListadePacientePorMedicoResult() {
        return listadePacientePorMedicoResult;
    }

    /**
     * Define el valor de la propiedad listadePacientePorMedicoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaciente }{@code >}
     *     
     */
    public void setListadePacientePorMedicoResult(JAXBElement<ArrayOfPaciente> value) {
        this.listadePacientePorMedicoResult = value;
    }

}
