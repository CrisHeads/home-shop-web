/**
 * 
 */
package ec.com.homeshop.convert;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import ec.com.homeshop.logica.servicio.inventario.ItemServicio;
import ec.com.homeshop.modelo.inventario.Item;

/**
 * @author CRISTHIAN
 *
 */
@FacesConverter("itemConverter")
public class ItemConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && value.trim().length() > 0) {
			ItemServicio service = (ItemServicio) fc.getExternalContext().getApplicationMap().get("itemServicio");
			return service.getItems().get(Integer.parseInt(value));
		} else {
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		if (object != null) {
			return String.valueOf(((Item) object).getId());
		} else {
			return null;
		}
	}

}
