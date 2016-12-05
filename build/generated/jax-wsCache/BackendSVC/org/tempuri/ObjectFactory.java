
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.backend.ArrayOfAgendaMedico;
import org.datacontract.schemas._2004._07.backend.ArrayOfCentroMedico;
import org.datacontract.schemas._2004._07.backend.ArrayOfMedico;
import org.datacontract.schemas._2004._07.backend.ArrayOfPaciente;
import org.datacontract.schemas._2004._07.backend.ArrayOfPacienteNoPago;
import org.datacontract.schemas._2004._07.backend.ArrayOfPagoComision;
import org.datacontract.schemas._2004._07.backend.ArrayOfRecaudacion;
import org.datacontract.schemas._2004._07.backend.ArrayOfReserva;
import org.datacontract.schemas._2004._07.backend.Persona;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarCentroResponseListarCentroResult_QNAME = new QName("http://tempuri.org/", "ListarCentroResult");
    private final static QName _ValidarPersonaRut_QNAME = new QName("http://tempuri.org/", "rut");
    private final static QName _ValidarPersonaPass_QNAME = new QName("http://tempuri.org/", "pass");
    private final static QName _EnviarCorreoCorreo_QNAME = new QName("http://tempuri.org/", "correo");
    private final static QName _CrearPersonaApP_QNAME = new QName("http://tempuri.org/", "apP");
    private final static QName _CrearPersonaDirec_QNAME = new QName("http://tempuri.org/", "direc");
    private final static QName _CrearPersonaComuna_QNAME = new QName("http://tempuri.org/", "comuna");
    private final static QName _CrearPersonaApM_QNAME = new QName("http://tempuri.org/", "apM");
    private final static QName _CrearPersonaNombre_QNAME = new QName("http://tempuri.org/", "nombre");
    private final static QName _ListadoPacienteNoPagoResponseListadoPacienteNoPagoResult_QNAME = new QName("http://tempuri.org/", "ListadoPacienteNoPagoResult");
    private final static QName _ListadoRecaaudacionXFechasResponseListadoRecaaudacionXFechasResult_QNAME = new QName("http://tempuri.org/", "listadoRecaaudacionXFechasResult");
    private final static QName _DistintoResponseDistintoResult_QNAME = new QName("http://tempuri.org/", "distintoResult");
    private final static QName _ListadoDeHorasResponseListadoDeHorasResult_QNAME = new QName("http://tempuri.org/", "ListadoDeHorasResult");
    private final static QName _ListarMedicoResponseListarMedicoResult_QNAME = new QName("http://tempuri.org/", "ListarMedicoResult");
    private final static QName _ListarMedicoxCentroyEspIdCentro_QNAME = new QName("http://tempuri.org/", "id_centro");
    private final static QName _ListarMedicoxCentroyEspEspecialidad_QNAME = new QName("http://tempuri.org/", "especialidad");
    private final static QName _ListarMedicoxCentroyEspResponseListarMedicoxCentroyEspResult_QNAME = new QName("http://tempuri.org/", "listarMedicoxCentroyEspResult");
    private final static QName _RealizarPagoComisionComp_QNAME = new QName("http://tempuri.org/", "comp");
    private final static QName _ListadoRecaaudacionXFechasyMedicoResponseListadoRecaaudacionXFechasyMedicoResult_QNAME = new QName("http://tempuri.org/", "listadoRecaaudacionXFechasyMedicoResult");
    private final static QName _CrearPagoFormaPago_QNAME = new QName("http://tempuri.org/", "forma_pago");
    private final static QName _CrearPagoPrevision_QNAME = new QName("http://tempuri.org/", "prevision");
    private final static QName _ListadoPagoComisionesResponseListadoPagoComisionesResult_QNAME = new QName("http://tempuri.org/", "listadoPagoComisionesResult");
    private final static QName _CreaHoraDescp_QNAME = new QName("http://tempuri.org/", "descp");
    private final static QName _ListadePacientePorMedicoResponseListadePacientePorMedicoResult_QNAME = new QName("http://tempuri.org/", "ListadePacientePorMedicoResult");
    private final static QName _ListarReservaResponseListarReservaResult_QNAME = new QName("http://tempuri.org/", "listarReservaResult");
    private final static QName _RecuperaNombreResponseRecuperaNombreResult_QNAME = new QName("http://tempuri.org/", "RecuperaNombreResult");
    private final static QName _ListarHoraxFechayMedicoResponseListarHoraxFechayMedicoResult_QNAME = new QName("http://tempuri.org/", "listarHoraxFechayMedicoResult");
    private final static QName _RutMedicoResponseRutMedicoResult_QNAME = new QName("http://tempuri.org/", "RutMedicoResult");
    private final static QName _RecuperaDatosResponseRecuperaDatosResult_QNAME = new QName("http://tempuri.org/", "RecuperaDatosResult");
    private final static QName _RecuperaPerfilResponseRecuperaPerfilResult_QNAME = new QName("http://tempuri.org/", "RecuperaPerfilResult");
    private final static QName _RecibeListadoLista_QNAME = new QName("http://tempuri.org/", "Lista");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarHora }
     * 
     */
    public EliminarHora createEliminarHora() {
        return new EliminarHora();
    }

    /**
     * Create an instance of {@link ListarReservaResponse }
     * 
     */
    public ListarReservaResponse createListarReservaResponse() {
        return new ListarReservaResponse();
    }

    /**
     * Create an instance of {@link VerificarListaReservaResponse }
     * 
     */
    public VerificarListaReservaResponse createVerificarListaReservaResponse() {
        return new VerificarListaReservaResponse();
    }

    /**
     * Create an instance of {@link ReservarHora }
     * 
     */
    public ReservarHora createReservarHora() {
        return new ReservarHora();
    }

    /**
     * Create an instance of {@link EliminarHoraPaciente }
     * 
     */
    public EliminarHoraPaciente createEliminarHoraPaciente() {
        return new EliminarHoraPaciente();
    }

    /**
     * Create an instance of {@link ListarMedicoxCentroyEspResponse }
     * 
     */
    public ListarMedicoxCentroyEspResponse createListarMedicoxCentroyEspResponse() {
        return new ListarMedicoxCentroyEspResponse();
    }

    /**
     * Create an instance of {@link ValidarPersonaResponse }
     * 
     */
    public ValidarPersonaResponse createValidarPersonaResponse() {
        return new ValidarPersonaResponse();
    }

    /**
     * Create an instance of {@link RecibeListado }
     * 
     */
    public RecibeListado createRecibeListado() {
        return new RecibeListado();
    }

    /**
     * Create an instance of {@link RecuperarIdMedico }
     * 
     */
    public RecuperarIdMedico createRecuperarIdMedico() {
        return new RecuperarIdMedico();
    }

    /**
     * Create an instance of {@link CrearPersona }
     * 
     */
    public CrearPersona createCrearPersona() {
        return new CrearPersona();
    }

    /**
     * Create an instance of {@link RecuperaNombre }
     * 
     */
    public RecuperaNombre createRecuperaNombre() {
        return new RecuperaNombre();
    }

    /**
     * Create an instance of {@link RecuperarIdMedicoResponse }
     * 
     */
    public RecuperarIdMedicoResponse createRecuperarIdMedicoResponse() {
        return new RecuperarIdMedicoResponse();
    }

    /**
     * Create an instance of {@link ListadoRecaaudacionXFechas }
     * 
     */
    public ListadoRecaaudacionXFechas createListadoRecaaudacionXFechas() {
        return new ListadoRecaaudacionXFechas();
    }

    /**
     * Create an instance of {@link ListarHoraxFechayMedico }
     * 
     */
    public ListarHoraxFechayMedico createListarHoraxFechayMedico() {
        return new ListarHoraxFechayMedico();
    }

    /**
     * Create an instance of {@link RecuperaNombreResponse }
     * 
     */
    public RecuperaNombreResponse createRecuperaNombreResponse() {
        return new RecuperaNombreResponse();
    }

    /**
     * Create an instance of {@link ListadoPagoComisiones }
     * 
     */
    public ListadoPagoComisiones createListadoPagoComisiones() {
        return new ListadoPagoComisiones();
    }

    /**
     * Create an instance of {@link ListarCentroResponse }
     * 
     */
    public ListarCentroResponse createListarCentroResponse() {
        return new ListarCentroResponse();
    }

    /**
     * Create an instance of {@link RealizarPagoComision }
     * 
     */
    public RealizarPagoComision createRealizarPagoComision() {
        return new RealizarPagoComision();
    }

    /**
     * Create an instance of {@link RecuperaDatos }
     * 
     */
    public RecuperaDatos createRecuperaDatos() {
        return new RecuperaDatos();
    }

    /**
     * Create an instance of {@link ListarMedico }
     * 
     */
    public ListarMedico createListarMedico() {
        return new ListarMedico();
    }

    /**
     * Create an instance of {@link ListarReserva }
     * 
     */
    public ListarReserva createListarReserva() {
        return new ListarReserva();
    }

    /**
     * Create an instance of {@link EnviarCorreoResponse }
     * 
     */
    public EnviarCorreoResponse createEnviarCorreoResponse() {
        return new EnviarCorreoResponse();
    }

    /**
     * Create an instance of {@link RecibeListadoResponse }
     * 
     */
    public RecibeListadoResponse createRecibeListadoResponse() {
        return new RecibeListadoResponse();
    }

    /**
     * Create an instance of {@link RecuperaPerfilResponse }
     * 
     */
    public RecuperaPerfilResponse createRecuperaPerfilResponse() {
        return new RecuperaPerfilResponse();
    }

    /**
     * Create an instance of {@link CrearPersonaResponse }
     * 
     */
    public CrearPersonaResponse createCrearPersonaResponse() {
        return new CrearPersonaResponse();
    }

    /**
     * Create an instance of {@link ListadoPagoComisionesResponse }
     * 
     */
    public ListadoPagoComisionesResponse createListadoPagoComisionesResponse() {
        return new ListadoPagoComisionesResponse();
    }

    /**
     * Create an instance of {@link PacienteAtendidoResponse }
     * 
     */
    public PacienteAtendidoResponse createPacienteAtendidoResponse() {
        return new PacienteAtendidoResponse();
    }

    /**
     * Create an instance of {@link Distinto }
     * 
     */
    public Distinto createDistinto() {
        return new Distinto();
    }

    /**
     * Create an instance of {@link CrearReservaResponse }
     * 
     */
    public CrearReservaResponse createCrearReservaResponse() {
        return new CrearReservaResponse();
    }

    /**
     * Create an instance of {@link ReservarHoraResponse }
     * 
     */
    public ReservarHoraResponse createReservarHoraResponse() {
        return new ReservarHoraResponse();
    }

    /**
     * Create an instance of {@link CreaHoraResponse }
     * 
     */
    public CreaHoraResponse createCreaHoraResponse() {
        return new CreaHoraResponse();
    }

    /**
     * Create an instance of {@link EliminarHoraResponse }
     * 
     */
    public EliminarHoraResponse createEliminarHoraResponse() {
        return new EliminarHoraResponse();
    }

    /**
     * Create an instance of {@link CreaHora }
     * 
     */
    public CreaHora createCreaHora() {
        return new CreaHora();
    }

    /**
     * Create an instance of {@link RutMedicoResponse }
     * 
     */
    public RutMedicoResponse createRutMedicoResponse() {
        return new RutMedicoResponse();
    }

    /**
     * Create an instance of {@link EnviarCorreo }
     * 
     */
    public EnviarCorreo createEnviarCorreo() {
        return new EnviarCorreo();
    }

    /**
     * Create an instance of {@link ListadoRecaaudacionXFechasyMedicoResponse }
     * 
     */
    public ListadoRecaaudacionXFechasyMedicoResponse createListadoRecaaudacionXFechasyMedicoResponse() {
        return new ListadoRecaaudacionXFechasyMedicoResponse();
    }

    /**
     * Create an instance of {@link DistintoResponse }
     * 
     */
    public DistintoResponse createDistintoResponse() {
        return new DistintoResponse();
    }

    /**
     * Create an instance of {@link EliminarReservaResponse }
     * 
     */
    public EliminarReservaResponse createEliminarReservaResponse() {
        return new EliminarReservaResponse();
    }

    /**
     * Create an instance of {@link RealizarPagoComisionResponse }
     * 
     */
    public RealizarPagoComisionResponse createRealizarPagoComisionResponse() {
        return new RealizarPagoComisionResponse();
    }

    /**
     * Create an instance of {@link ListarHoraxFechayMedicoResponse }
     * 
     */
    public ListarHoraxFechayMedicoResponse createListarHoraxFechayMedicoResponse() {
        return new ListarHoraxFechayMedicoResponse();
    }

    /**
     * Create an instance of {@link ValidarPersona }
     * 
     */
    public ValidarPersona createValidarPersona() {
        return new ValidarPersona();
    }

    /**
     * Create an instance of {@link ListarCentro }
     * 
     */
    public ListarCentro createListarCentro() {
        return new ListarCentro();
    }

    /**
     * Create an instance of {@link ListadoRecaaudacionXFechasResponse }
     * 
     */
    public ListadoRecaaudacionXFechasResponse createListadoRecaaudacionXFechasResponse() {
        return new ListadoRecaaudacionXFechasResponse();
    }

    /**
     * Create an instance of {@link ListadoDeHoras }
     * 
     */
    public ListadoDeHoras createListadoDeHoras() {
        return new ListadoDeHoras();
    }

    /**
     * Create an instance of {@link RutMedico }
     * 
     */
    public RutMedico createRutMedico() {
        return new RutMedico();
    }

    /**
     * Create an instance of {@link CrearPagoResponse }
     * 
     */
    public CrearPagoResponse createCrearPagoResponse() {
        return new CrearPagoResponse();
    }

    /**
     * Create an instance of {@link ListadoDeHorasResponse }
     * 
     */
    public ListadoDeHorasResponse createListadoDeHorasResponse() {
        return new ListadoDeHorasResponse();
    }

    /**
     * Create an instance of {@link CrearPago }
     * 
     */
    public CrearPago createCrearPago() {
        return new CrearPago();
    }

    /**
     * Create an instance of {@link RecuperaDatosResponse }
     * 
     */
    public RecuperaDatosResponse createRecuperaDatosResponse() {
        return new RecuperaDatosResponse();
    }

    /**
     * Create an instance of {@link ListadePacientePorMedico }
     * 
     */
    public ListadePacientePorMedico createListadePacientePorMedico() {
        return new ListadePacientePorMedico();
    }

    /**
     * Create an instance of {@link ListarMedicoResponse }
     * 
     */
    public ListarMedicoResponse createListarMedicoResponse() {
        return new ListarMedicoResponse();
    }

    /**
     * Create an instance of {@link ListadoPacienteNoPago }
     * 
     */
    public ListadoPacienteNoPago createListadoPacienteNoPago() {
        return new ListadoPacienteNoPago();
    }

    /**
     * Create an instance of {@link EliminarHoraPacienteResponse }
     * 
     */
    public EliminarHoraPacienteResponse createEliminarHoraPacienteResponse() {
        return new EliminarHoraPacienteResponse();
    }

    /**
     * Create an instance of {@link VerificarListaReserva }
     * 
     */
    public VerificarListaReserva createVerificarListaReserva() {
        return new VerificarListaReserva();
    }

    /**
     * Create an instance of {@link PacienteAtendido }
     * 
     */
    public PacienteAtendido createPacienteAtendido() {
        return new PacienteAtendido();
    }

    /**
     * Create an instance of {@link CrearReserva }
     * 
     */
    public CrearReserva createCrearReserva() {
        return new CrearReserva();
    }

    /**
     * Create an instance of {@link RecuperaPerfil }
     * 
     */
    public RecuperaPerfil createRecuperaPerfil() {
        return new RecuperaPerfil();
    }

    /**
     * Create an instance of {@link ListarMedicoxCentroyEsp }
     * 
     */
    public ListarMedicoxCentroyEsp createListarMedicoxCentroyEsp() {
        return new ListarMedicoxCentroyEsp();
    }

    /**
     * Create an instance of {@link EliminarReserva }
     * 
     */
    public EliminarReserva createEliminarReserva() {
        return new EliminarReserva();
    }

    /**
     * Create an instance of {@link ListadoRecaaudacionXFechasyMedico }
     * 
     */
    public ListadoRecaaudacionXFechasyMedico createListadoRecaaudacionXFechasyMedico() {
        return new ListadoRecaaudacionXFechasyMedico();
    }

    /**
     * Create an instance of {@link ListadePacientePorMedicoResponse }
     * 
     */
    public ListadePacientePorMedicoResponse createListadePacientePorMedicoResponse() {
        return new ListadePacientePorMedicoResponse();
    }

    /**
     * Create an instance of {@link ListadoPacienteNoPagoResponse }
     * 
     */
    public ListadoPacienteNoPagoResponse createListadoPacienteNoPagoResponse() {
        return new ListadoPacienteNoPagoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCentroMedico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListarCentroResult", scope = ListarCentroResponse.class)
    public JAXBElement<ArrayOfCentroMedico> createListarCentroResponseListarCentroResult(ArrayOfCentroMedico value) {
        return new JAXBElement<ArrayOfCentroMedico>(_ListarCentroResponseListarCentroResult_QNAME, ArrayOfCentroMedico.class, ListarCentroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = ValidarPersona.class)
    public JAXBElement<String> createValidarPersonaRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, ValidarPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = ValidarPersona.class)
    public JAXBElement<String> createValidarPersonaPass(String value) {
        return new JAXBElement<String>(_ValidarPersonaPass_QNAME, String.class, ValidarPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correo", scope = EnviarCorreo.class)
    public JAXBElement<String> createEnviarCorreoCorreo(String value) {
        return new JAXBElement<String>(_EnviarCorreoCorreo_QNAME, String.class, EnviarCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = CrearPersona.class)
    public JAXBElement<String> createCrearPersonaRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, CrearPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apP", scope = CrearPersona.class)
    public JAXBElement<String> createCrearPersonaApP(String value) {
        return new JAXBElement<String>(_CrearPersonaApP_QNAME, String.class, CrearPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correo", scope = CrearPersona.class)
    public JAXBElement<String> createCrearPersonaCorreo(String value) {
        return new JAXBElement<String>(_EnviarCorreoCorreo_QNAME, String.class, CrearPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = CrearPersona.class)
    public JAXBElement<String> createCrearPersonaPass(String value) {
        return new JAXBElement<String>(_ValidarPersonaPass_QNAME, String.class, CrearPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "direc", scope = CrearPersona.class)
    public JAXBElement<String> createCrearPersonaDirec(String value) {
        return new JAXBElement<String>(_CrearPersonaDirec_QNAME, String.class, CrearPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "comuna", scope = CrearPersona.class)
    public JAXBElement<String> createCrearPersonaComuna(String value) {
        return new JAXBElement<String>(_CrearPersonaComuna_QNAME, String.class, CrearPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apM", scope = CrearPersona.class)
    public JAXBElement<String> createCrearPersonaApM(String value) {
        return new JAXBElement<String>(_CrearPersonaApM_QNAME, String.class, CrearPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = CrearPersona.class)
    public JAXBElement<String> createCrearPersonaNombre(String value) {
        return new JAXBElement<String>(_CrearPersonaNombre_QNAME, String.class, CrearPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = RecuperaPerfil.class)
    public JAXBElement<String> createRecuperaPerfilRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, RecuperaPerfil.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPacienteNoPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListadoPacienteNoPagoResult", scope = ListadoPacienteNoPagoResponse.class)
    public JAXBElement<ArrayOfPacienteNoPago> createListadoPacienteNoPagoResponseListadoPacienteNoPagoResult(ArrayOfPacienteNoPago value) {
        return new JAXBElement<ArrayOfPacienteNoPago>(_ListadoPacienteNoPagoResponseListadoPacienteNoPagoResult_QNAME, ArrayOfPacienteNoPago.class, ListadoPacienteNoPagoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecaudacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listadoRecaaudacionXFechasResult", scope = ListadoRecaaudacionXFechasResponse.class)
    public JAXBElement<ArrayOfRecaudacion> createListadoRecaaudacionXFechasResponseListadoRecaaudacionXFechasResult(ArrayOfRecaudacion value) {
        return new JAXBElement<ArrayOfRecaudacion>(_ListadoRecaaudacionXFechasResponseListadoRecaaudacionXFechasResult_QNAME, ArrayOfRecaudacion.class, ListadoRecaaudacionXFechasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = ListadoDeHoras.class)
    public JAXBElement<String> createListadoDeHorasRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, ListadoDeHoras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = ListadoRecaaudacionXFechasyMedico.class)
    public JAXBElement<String> createListadoRecaaudacionXFechasyMedicoRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, ListadoRecaaudacionXFechasyMedico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = ListarReserva.class)
    public JAXBElement<String> createListarReservaRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, ListarReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "distintoResult", scope = DistintoResponse.class)
    public JAXBElement<ArrayOfstring> createDistintoResponseDistintoResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DistintoResponseDistintoResult_QNAME, ArrayOfstring.class, DistintoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgendaMedico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListadoDeHorasResult", scope = ListadoDeHorasResponse.class)
    public JAXBElement<ArrayOfAgendaMedico> createListadoDeHorasResponseListadoDeHorasResult(ArrayOfAgendaMedico value) {
        return new JAXBElement<ArrayOfAgendaMedico>(_ListadoDeHorasResponseListadoDeHorasResult_QNAME, ArrayOfAgendaMedico.class, ListadoDeHorasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = CrearReserva.class)
    public JAXBElement<String> createCrearReservaRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, CrearReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMedico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListarMedicoResult", scope = ListarMedicoResponse.class)
    public JAXBElement<ArrayOfMedico> createListarMedicoResponseListarMedicoResult(ArrayOfMedico value) {
        return new JAXBElement<ArrayOfMedico>(_ListarMedicoResponseListarMedicoResult_QNAME, ArrayOfMedico.class, ListarMedicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = EliminarReserva.class)
    public JAXBElement<String> createEliminarReservaRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, EliminarReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = RecuperaNombre.class)
    public JAXBElement<String> createRecuperaNombreRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, RecuperaNombre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id_centro", scope = ListarMedicoxCentroyEsp.class)
    public JAXBElement<ArrayOfint> createListarMedicoxCentroyEspIdCentro(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ListarMedicoxCentroyEspIdCentro_QNAME, ArrayOfint.class, ListarMedicoxCentroyEsp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "especialidad", scope = ListarMedicoxCentroyEsp.class)
    public JAXBElement<String> createListarMedicoxCentroyEspEspecialidad(String value) {
        return new JAXBElement<String>(_ListarMedicoxCentroyEspEspecialidad_QNAME, String.class, ListarMedicoxCentroyEsp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMedico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarMedicoxCentroyEspResult", scope = ListarMedicoxCentroyEspResponse.class)
    public JAXBElement<ArrayOfMedico> createListarMedicoxCentroyEspResponseListarMedicoxCentroyEspResult(ArrayOfMedico value) {
        return new JAXBElement<ArrayOfMedico>(_ListarMedicoxCentroyEspResponseListarMedicoxCentroyEspResult_QNAME, ArrayOfMedico.class, ListarMedicoxCentroyEspResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = RecuperaDatos.class)
    public JAXBElement<String> createRecuperaDatosRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, RecuperaDatos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "comp", scope = RealizarPagoComision.class)
    public JAXBElement<String> createRealizarPagoComisionComp(String value) {
        return new JAXBElement<String>(_RealizarPagoComisionComp_QNAME, String.class, RealizarPagoComision.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = RealizarPagoComision.class)
    public JAXBElement<String> createRealizarPagoComisionRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, RealizarPagoComision.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecaudacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listadoRecaaudacionXFechasyMedicoResult", scope = ListadoRecaaudacionXFechasyMedicoResponse.class)
    public JAXBElement<ArrayOfRecaudacion> createListadoRecaaudacionXFechasyMedicoResponseListadoRecaaudacionXFechasyMedicoResult(ArrayOfRecaudacion value) {
        return new JAXBElement<ArrayOfRecaudacion>(_ListadoRecaaudacionXFechasyMedicoResponseListadoRecaaudacionXFechasyMedicoResult_QNAME, ArrayOfRecaudacion.class, ListadoRecaaudacionXFechasyMedicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = CrearPago.class)
    public JAXBElement<String> createCrearPagoRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, CrearPago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "forma_pago", scope = CrearPago.class)
    public JAXBElement<String> createCrearPagoFormaPago(String value) {
        return new JAXBElement<String>(_CrearPagoFormaPago_QNAME, String.class, CrearPago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "prevision", scope = CrearPago.class)
    public JAXBElement<String> createCrearPagoPrevision(String value) {
        return new JAXBElement<String>(_CrearPagoPrevision_QNAME, String.class, CrearPago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = VerificarListaReserva.class)
    public JAXBElement<String> createVerificarListaReservaRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, VerificarListaReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoComision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listadoPagoComisionesResult", scope = ListadoPagoComisionesResponse.class)
    public JAXBElement<ArrayOfPagoComision> createListadoPagoComisionesResponseListadoPagoComisionesResult(ArrayOfPagoComision value) {
        return new JAXBElement<ArrayOfPagoComision>(_ListadoPagoComisionesResponseListadoPagoComisionesResult_QNAME, ArrayOfPagoComision.class, ListadoPagoComisionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = CreaHora.class)
    public JAXBElement<String> createCreaHoraRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, CreaHora.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "descp", scope = CreaHora.class)
    public JAXBElement<String> createCreaHoraDescp(String value) {
        return new JAXBElement<String>(_CreaHoraDescp_QNAME, String.class, CreaHora.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = ListadePacientePorMedico.class)
    public JAXBElement<String> createListadePacientePorMedicoRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, ListadePacientePorMedico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaciente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListadePacientePorMedicoResult", scope = ListadePacientePorMedicoResponse.class)
    public JAXBElement<ArrayOfPaciente> createListadePacientePorMedicoResponseListadePacientePorMedicoResult(ArrayOfPaciente value) {
        return new JAXBElement<ArrayOfPaciente>(_ListadePacientePorMedicoResponseListadePacientePorMedicoResult_QNAME, ArrayOfPaciente.class, ListadePacientePorMedicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarReservaResult", scope = ListarReservaResponse.class)
    public JAXBElement<ArrayOfReserva> createListarReservaResponseListarReservaResult(ArrayOfReserva value) {
        return new JAXBElement<ArrayOfReserva>(_ListarReservaResponseListarReservaResult_QNAME, ArrayOfReserva.class, ListarReservaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RecuperaNombreResult", scope = RecuperaNombreResponse.class)
    public JAXBElement<String> createRecuperaNombreResponseRecuperaNombreResult(String value) {
        return new JAXBElement<String>(_RecuperaNombreResponseRecuperaNombreResult_QNAME, String.class, RecuperaNombreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgendaMedico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarHoraxFechayMedicoResult", scope = ListarHoraxFechayMedicoResponse.class)
    public JAXBElement<ArrayOfAgendaMedico> createListarHoraxFechayMedicoResponseListarHoraxFechayMedicoResult(ArrayOfAgendaMedico value) {
        return new JAXBElement<ArrayOfAgendaMedico>(_ListarHoraxFechayMedicoResponseListarHoraxFechayMedicoResult_QNAME, ArrayOfAgendaMedico.class, ListarHoraxFechayMedicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RutMedicoResult", scope = RutMedicoResponse.class)
    public JAXBElement<ArrayOfstring> createRutMedicoResponseRutMedicoResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_RutMedicoResponseRutMedicoResult_QNAME, ArrayOfstring.class, RutMedicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RecuperaDatosResult", scope = RecuperaDatosResponse.class)
    public JAXBElement<Persona> createRecuperaDatosResponseRecuperaDatosResult(Persona value) {
        return new JAXBElement<Persona>(_RecuperaDatosResponseRecuperaDatosResult_QNAME, Persona.class, RecuperaDatosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RecuperaPerfilResult", scope = RecuperaPerfilResponse.class)
    public JAXBElement<ArrayOfstring> createRecuperaPerfilResponseRecuperaPerfilResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_RecuperaPerfilResponseRecuperaPerfilResult_QNAME, ArrayOfstring.class, RecuperaPerfilResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgendaMedico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Lista", scope = RecibeListado.class)
    public JAXBElement<ArrayOfAgendaMedico> createRecibeListadoLista(ArrayOfAgendaMedico value) {
        return new JAXBElement<ArrayOfAgendaMedico>(_RecibeListadoLista_QNAME, ArrayOfAgendaMedico.class, RecibeListado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = RecuperarIdMedico.class)
    public JAXBElement<String> createRecuperarIdMedicoRut(String value) {
        return new JAXBElement<String>(_ValidarPersonaRut_QNAME, String.class, RecuperarIdMedico.class, value);
    }

}
