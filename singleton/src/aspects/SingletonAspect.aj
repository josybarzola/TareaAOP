package aspects;
public aspect SingletonAspect {
	pointcut instance(String hashID): execution(* getInstance(..)) && args(hashID);
	
	before(String hashID): instance(hashID) {
		System.out.println("Creando objeto con " + hashID);
	}
}