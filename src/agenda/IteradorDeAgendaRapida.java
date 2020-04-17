package agenda;

class IteradorDeAgendaRapida implements MiIterator<Contacto> {
	Contacto[] contactos;
	int posSiguiente;
	
	IteradorDeAgendaRapida(Contacto[] contactos) {
		posSiguiente = 0;
		this.contactos = contactos;
	}
	
	public boolean hasNext() {
		if(contactos == null || posSiguiente == contactos.length) {
			return false;
		} else {
			return true;
		}
	}
	
	public Contacto next() {
		return contactos[posSiguiente++];
	}
}
