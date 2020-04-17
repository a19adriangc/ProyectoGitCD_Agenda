package agenda;
import java.util.ArrayList;

class IteradorDeAgendaInfinita implements MiIterator<Contacto> {
	ArrayList<Contacto> contactos = new ArrayList<>();
	int posSiguiente;
	
	IteradorDeAgendaInfinita(ArrayList<Contacto> contactos) {
		posSiguiente = 0;
		this.contactos = contactos;
	}
	
	public boolean hasNext() {
		if(contactos == null || posSiguiente == contactos.size()) {
			return false;
		} else {
			return true;
		}
	}
	
	public Contacto next() {
		return contactos.get(posSiguiente++);
	}
}
