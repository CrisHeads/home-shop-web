/**
 * 
 */
package ec.com.homeshop.modelo.actor;

import java.util.Date;

/**
 * @author CRISTHIAN
 *
 */
public class Persona {

	private Long id;
	private String alias;
	private String nombres;
	private String apellidoPrimero;
	private String apellidoSegundo;
	private Date fechaNacimiento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPrimero() {
		return apellidoPrimero;
	}

	public void setApellidoPrimero(String apellidoPrimero) {
		this.apellidoPrimero = apellidoPrimero;
	}

	public String getApellidoSegundo() {
		return apellidoSegundo;
	}

	public void setApellidoSegundo(String apellidoSegundo) {
		this.apellidoSegundo = apellidoSegundo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
