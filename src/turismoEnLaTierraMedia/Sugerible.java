package turismoEnLaTierraMedia;

public interface Sugerible {
	
	public String getNombre();
	
	public int getCostoDeVisita();
	
	public double getTiempoNecesario();
	
	// public boolean esPromocion();
	
	//Este m�todo trae el tipo de la atracci�n o promoci�n. No el preferido del usuario.
	public TipoDeAtraccion getTipo();
	
	public boolean comprobarCupo();	
	
	public void restarCupo();
	  
	 //Escribir en la sugerencia diaria del usuario
	
}