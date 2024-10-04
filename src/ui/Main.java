package ui;

import java.util.Scanner;
import model.Controller;

public class Main {

	// Atributos de la clase Ejecutable
	private Scanner reader;
	private Controller cont;
	private static boolean flag;

	private Main() {
		reader = new Scanner(System.in);
		cont = new Controller();
	}
	
	

	public void run(boolean flag)
	{

		flag = false;

		while (!flag) {

			System.out.println("\n \n Bienvenido al menu:\n");
			System.out.println("Opciones:\n" + "1. 1. Registrar voluntarios y rutas ecológicas \n" + "2. Registrar un lugar con diversidad biológica\n"
					+ "3. Agregar una especie a un lugar \n" + "4. Consultar comunidades con problemas de hospital o escuela \n" + "5. Consultar lugar con mayor cantidad de especies \n" + "6. Salir del programa \n");

			int option = reader.nextInt();

			reader.nextLine();

			switch (option) {
					case 1:
						gestionarRutas();
						break;
					case 2:
						GestionarLugaresBiodiversos();
						break;
					case 3:
						crearSemestreAEstudiante();
						break;
					case 4:
						imprimirSemestresDeEstudiante();
						break;
                    case 5:
                        crearSemestreAEstudiante(); 
                        break; 
					case 6:
						flag = true;
						System.exit(0);
						break;
					default:
						System.out.print("Por favor ingrese una opcion valida");
						continue;
			}

		}

	}

	public static void main(String[] args) {
		Executable mainApp = new Executable();
		mainApp.run(flag);
	}
}




