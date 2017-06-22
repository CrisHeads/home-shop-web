/**
 * 
 */
package ec.com.homeshop.modelo.inventario;

import java.math.BigDecimal;

/**
 * @author CRISTHIAN
 *
 */
public class Item {

	private Long id;
	private String idAuxiliar;
	private String referencia;
	private String codigoBarra;
	private Tipo tipo;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;
	private UnidadMedida unidadMedida;

	public Item(Long id, Tipo tipo, String nombre, String descripcion, BigDecimal precio, UnidadMedida unidadMedida) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.unidadMedida = unidadMedida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdAuxiliar() {
		return idAuxiliar;
	}

	public void setIdAuxiliar(String idAuxiliar) {
		this.idAuxiliar = idAuxiliar;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", tipo=" + tipo.getNombre() + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", unidad=" + unidadMedida.getAbreviacion() + "]";
	}

}
