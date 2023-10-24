package demo;
import modelo.AdministradorRecursos;

public class Demo {
	public static void main(String[] args) {
		AdministradorRecursos instancia1= AdministradorRecursos.getInstance("FE54FE6S");
		System.out.println("hashID de instancia1: "+instancia1.hashID);
		AdministradorRecursos instancia2 = AdministradorRecursos.getInstance("FWE54A6F");
	    System.out.println("hashID de instancia2: "+instancia2.hashID);
	}
	
}
