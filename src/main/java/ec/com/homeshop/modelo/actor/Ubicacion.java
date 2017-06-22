/**
 * 
 */
package ec.com.homeshop.modelo.actor;

import java.sql.Date;

/**
 * @author Cristhian Cabezas
 *
 */
public class Ubicacion {

	private Double latitud;
	private Double longitud;
	private Double precision;
	private Date registro;
	private Double altitud;
	private Double precisionAltitud;
	private Double orientacion; // Orientación en grados decimales en el sentido
								// de las agujas del reloj
	private Double velocidad; // velocidad en metros/segundo

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Double getPrecision() {
		return precision;
	}

	public void setPrecision(Double precision) {
		this.precision = precision;
	}

	public Date getRegistro() {
		return registro;
	}

	public void setRegistro(Date registro) {
		this.registro = registro;
	}

	public Double getAltitud() {
		return altitud;
	}

	public void setAltitud(Double altitud) {
		this.altitud = altitud;
	}

	public Double getPrecisionAltitud() {
		return precisionAltitud;
	}

	public void setPrecisionAltitud(Double precisionAltitud) {
		this.precisionAltitud = precisionAltitud;
	}

	public Double getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(Double orientacion) {
		this.orientacion = orientacion;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

}
