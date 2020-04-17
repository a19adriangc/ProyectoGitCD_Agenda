//PRIMER PROGRAMA
import agenda.AgendaAbstracta;
import agenda.AgendaInfinita;
import agenda.AgendaRapida;
import agenda.Contacto;
import agenda.MiIterator;

class Cliente{
    public static void main(String[] args){
       AgendaAbstracta agendaChuchi= new AgendaInfinita("Chuchi infinito");
       agendaChuchi.add("eluno", "11111");
       agendaChuchi.add("dosi", "22222");
       agendaChuchi.add("tresi", "333333");
       MiIterator<Contacto> it= agendaChuchi.createIterator();
       System.out.println("Agenda de "+ agendaChuchi.getPropietario());
       while(it.hasNext()){
           System.out.println(it.next());
       }
        System.out.println("------------------------------------");
       agendaChuchi= new AgendaRapida("Chuchi Rapido");
       agendaChuchi.add("eluno", "11111");
       agendaChuchi.add("dosi", "22222");
       agendaChuchi.add("tresi", "333333");
       it= agendaChuchi.createIterator();
       System.out.println("Agenda de "+ agendaChuchi.getPropietario());
       while(it.hasNext()){
           System.out.println(it.next());
       }
       
    }
}