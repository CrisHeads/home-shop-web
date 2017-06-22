/**
 * 
 */
package ec.com.homeshop.modelo.compra;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import ec.com.homeshop.modelo.actor.Persona;
import ec.com.homeshop.modelo.actor.Proveedor;

/**
 * @author CRISTHIAN
 *
 */
public class Pedido {

	private Long id;
	private Proveedor proveedor;
	private Date fechaRegistro;
	private Date fechaConfirma;
	private Persona persona;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;

	private List<Detalle> detalles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaConfirma() {
		return fechaConfirma;
	}

	public void setFechaConfirma(Date fechaConfirma) {
		this.fechaConfirma = fechaConfirma;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}

}
