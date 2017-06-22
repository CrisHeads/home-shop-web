/**
 * 
 */
package ec.com.homeshop.view.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import ec.com.homeshop.logica.servicio.inventario.ItemServicio;
import ec.com.homeshop.logica.servicio.inventario.PedidoServicio;
import ec.com.homeshop.logica.servicio.inventario.ProveedorServicio;
import ec.com.homeshop.modelo.actor.Persona;
import ec.com.homeshop.modelo.actor.Proveedor;
import ec.com.homeshop.modelo.compra.Detalle;
import ec.com.homeshop.modelo.compra.Pedido;
import ec.com.homeshop.modelo.inventario.Item;

/**
 * @author CRISTHIAN Cabezas
 *
 */
@ManagedBean
@ViewScoped
public class PedidoView {

	@ManagedProperty("#{itemServicio}")
	private ItemServicio itemServicio;
	@ManagedProperty("#{proveedorServicio}")
	private ProveedorServicio proveedorServicio;
	@ManagedProperty("#{pedidoServicio}")
	private PedidoServicio pedidoServicio;

	private List<Item> allItems;
	private List<Item> filteredItems;

	private Proveedor proveedorSelected;
	private List<Proveedor> tiendas;
	private Item itemSelected;
	private List<Item> itemsPedido;

	private Pedido pedido;
	private List<Detalle> detalles;

	public PedidoView() {
		super();
		pedido = new Pedido();
		detalles = new ArrayList<Detalle>();
		tiendas = new ArrayList<Proveedor>();

		filteredItems = new ArrayList<Item>();
		itemsPedido = new ArrayList<Item>();
	}

	@PostConstruct
	public void iniciar() {
		allItems = itemServicio.getItems();
		tiendas = proveedorServicio.getProveedores();

		itemsPedido.clear();
		detalles.clear();
	}

	public List<Item> completeItem(String query) {
		for (int i = 0; i < allItems.size(); i++) {
			Item item = allItems.get(i);
			if (item.getNombre().toLowerCase().startsWith(query)) {
				filteredItems.add(item);
			}
		}
		return filteredItems;
	}

	public void onItemPedidoSelect(SelectEvent event) {
		Item item = (Item) event.getObject();
		itemsPedido.add(item);
		pedidoServicio.agregarDetalle(pedido, item, BigDecimal.ONE);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Producto agregado a su lista", item.getNombre()));

	}

	public void onProveedorSelect() {
		pedido = pedidoServicio.iniciarPedido(proveedorSelected, getCliente());
	}
	
	public String verProductos() {
        return "pm:second";
    }

	private static Persona getCliente() {
		Persona persona = new Persona();
		persona.setAlias("CrisHeads");
		persona.setApellidoPrimero("Cabezas");
		persona.setApellidoSegundo("Gutiérrez");
		persona.setNombres("Cristhian Fabián");
		return persona;
	}

	public Item getItemSelected() {
		return itemSelected;
	}

	public void setItemSelected(Item itemSelected) {
		this.itemSelected = itemSelected;
	}

	public ItemServicio getService() {
		return itemServicio;
	}

	public void setService(ItemServicio service) {
		this.itemServicio = service;
	}

	public List<Item> getItemsPedido() {
		return itemsPedido;
	}

	public void setItemsPedido(List<Item> itemsPedido) {
		this.itemsPedido = itemsPedido;
	}

	public ItemServicio getItemServicio() {
		return itemServicio;
	}

	public void setItemServicio(ItemServicio itemServicio) {
		this.itemServicio = itemServicio;
	}

	public ProveedorServicio getProveedorServicio() {
		return proveedorServicio;
	}

	public void setProveedorServicio(ProveedorServicio proveedorServicio) {
		this.proveedorServicio = proveedorServicio;
	}

	public List<Item> getAllItems() {
		return allItems;
	}

	public void setAllItems(List<Item> allItems) {
		this.allItems = allItems;
	}

	public List<Item> getFilteredItems() {
		return filteredItems;
	}

	public void setFilteredItems(List<Item> filteredItems) {
		this.filteredItems = filteredItems;
	}

	public Proveedor getProveedorSelected() {
		return proveedorSelected;
	}

	public void setProveedorSelected(Proveedor proveedorSelected) {
		this.proveedorSelected = proveedorSelected;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}

	public PedidoServicio getPedidoServicio() {
		return pedidoServicio;
	}

	public void setPedidoServicio(PedidoServicio pedidoServicio) {
		this.pedidoServicio = pedidoServicio;
	}

	public List<Proveedor> getTiendas() {
		return tiendas;
	}

	public void setTiendas(List<Proveedor> tiendas) {
		this.tiendas = tiendas;
	}

}
