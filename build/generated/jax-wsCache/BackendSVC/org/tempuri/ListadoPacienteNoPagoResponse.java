
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.backend.ArrayOfPacienteNoPago;


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
 *         &lt;element name="ListadoPacienteNoPagoResult" type="{http://schemas.datacontract.org/2004/07/Backend.Negocio}ArrayOfPacienteNoPago" minOccurs="0"/>
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
    "listadoPacienteNoPagoResult"
})
@XmlRootElement(name = "ListadoPacienteNoPagoResponse")
public class ListadoPacienteNoPagoResponse {

    @XmlElementRef(name = "ListadoPacienteNoPagoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPacienteNoPago> listadoPacienteNoPagoResult;

    /**
     * Obtiene el valor de la propiedad listadoPacienteNoPagoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPacienteNoPago }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPacienteNoPago> getListadoPacienteNoPagoResult() {
        return listadoPacienteNoPagoResult;
    }

    /**
     * Define el valor de la propiedad listadoPacienteNoPagoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPacienteNoPago }{@code >}
     *     
     */
    public void setListadoPacienteNoPagoResult(JAXBElement<ArrayOfPacienteNoPago> value) {
        this.listadoPacienteNoPagoResult = value;
    }

}
