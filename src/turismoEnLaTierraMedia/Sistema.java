package turismoEnLaTierraMedia;

public class Sistema {
	
	ListadoAtracciones listado;				// No cre� TipoDeAtracci�n tipo porque podr�a no ser necesario si funciona la implementaci�n nueva del ListadoAtracciones.
	@SuppressWarnings("unused")				// Quitar al utilizar en el c�digo este atributo.
	private String[] SugerenciaDiaria;
	
	// Plantilla base para empezar a crear el c�digo.
	
	public String sugerirVisitas(String visitas) {
		return visitas;
	}
	
	public String getItinerarios(String itinerarios) {
		return itinerarios;
	}
	

	public String getArchivoEntrada(String entrada) {
		return entrada;
	}
	
	public String guardarSugerenciaDiaria(String sugerenciaDiaria) {
		return sugerenciaDiaria;
	}
	
	public String getResumen(String resumen) {
		return resumen;
	}
	
	public int setPresupuesto(int presupuesto) {
		return presupuesto;
	}
	
	public int setTiempoDisponible(int tiempo) {
		return tiempo;
	}
	
	public String getArchivoDeSalida(String salida) {
		return salida;
	}
	
	
	/*		Revisar si alguno de estos m�todos es necesario.
	 	public String getPromocionesVigentes(String promo) {		
		return promo;
	}
	
	public String usuariosConSusPreferencias(String usuariosPreferencias) {
		return usuariosPreferencias;
	}
	
	public String atraccionesConSusCaracter�sticas(String caracter�sticasAtracciones) {
		return caracter�sticasAtracciones;
	}
	
	public String sugerirPromoci�n(String promoSugerida) {
		return promoSugerida;
	}
	 */
	
}