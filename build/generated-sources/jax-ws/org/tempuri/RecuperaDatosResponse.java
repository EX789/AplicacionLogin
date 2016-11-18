
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.backend.Persona;


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
 *         &lt;element name="RecuperaDatosResult" type="{http://schemas.datacontract.org/2004/07/Backend.Negocio}Persona" minOccurs="0"/>
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
    "recuperaDatosResult"
})
@XmlRootElement(name = "RecuperaDatosResponse")
public class RecuperaDatosResponse {

    @XmlElementRef(name = "RecuperaDatosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Persona> recuperaDatosResult;

    /**
     * Obtiene el valor de la propiedad recuperaDatosResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Persona }{@code >}
     *     
     */
    public JAXBElement<Persona> getRecuperaDatosResult() {
        return recuperaDatosResult;
    }

    /**
     * Define el valor de la propiedad recuperaDatosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Persona }{@code >}
     *     
     */
    public void setRecuperaDatosResult(JAXBElement<Persona> value) {
        this.recuperaDatosResult = value;
    }

}
