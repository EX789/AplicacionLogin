
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.backend.ArrayOfCentroMedico;


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
 *         &lt;element name="ListarCentroResult" type="{http://schemas.datacontract.org/2004/07/Backend.Negocio}ArrayOfCentroMedico" minOccurs="0"/>
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
    "listarCentroResult"
})
@XmlRootElement(name = "ListarCentroResponse")
public class ListarCentroResponse {

    @XmlElementRef(name = "ListarCentroResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCentroMedico> listarCentroResult;

    /**
     * Obtiene el valor de la propiedad listarCentroResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCentroMedico }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCentroMedico> getListarCentroResult() {
        return listarCentroResult;
    }

    /**
     * Define el valor de la propiedad listarCentroResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCentroMedico }{@code >}
     *     
     */
    public void setListarCentroResult(JAXBElement<ArrayOfCentroMedico> value) {
        this.listarCentroResult = value;
    }

}
