package turismoEnLaTierraMedia;

public abstract class Usuario {

	@SuppressWarnings("unused")						//quitar anotaci�n cuando se utilice este valor en otra clase.
	private String nombre = "";
	@SuppressWarnings("unused")						//quitar anotaci�n cuando se utilice este valor en otra clase.
	private int presupuesto = 0;
	@SuppressWarnings("unused")						//quitar anotaci�n cuando se utilice este valor en otra clase.
	private String atracci�nPreferida = "";
	@SuppressWarnings("unused")						//quitar anotaci�n cuando se utilice este valor en otra clase.
	private double tiempoDisponible;
	
	
	
	
	public String getNombre(String nombre) {
		return this.nombre = nombre;
	}
	
	public String getAtracci�nPreferida(String atracci�nPreferida) {
		return this.atracci�nPreferida = atracci�nPreferida;
	}
	
	public int getPresupuesto(int presupuesto) {
		return this.presupuesto = presupuesto;
	}
	
	public double getTiempoDisponible(double tiempoDisponible) {
		return this.tiempoDisponible = tiempoDisponible;
	}
	
	/*		
	 public Usuario (String nombre, String atracci�nPreferida, int Presupuesto, double tiempoDisponible){
	 	this.nombre = nombre;
	 	this.atracci�nPreferida = atracci�nPreferida;
	 	this.presupuesto = presupuesto;
	 	this.tiempoDisponible = tiempoDisponible;
	 }
	 
	 Usuario[] registroUsuario = new registroUsuario[] {String nombre, String atracci�nPreferida, int presupuesto, double tiempoDisponible};	
	 
	 
	 */
	
	//	ArrayList<String> registro = new ArrayList<String>();
	
	public String getRegistro() {
		return "[" + "Nombre: " + this.nombre + "," +  "Atracci�n preferida: " + this.atracci�nPreferida + "," + "Presupuesto: " + this.presupuesto + "," + "Tiempo disponible: " + this.tiempoDisponible + "]";
	}
	
	
}