
public aspect AdapterAspect {
	pointcut adaptarPrisma():execution(void PetStore.makeAppointment(..));
		
}
