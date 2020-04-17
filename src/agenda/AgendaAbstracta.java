package agenda;

public interface AgendaAbstracta {
	public void add(String nombre, String telefono);
	public MiIterator<Contacto> createIterator();
	public String getPropietario();
}
