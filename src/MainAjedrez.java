import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainAjedrez {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Torneo open_donostia = new Torneo("Open Donostia");
		ArrayList<Equipo> equipos = new ArrayList();
		ArrayList<Jugador> jugadores = new ArrayList();

		final int A�ADIR_EQUIPO = 1;
		final int MOSTRAR_EQUIPOS = 2;
		final int A�ADIR_JUGADOR = 5;
		final int A�ADIR_PARTIDA = 3;
		final int SALIR = 4;
		final int SALIR_2 = 6;
		
		
		
		int opcion = 0;
		do{
			System.out.println("------MENU DEL OPEN DE DONOSTIA 2018 --------");
			System.out.println(A�ADIR_EQUIPO + ". A�adir un equipo al torneo.");
			System.out.println(MOSTRAR_EQUIPOS + ". Mostrar todos los equipos apuntados.");
			System.out.println(A�ADIR_PARTIDA + ". A�adir el emparejamiento de 2 equipos");
			System.out.println(SALIR + ". Salir del programa");
			
			opcion = Integer.parseInt(lector.nextLine());
			
			switch (opcion) {
			case A�ADIR_EQUIPO:
				System.out.println("El nombre del equipo:");
				String nombre_equipo = lector.nextLine();
				
				Equipo equipo1 = a�adirEquipo(nombre_equipo, equipos);
				
				
				equipo1.setJugadores(jugadores);
				do{
					System.out.println("------MENU A�ADIR JUGADORES A " + nombre_equipo + "------");
					System.out.println(A�ADIR_JUGADOR + ". A�adir jugador al equipo " + nombre_equipo);
					System.out.println(SALIR_2 + ". Salir.");
					opcion = Integer.parseInt(lector.nextLine());
					
					switch (opcion) {
					case A�ADIR_JUGADOR:
						
						System.out.println("Escribe el nombre del jugador:");
						String nombre = lector.nextLine();
						
						System.out.println("Escribe los apellidos:");
						String apellidos = lector.nextLine();
						
						System.out.println("Escribe el elo FIDE del jugador:");
						int elo = Integer.parseInt(lector.nextLine());
						
						a�adirJugador(nombre, apellidos, elo, jugadores);
						break;

					default:
						break;
					}
				}
				while(opcion != SALIR_2);
				
				
				break;
			
			case MOSTRAR_EQUIPOS:
				mostrarEquipos(equipos);
				break;
			
			case A�ADIR_PARTIDA:
				
				System.out.println("Escribe el nombre del equipo local:");
				
				String equipo_local = lector.nextLine();
				
				System.out.println("Escribe el nombre del equipo visitante:");
				
				String equipo_visitante = lector.nextLine();
				
				break;
				
			case SALIR:

			default:
				break;
			}
			
		}
		while(opcion != SALIR);
		
		

	}
	
	
	public static Equipo a�adirEquipo(String nombre_equipo, ArrayList<Equipo> equipos){
		Equipo equipo1 = new Equipo();
		equipo1.setNombre_equipo(nombre_equipo);
		equipos.add(equipo1);
		
		return equipo1;
	}
	
	public static void mostrarEquipos(ArrayList<Equipo> equipos){
		Iterator<Equipo> iterador = equipos.iterator();
		
		while(iterador.hasNext()){
			Equipo equipo1 = iterador.next();
			equipo1.mostrar();
		}
	}
	
	public static void a�adirJugador(String nombre_jugador, String apellidos, int elo, ArrayList<Jugador> jugadores){
		
		Jugador jugador1 = new Jugador(nombre_jugador, apellidos, elo);
		
		if(jugadores.size() == 4){
			System.out.println("El equipo est� completo");
		}
		else {
			jugadores.add(jugador1);
		}
		
	}
	
	public static void a�adirEmparejamiento(String equipo_local, String equipo_visitante, ArrayList<Equipo> equipos,
			ArrayList<Jugador> jugadores){
		
		for (int i = 0; i < equipos.size(); i++) {
			
			if(equipo_local.equals(equipos.get(i).getNombre_equipo())){
				
			}
			
		}
		
		
	}

}
