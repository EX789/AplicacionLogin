
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="EliminarHoraPacienteResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "eliminarHoraPacienteResult"
})
@XmlRootElement(name = "EliminarHoraPacienteResponse")
public class EliminarHoraPacienteResponse {

    @XmlElement(name = "EliminarHoraPacienteResult")
    protected Boolean eliminarHoraPacienteResult;

    /**
     * Obtiene el valor de la propiedad eliminarHoraPacienteResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEliminarHoraPacienteResult() {
        return eliminarHoraPacienteResult;
    }

    /**
     * Define el valor de la propiedad eliminarHoraPacienteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEliminarHoraPacienteResult(Boolean value) {
        this.eliminarHoraPacienteResult = value;
    }

}
