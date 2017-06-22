/**
 * 
 */
package ec.com.homeshop.logica.servicio.inventario;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import ec.com.homeshop.modelo.actor.Proveedor;

/**
 * @author Cristhian Cabezas
 *
 */
@ManagedBean(name = "proveedorServicio", eager = true)
@ApplicationScoped
public class ProveedorServicio {

	private List<Proveedor> proveedores;

	public List<Proveedor> getProveedores() {
		if (proveedores == null || proveedores.isEmpty()) {
			return obtenerProveedores();
		}
		return proveedores;
	}

	public void setProveedores(List<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	private List<Proveedor> obtenerProveedores() {
		List<Proveedor> proveedores = new ArrayList<Proveedor>();

		Proveedor proveedor = new Proveedor();
		proveedor.setIdentificacion("1700000000001");
		proveedor.setNombreComercial("Manolete");
		proveedor.setDireccion("E12 #E12-515");
		proveedores.add(proveedor);

		proveedor = new Proveedor();
		proveedor.setIdentificacion("1700000000002");
		proveedor.setNombreComercial("Doña Rosa");
		proveedor.setDireccion("E11 #E11-515");
		proveedores.add(proveedor);

		proveedor = new Proveedor();
		proveedor.setIdentificacion("1700000000003");
		proveedor.setNombreComercial("Veci veci");
		proveedor.setDireccion("E10 #E10-515");
		proveedores.add(proveedor);

		return proveedores;
	}

}
