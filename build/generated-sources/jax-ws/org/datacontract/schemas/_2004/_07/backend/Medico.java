
package org.datacontract.schemas._2004._07.backend;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Medico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Medico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Especialidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_medico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_centro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medico", propOrder = {
    "especialidad",
    "idMedico",
    "nombre",
    "rut",
    "idCentro"
})
public class Medico {

    @XmlElementRef(name = "Especialidad", namespace = "http://schemas.datacontract.org/2004/07/Backend.Negocio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> especialidad;
    @XmlElement(name = "Id_medico")
    protected Integer idMedico;
    @XmlElementRef(name = "Nombre", namespace = "http://schemas.datacontract.org/2004/07/Backend.Negocio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "Rut", namespace = "http://schemas.datacontract.org/2004/07/Backend.Negocio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rut;
    @XmlElement(name = "id_centro")
    protected Integer idCentro;

    /**
     * Obtiene el valor de la propiedad especialidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEspecialidad() {
        return especialidad;
    }

    /**
     * Define el valor de la propiedad especialidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEspecialidad(JAXBElement<String> value) {
        this.especialidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idMedico.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMedico() {
        return idMedico;
    }

    /**
     * Define el valor de la propiedad idMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMedico(Integer value) {
        this.idMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad rut.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRut() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRut(JAXBElement<String> value) {
        this.rut = value;
    }

    /**
     * Obtiene el valor de la propiedad idCentro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCentro() {
        return idCentro;
    }

    /**
     * Define el valor de la propiedad idCentro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCentro(Integer value) {
        this.idCentro = value;
    }

}
