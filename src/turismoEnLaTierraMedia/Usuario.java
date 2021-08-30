package turismoEnLaTierraMedia;

public class Usuario {

	private String nombre;
	protected int presupuesto;					
	private String atracci�nPreferida;
	protected double tiempoDisponible;			
	
	
	 public Usuario (String nombre, String atracci�nPreferida, int presupuesto, double tiempoDisponible) throws InvalidNumberException{
		 	this.nombre = nombre;
		 	this.atracci�nPreferida = atracci�nPreferida;
		 	this.setPresupuesto(presupuesto);
		 	this.setTiempoDisponible(tiempoDisponible);
	}
	 
	/* 
	 public Nota (int valorInicial) {
			this.setValorNota(valorInicial);
	 */
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getAtraccionPreferida() {
		return this.atracci�nPreferida;
	}
	
	public int getPresupuesto() {
		return this.presupuesto;
	}
	
	public double getTiempoDisponible() {
		return this.tiempoDisponible;
	}
	
	/*
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setAtracci�nPreferida(String atracci�nPreferida) {
		this.atracci�nPreferida = atracci�nPreferida;
	}
	*/
	
	public void setPresupuesto(int presupuesto){
		try {
		if(presupuesto < 1) {
			throw new InvalidNumberException("El presupuesto no puede ser menor que 1");
		}
		} catch(InvalidNumberException ine) {
			System.err.println("El presupuesto no puede ser menor que 1");
		}
		this.presupuesto = presupuesto;
	}
	
	public void setTiempoDisponible(double tiempoDisponible) throws InvalidNumberException {
		try {
		if(tiempoDisponible < 1) {
			throw new InvalidNumberException("El tiempo no puede ser menor que 1");
		}
		} catch (InvalidNumberException ine) {
			System.err.println("El tiempo no puede ser menor que 1");
		}
		this.tiempoDisponible = tiempoDisponible;
	}
	
	public String getRegistro() {
		return "[" + "Nombre: " + this.nombre + "," +  "Atracci�n preferida: " + this.atracci�nPreferida + "," + "Presupuesto: " + this.presupuesto + 
			   "," + "Tiempo disponible: " + this.tiempoDisponible + "]";
	}
	
}