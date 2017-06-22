/**
 * 
 */
package ec.com.homeshop.logica.servicio.inventario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import ec.com.homeshop.modelo.inventario.Item;
import ec.com.homeshop.modelo.inventario.Tipo;
import ec.com.homeshop.modelo.inventario.UnidadMedida;

/**
 * @author CRISTHIAN
 *
 */
@ManagedBean(name = "itemServicio", eager = true)
@ApplicationScoped
public class ItemServicio {

	List<Item> items;

	@PostConstruct
	public void init() {
		items = new ArrayList<Item>();
		for (int i = 0; i < 10; i++) {
			items.add(getItem(i));
		}
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	private Item getItem(int i) {
		return new Item((long) i, getTipo(i), "Item " + i, "Item descripcion " + i, BigDecimal.TEN, getUnidadMedida());
	}

	private Tipo getTipo(int i) {
		return new Tipo((long) i, "Tipo " + i, "Desc tipo " + i);
	}

	private UnidadMedida getUnidadMedida() {
		UnidadMedida unidad = new UnidadMedida();
		unidad.setId(1L);
		unidad.setNombre("Unidad");
		unidad.setAbreviacion("Unid");
		unidad.setDescripcion("unidad");
		unidad.setSimbolo("U");
		return unidad;
	}
}
