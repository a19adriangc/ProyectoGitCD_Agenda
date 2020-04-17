package agenda;
import java.util.ArrayList;

public class AgendaInfinita implements AgendaAbstracta {
	String propietario;
	ArrayList<Contacto> contactos = new ArrayList<>();
	
	public AgendaInfinita(String propietario) {
		this.propietario = propietario;
	}
	
	public String getPropietario() {
		return propietario;
	}
	
	public void add(String nombre, String telefono) {
		contactos.add(new Contacto(nombre, telefono));
	}
	
	public MiIterator<Contacto> createIterator() {
		return new IteradorDeAgendaInfinita(contactos);
	}
}
