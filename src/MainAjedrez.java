import java.util.Scanner;

public class MainAjedrez {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Torneo open_donostia = new Torneo("Open Donostia");
		
		final int A�ADIR_EQUIPO = 1;
		final int A�ADIR_JUGADOR = 2;
		final int SALIR = 3;
		
		
		
		int opcion = 0;
		do{
			System.out.println("------MENU DEL TORNEO --------");
			System.out.println(A�ADIR_EQUIPO + ". A�adir un equipo al torneo.");
			System.out.println(SALIR + ". Salir del programa");
			
			opcion = Integer.parseInt(lector.nextLine());
			
			switch (opcion) {
			case A�ADIR_EQUIPO:
				
				break;
				
			case SALIR:

			default:
				break;
			}
			
		}
		while(opcion != SALIR);
		
		

	}

}
