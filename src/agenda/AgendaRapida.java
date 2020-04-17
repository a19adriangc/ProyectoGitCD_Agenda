package agenda;

public class AgendaRapida implements AgendaAbstracta  {
	String propietario;
	Contacto[] contactos = new Contacto[0];
	
	public AgendaRapida(String propietario) {
		this.propietario = propietario;
	}
	
	public String getPropietario() {
		return propietario;
	}
	
	public void add(String nombre, String telefono) {
		Contacto[] contactosTemporal = new Contacto[contactos.length+1];
		for(int i = 0 ; i < contactos.length ; i++) {
			contactosTemporal[i] = contactos[i];
		}
		contactosTemporal[contactosTemporal.length-1] = new Contacto(nombre, telefono);
		contactos = contactosTemporal;
	}
	
	public MiIterator<Contacto> createIterator() {
		return new IteradorDeAgendaRapida(contactos);
	}
}
