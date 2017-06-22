package ec.com.homeshop.logica.servicio.inventario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import ec.com.homeshop.modelo.actor.Persona;
import ec.com.homeshop.modelo.actor.Proveedor;
import ec.com.homeshop.modelo.compra.Detalle;
import ec.com.homeshop.modelo.compra.Pedido;
import ec.com.homeshop.modelo.inventario.Item;

/**
 * @author Cristhian Cabezas
 *
 */
@ManagedBean(name = "pedidoServicio", eager = true)
@ApplicationScoped
public class PedidoServicio {

	public Pedido iniciarPedido(Proveedor proveedor, Persona cliente) {
		Pedido pedido = new Pedido();
		pedido.setProveedor(proveedor);
		pedido.setPersona(cliente);
		pedido.setFechaRegistro(new Date());
		pedido.setId(Long.valueOf(pedido.hashCode()));
		pedido.setSubtotal(BigDecimal.ZERO);
		pedido.setIva(BigDecimal.ZERO);
		pedido.setTotal(BigDecimal.ZERO);
		pedido.setDetalles(new ArrayList<Detalle>());
		return pedido;
	}

	public void agregarDetalle(Pedido pedido, Item item, BigDecimal cantidad) {
		Detalle detalle = new Detalle();
		detalle.setItem(item);
		detalle.setCantidad(cantidad);
		detalle.setPrecio(item.getPrecio());
		detalle.setIva(item.getPrecio().multiply(getPorcentajeIva()));
		detalle.setTotal((detalle.getPrecio().multiply(detalle.getCantidad())).add(detalle.getIva()));
		
		pedido.setIva(pedido.getIva().add(detalle.getIva()));
		pedido.setSubtotal(pedido.getSubtotal().add(detalle.getPrecio().multiply(detalle.getCantidad())));
		
		pedido.setTotal(pedido.getSubtotal().add(pedido.getIva()));
		
		pedido.getDetalles().add(detalle);
	}

	private static BigDecimal getPorcentajeIva() {
		return new BigDecimal("0.12");
	}

}
