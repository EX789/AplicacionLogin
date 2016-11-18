
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.backend.ArrayOfAgendaMedico;


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
 *         &lt;element name="listarHoraxFechayMedicoResult" type="{http://schemas.datacontract.org/2004/07/Backend.Negocio}ArrayOfAgenda_medico" minOccurs="0"/>
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
    "listarHoraxFechayMedicoResult"
})
@XmlRootElement(name = "listarHoraxFechayMedicoResponse")
public class ListarHoraxFechayMedicoResponse {

    @XmlElementRef(name = "listarHoraxFechayMedicoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAgendaMedico> listarHoraxFechayMedicoResult;

    /**
     * Obtiene el valor de la propiedad listarHoraxFechayMedicoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAgendaMedico }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAgendaMedico> getListarHoraxFechayMedicoResult() {
        return listarHoraxFechayMedicoResult;
    }

    /**
     * Define el valor de la propiedad listarHoraxFechayMedicoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAgendaMedico }{@code >}
     *     
     */
    public void setListarHoraxFechayMedicoResult(JAXBElement<ArrayOfAgendaMedico> value) {
        this.listarHoraxFechayMedicoResult = value;
    }

}
