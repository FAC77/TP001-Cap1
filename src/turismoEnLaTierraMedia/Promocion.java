package turismoEnLaTierraMedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Promocion implements Sugerible {
	
	protected List<Atraccion> atraccionesIncluidas = new ArrayList<Atraccion>();
	private String nombre;

	public Promocion(String nombreDePromocion, List<Atraccion> listaAtracciones) {
		this.setNombre(nombreDePromocion);
		this.setArrayAtracciones(listaAtracciones);
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void restarCupo() {

		for (int i = 0; i < atraccionesIncluidas.size(); i++) {
				atraccionesIncluidas.get(i).restarCupo();
		}
	}

	@Override
	public boolean comprobarCupo() {

		for (int i = 0; i < atraccionesIncluidas.size(); i++) {
				if (!atraccionesIncluidas.get(i).comprobarCupo()) {
					return false;
			}
		}
		return true;
	}

	/**
	 * Obtenemos el tipo de la atracci�n de la posici�n 0, ya que todas las
	 * atracciones van a tener el mismo tipo.
	 */
	@Override
	public TipoDeAtraccion getTipo() {
		return this.atraccionesIncluidas.get(0).getTipo();
	}

	@Override
	public double getTiempoNecesario() {
		double tiempoTotal = 0;

		for (int i = 0; i < atraccionesIncluidas.size(); i++) {
				tiempoTotal += atraccionesIncluidas.get(i).getTiempoNecesario();
		}
		return tiempoTotal;
	}

	@Override
	public void agregarAtraccion(Sugerible sugerible, List<Atraccion> lista) {
		for (int i = 0; i < atraccionesIncluidas.size(); i++) {	
			lista.add(atraccionesIncluidas.get(i));		
		}
	}

	@Override
	public boolean esPromocion() {
		return true;
	}

	@Override
	public void imprimirOferta() {

		System.out.println("Usted est� accediendo a la promoci�n: " + this.getNombre().toUpperCase() + ".");
		System.out.println("Esta promo incluye las siguientes atracciones:");

		for (int i = 0; i < this.getArrayAtracciones().size(); i++) {
				System.out.println((i + 1) + ". " + this.getNombreAtraccion(this.getArrayAtracciones().get(i)).toUpperCase());
			}
		System.out.println("El costo de la promoci�n es: " + this.getCostoDeVisita() + " monedas.");
		System.out.println("La duraci�n aproximada del recorrido es de: " + this.getTiempoNecesario() + " horas.");
		System.out.println("-----------------------------------------------------------------");
	}

	public String getNombreAtraccion(Atraccion atraccion) {
		return atraccion.getNombre();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Atraccion> getArrayAtracciones() {
		return this.atraccionesIncluidas;
	}

	/**
	 * Pasamos por par�metro las atracciones que estar�n inclu�das en la promoci�n.
	 * 
	 * @param atraccionesIncluidas
	 */
	public void setArrayAtracciones(List<Atraccion>atraccionesIncluidas) {
		this.atraccionesIncluidas = atraccionesIncluidas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(atraccionesIncluidas, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Promocion other = (Promocion) obj;
		return Objects.equals(atraccionesIncluidas, other.atraccionesIncluidas) && Objects.equals(nombre, other.nombre);
	}

	/*
	public static void main(String[] args) {

		Atraccion Mordor = new Atraccion("Mordor", 12, 3, 10, TipoDeAtraccion.PAISAJE);
		Atraccion Erebor = new Atraccion("Erebor", 15, 3, 30, TipoDeAtraccion.PAISAJE);
		Atraccion MinasTirith = new Atraccion("MinasTirith", 5, 2.5, 20, TipoDeAtraccion.DEGUSTACION);
		Atraccion LaComarca = new Atraccion("LaComarca", 23, 6.5, 20, TipoDeAtraccion.DEGUSTACION);
		Atraccion Lothlorien = new Atraccion("Lothlorien", 13, 4, 60, TipoDeAtraccion.DEGUSTACION);
		Atraccion AbismoDeHelm = new Atraccion("AbismoDeHelm", 33, 6.5, 50, TipoDeAtraccion.DEGUSTACION);

		Atraccion[] arrayPromoPorcentual = new Atraccion[2];
		arrayPromoPorcentual[0] = Mordor;
		arrayPromoPorcentual[1] = Erebor;

		Atraccion[] arrayPromoPorcentual2 = new Atraccion[2];
		arrayPromoPorcentual2[0] = MinasTirith;
		arrayPromoPorcentual2[1] = LaComarca;

		Atraccion[] arrayPromoPorcentual3 = new Atraccion[2];
		arrayPromoPorcentual3[0] = Lothlorien;
		arrayPromoPorcentual3[1] = AbismoDeHelm;

		Promocion Promocion1 = new PromocionPorcentual("PromoPorcentual1", arrayPromoPorcentual, 10);
		Promocion Promocion2 = new PromocionPorcentual("PromoPorcentual2", arrayPromoPorcentual2, 10);
		Promocion Promocion3 = new PromocionPorcentual("PromoPorcentual3", arrayPromoPorcentual3, 10);

		Promocion1.imprimirOferta();
		Mordor.imprimirOferta();	
	}
*/
}