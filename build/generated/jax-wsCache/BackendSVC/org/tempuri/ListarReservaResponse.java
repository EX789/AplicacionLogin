
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.backend.ArrayOfReserva;


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
 *         &lt;element name="listarReservaResult" type="{http://schemas.datacontract.org/2004/07/Backend.Negocio}ArrayOfReserva" minOccurs="0"/>
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
    "listarReservaResult"
})
@XmlRootElement(name = "listarReservaResponse")
public class ListarReservaResponse {

    @XmlElementRef(name = "listarReservaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReserva> listarReservaResult;

    /**
     * Obtiene el valor de la propiedad listarReservaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReserva }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReserva> getListarReservaResult() {
        return listarReservaResult;
    }

    /**
     * Define el valor de la propiedad listarReservaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReserva }{@code >}
     *     
     */
    public void setListarReservaResult(JAXBElement<ArrayOfReserva> value) {
        this.listarReservaResult = value;
    }

}
