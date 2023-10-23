package modelo;

public class AdministradorRecursos {
	private static AdministradorRecursos instance;
	public String hashID;
	
	private AdministradorRecursos(String hashID) {
		this.hashID = hashID;
	}
	
	public static AdministradorRecursos getInstance(String Id) {
		if (instance == null) {
			instance = new AdministradorRecursos(Id);
		}
		return instance;
	}
}
