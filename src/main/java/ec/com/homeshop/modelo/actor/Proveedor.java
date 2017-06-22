/**
 *
 */
package ec.com.homeshop.modelo.actor;

/**
 * @author Cristhian Cabezas
 *
 */
public class Proveedor {

	private String identificacion;
	private Persona representante;
	private String nombreComercial;
	private String direccion;
	private Ubicacion ubicacion;

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Persona getRepresentante() {
		return representante;
	}

	public void setRepresentante(Persona representante) {
		this.representante = representante;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

}
