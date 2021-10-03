package turismoEnLaTierraMedia;

import java.util.List;

import javax.swing.*;	// Necesario para la creaci�n del panel

public class Usuario {

	private String nombre;
	protected int presupuesto;
	protected double tiempoDisponible;
	private TipoDeAtraccion tipoAtracci�nPreferida;
	private List<Sugerible> itinerario;

	public Usuario(String nombre, TipoDeAtraccion atracci�nPreferida, int presupuesto, double tiempoDisponible) {
		this.nombre = nombre;
		this.tipoAtracci�nPreferida = atracci�nPreferida;
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
	}

	public String getNombre() {
		return this.nombre;
	}

	public TipoDeAtraccion getAtraccionPreferida() {
		return this.tipoAtracci�nPreferida;
	}

	public int getPresupuesto() {
		return this.presupuesto;
	}

	public double getTiempoDisponible() {
		return this.tiempoDisponible;
	}
	
	public List<Sugerible> getItinerario() {
		return this.itinerario;
	}
	
	public void recibirItinerario(List<Sugerible> itinerario) {
		this.itinerario = itinerario;
	}

	public void aceptoOfertaSugeridaYseDescontoTiempoYpresupuesto(Sugerible sugerencia) {

		this.tiempoDisponible -= sugerencia.getTiempoNecesario();
		this.presupuesto -= sugerencia.getCostoDeVisita();
	}

	/*
	 * Mostramos la promo o atracci�n para que la misma pueda ser visualizada por consola por el usuario. Inicializamos un String respuesta en null, el cual va a tomar el valor 
	 * de que sea ingresado por el usuario,  un String S y uno N que los creamos solo para que el c�digo se vea m�s elegante. Dentro del Do, va a estar todo lo que va a ejecutarse
	 *  antes de que el while compruebe si tiene que volver a repetir todo lo que realicemos dentro del do.
	 * Lo primero que tenemos dentro del do, es la solicitud al usuario de que ingrese Si o No, ya que es el mensaje que queremos repetir cada vez que se ingrese un dato incorrecto, 
	 *  aunque esto no pasar� gracias al panel ( y la primera vez que interact�e el usuario tambi�n). Luego de eso, al String respuesta le damos el valor de la pr�xima
	 * l�nea que lea el scanner (leer es el scanner creado, y nextLine el m�todo invocado por el mismo). Luego, comprobamos si la respuesta de la persona equivale al valor del String
	 *	"S" (el cual fue definido como �Si�), ignorando si fue escrita en min�scula o may�scula gracias al equalsIgnorecase, que es un  m�todo de los String (recordemos que S fue 
	 * declarado como un String), si lo ingresado por el usuario coincide con el valor almacenado en S, entonces cerramos el scanner y devolvemos True, sino comprobamos si la respuesta de la
	 *  persona equivale al valor del String N (el cual fue definido como �No�, nuevamente no importa si fue escrito en min�scula o may�scula gracias al equalsIgnorecase, si lo
	 * ingresado por el usuario coincide con el valor almacenado en N, entonces cerramos el scanner y devolvemos false, ya que significa que el usuario rechaz� la oferta. 
	 * Si tampoco ingres� �No�, significa que entonces ingres� un valor no correcto, por lo tanto, tenemos un While que nos va a devolver al inicio del ciclo si la respuesta no es Si o No.
	 *  En ese caso, se le volver� a pedir al usuario que ingrese una respuesta, que ser� comprobada nuevamente hasta que la misma sea correcta.
	 */
	public boolean aceptaOferta(Sugerible sugerible ) { 
									
		sugerible.imprimirOferta();

		System.out.println("�Acepta la oferta?");

		String respuesta = null, S = "Si", N = "No";

		do {
			System.out.println("");
			System.out.println("Por favor, ingrese Si o No");
			respuesta = crearPanelSiOno();

			if (respuesta.equalsIgnoreCase(S)) {
				avisoCompraAceptada();
				System.out.println("------------------------------");
				return true;
			}
			if ((respuesta.equalsIgnoreCase(N))) {
				avisoCompraNoAceptada();
				System.out.println("------------------------------");
				return false;
			}
		} while (!(respuesta.equalsIgnoreCase(S) || respuesta.equalsIgnoreCase(N)));
		System.out.println("El programa se ha comportado de forma inesperada");
		return false;
	}

	
	/* Con este m�todo, creamos un panel gr�fico que muestra las opciones Si o no, lo utilizamos para no tener que tipear la respuesta por consola y como m�todo de firma personal del grupo 404
	 * Adem�s de retornar el valor necesario para el m�todo aceptaOferta, tambi�n lo muestra por consola para cumplir con la premisa de que la interacci�n se vea representada en la consola.
	 * 
	 */
	public String crearPanelSiOno() {

		int seleccion = JOptionPane.showOptionDialog(null, "�Acepta la compra?", "Seleccione opcion",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, // null para icono por defecto.
				null, new Object[] { "Si", "No" }, null);

		if (seleccion == 0) {
			System.out.println("Si");
			return "Si";
		}
		System.out.println("No");
		return "No";
	}

	public void avisoCompraAceptada() {
		JOptionPane.showMessageDialog(null, "Usted ha aceptado la oferta");

		System.out.println("Usted ha aceptado la oferta");
	}

	public void avisoCompraNoAceptada() {
		JOptionPane.showMessageDialog(null, "Usted no ha aceptado la oferta");

		System.out.println("Usted no ha aceptado la oferta");

	}
	
}