import java.util.ArrayList;

public class PartidaAjedrez implements mostrador{
	
	private int num_mesa;
	private Jugador blancas;
	private Jugador negras;
	private final int ganar = 1;
	private final int perder = 0;
	private final double tablas = 0.5;
	private ArrayList movimiento_blancas;
	private ArrayList movimiento_negras;
	private Equipo local;
	private Equipo visitante;
	
	
	
	public PartidaAjedrez(){
		
	}
	
	
		
	public Equipo getLocal() {
		return local;
	}


	public void setLocal(Equipo local) {
		this.local = local;
	}


	public Equipo getVisitante() {
		return visitante;
	}


	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}


	public ArrayList getMovimiento_blancas() {
		return movimiento_blancas;
	}


	public void setMovimiento_blancas(ArrayList movimiento_blancas) {
		this.movimiento_blancas = movimiento_blancas;
	}


	public ArrayList getMovimiento_negras() {
		return movimiento_negras;
	}


	public void setMovimiento_negras(ArrayList movimiento_negras) {
		this.movimiento_negras = movimiento_negras;
	}

	

	public int getGanar() {
		return ganar;
	}

	public Jugador getBlancas() {
		return blancas;
	}

	public void setBlancas(Jugador jugador1) {
		this.blancas = jugador1;
	}

	public Jugador getNegras() {
		return negras;
	}

	public void setNegras(Jugador jugador2) {
		this.negras = jugador2;
	}

	public int getNum_mesa() {
		return num_mesa;
	}

	public void setNum_mesa(int num_mesa) {
		this.num_mesa = num_mesa;
	}

	public void mostrar(){
		System.out.println(this.local.getNombre_equipo() + " - " + this.visitante.getNombre_equipo());
		for (int i = 0; i < this.local.getJugadores().size(); i++) {
			
			System.out.println("\t(" + this.local.getJugadores().get(i).getElo() + ") " + 
			this.local.getJugadores().get(i).getNombre() +" " + this.local.getJugadores().get(i).getApellidos() + 
			" - " + this.visitante.getJugadores().get(i).getNombre() + " " 
			+ this.visitante.getJugadores().get(i).getApellidos() + " (" 
			+ this.visitante.getJugadores().get(i).getElo() + ")");
			
		}
	}
	

}
