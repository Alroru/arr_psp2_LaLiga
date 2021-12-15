package es.studium.Laliga;

public class Equipo {
	//Variables clase equipo
	String nombre;
	int numeroEquipo;
	int posicion;
	int puntosActuales;
	int partidosJugados;
	int partidosGanados;
	int partidosPerdidos;
	int partidosEmpatados;
	int golesAFavor;
	int golesEnContra;
	//Constructor
	public Equipo(String nombre,int numeroEquipo,int posicion)
	{
		this.nombre=nombre;
		this.numeroEquipo=numeroEquipo;
		this.posicion=posicion;
		this.puntosActuales=0;
		this.partidosJugados=0;
		this.partidosGanados=0;
		this.partidosPerdidos=0;
		this.partidosEmpatados=0;
		this.golesAFavor=0;
		this.golesEnContra=0;
	}
	//Metodos getter y setter
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntosActuales() {
		return puntosActuales;
	}
	public void setPuntosActuales(int puntosActuales) {
		this.puntosActuales = puntosActuales;
	}
	public int getPartidosJugados() {
		return partidosJugados;
	}
	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	public int getPartidosGanados() {
		return partidosGanados;
	}
	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}
	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}
	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}
	public int getGolesAFavor() {
		return golesAFavor;
	}
	public void setGolesAFavor(int golesAFavor) {
		this.golesAFavor = golesAFavor;
	}
	public int getGolesEnContra() {
		return golesEnContra;
	}
	public void setGolesEnContra(int golesEnContra) {
		this.golesEnContra = golesEnContra;
	}
	public int getNumeroEquipo() {
		return numeroEquipo;
	}
	public void setNumeroEquipo(int numeroEquipo) {
		this.numeroEquipo = numeroEquipo;
	}

}
