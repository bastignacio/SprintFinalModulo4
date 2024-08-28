package sprintFinal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author BastianEspinosa
 * @version 2.0
 * @since 27/08/2024
 */

public class Main {

	/**
	 * En la clase principal solo se mostrará el menú de operaciones y los
	 * parámetros para agregar los datos necesarios llamando a las diferentes clases
	 * y métodos.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Contenedor contenedor = new Contenedor();
		Validadores validadores = new Validadores();
		int opcion = 0;

		do {
			System.out.println("\n[----------- Menú Principal -----------]");
			System.out.println("[       1. Almacenar Cliente           ]");
			System.out.println("[       2. Almacenar Profesional       ]");
			System.out.println("[       3. Almacenar Administrativo    ]");
			System.out.println("[       4. Almacenar Capacitación      ]");
			System.out.println("[       5. Eliminar usuario por RUN    ]");
			System.out.println("[       6. Listar usuarios             ]");
			System.out.println("[       7. Listar usuarios por tipo    ]");
			System.out.println("[       8. Listar capacitaciones       ]");
			System.out.println("[       9. Salir                       ]");
			System.out.println("[--------------------------------------]\n");
			System.out.print("Seleccione una opción numérica: ");

			try {
				opcion = leer.nextInt();
				leer.nextLine();

				switch (opcion) {
				case 1:
					agregarCliente(validadores, contenedor);
					break;
				case 2:
					agregarProfesional(validadores, contenedor);
					break;
				case 3:
					agregarAdministrativo(validadores, contenedor);
					break;
				case 4:
					agregarCapacitacion(validadores, contenedor);
					break;
				case 5:
					System.out.print("Ingrese el RUN del usuario a eliminar: ");
					String run = leer.nextLine();
					contenedor.eliminarUsuario(run);
					break;
				case 6:
					contenedor.listarUsuarios();
					break;
				case 7:
					System.out.println("Ingrese el tipo de usuario (Valor numerico)");
					System.out.println("[1] Cliente");
					System.out.println("[2] Profesional");
					System.out.println("[3] Administrativo");
					int tipo = leer.nextInt();
					if (tipo == 1) {
						contenedor.listarUsuariosPorTipo(Cliente.class);
					} else if (tipo == 2) {
						contenedor.listarUsuariosPorTipo(Profesional.class);
					} else if (tipo == 3) {
						contenedor.listarUsuariosPorTipo(Administrativo.class);
					}
					break;
				case 8:
					contenedor.listarCapacitaciones();
					break;
				case 9:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción incorrecta. Intente nuevamente.");
					break;
				}
			} catch (InputMismatchException e) {
				/**
				 * Si el usuario ingresa un valor diferente a un número java arrojará un error y
				 * se imprimirá por pantalla que el dato ingresado debe ser un número.
				 */
				System.out.println("\n ###### Error ###### Debe ingresar un número válido.");
				leer.nextLine();
			}

		} while (opcion != 9);

		leer.close();
	}

	/**
	 * Se utiliza la clase Validadores y Contenedor, con la finalidad de separar la
	 * lógica de validación en clases diferentes y no sobrecargar el Main.
	 * 
	 * @param validadores Se definieron diferentes validadores según la logica que
	 *                    se requiera.
	 * @param contenedor  "Contiene" los métodos que se utilizan principalmente en
	 *                    el menú de opciones.
	 */
	private static void agregarCapacitacion(Validadores validadores, Contenedor contenedor) {

		System.out.println("Ingrese los datos de la Capacitación: ");

		System.out.println("Ingrese el ID de la Capacitación (númerico):  ");
		int identificador = validadores.validadorID();
		System.out.println("Ingrese el RUN del Cliente: ");
		int rut = validadores.validadorRUTRUN();

		String diaSemana = validadores.validadorDias();

		System.out.println("Ingrese la Hora a la que se realizará la Capacitación (HH:mm)");
		LocalTime hora = validadores.validadorHora();

		System.out.println("Ingrese el lugar de la Capacitación: ");
		String lugar = validadores.validadorCadena10a50();

		System.out.println("Ingrese la duración de la capacitacion (HH:mm) ");
		LocalTime duracion = validadores.validadorHora();

		int cantidadAsistentes = validadores.validadorCantAsistentes();

		/**
		 * Los datos devueltos a través de la verificación de Validadores se almacenan
		 * en las variables definidas en este método y se almacenan en los listados de
		 * cada clase.
		 */

		Capacitacion newCapacitacion = new Capacitacion(identificador, rut, diaSemana, hora, lugar, duracion,
				cantidadAsistentes);

		contenedor.almacenarCapacitacion(newCapacitacion);
		
		System.out.println("Capacitación agregada exitosamente.");

	}

	private static void agregarAdministrativo(Validadores validadores, Contenedor contenedor) {

		System.out.println("Ingrese los datos del Administrativo: ");

		System.out.println("Ingrese el Nombre de Usuario del Administrativo: ");
		String nombre = validadores.validadorCadena10a50();

		System.out.println("Ingrese la Fecha de Nacimiento del Administrativo: ");
		LocalDate fechaNacimiento = validadores.validadorFecha();

		System.out.println("Ingrese el RUN del Administrativo: ");
		int run = validadores.validadorRUTRUN();

		System.out.println("Ingrese el área de trabajo: ");
		String area = validadores.validadorArea();

		System.out.println("Ingrese la experiencia previa de trabajo: ");
		String experienciaPrevia = validadores.validadorCadena1a100();

		Administrativo newAdministrativo = new Administrativo(nombre, fechaNacimiento, run, area, experienciaPrevia);

		contenedor.almacenarAdministrativo(newAdministrativo);
		System.out.println("Administrativo agregado exitosamente.");

	}

	private static void agregarProfesional(Validadores validadores, Contenedor contenedor) {

		System.out.println("Ingrese los datos del profesional: ");

		System.out.println("Ingrese el Nombre de Usuario del Profesional: ");
		String nombre = validadores.validadorCadena10a50();

		System.out.println("Ingrese la Fecha de Nacimiento del Profesional: ");
		LocalDate fechaNacimiento = validadores.validadorFecha();

		System.out.println("Ingrese el RUN del Profesional: ");
		int run = validadores.validadorRUTRUN();

		System.out.println("Ingrese el título: ");
		String titulo = validadores.validadorCadena10a50();

		System.out.println("Introduzca la fecha de ingreso: ");
		LocalDate fechaIngreso = validadores.validadorFecha();

		Profesional newProfesional = new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngreso);
		contenedor.almacenarProfesional(newProfesional);

		System.out.println("Profesional agregado exitosamente.");

	}

	private static void agregarCliente(Validadores validadores, Contenedor contenedor) {

		System.out.println("Ingrese los datos del cliente: ");

		System.out.println("Ingrese el Nombre de Usuario del Ciente: ");
		String nombre = validadores.validadorCadena10a50();

		System.out.println("Ingrese la Fecha de Nacimiento del Cliente: ");
		LocalDate fechaNacimiento = validadores.validadorFecha();

		System.out.println("Ingrese el RUN del Cliente: ");
		int run = validadores.validadorRUTRUN();

		System.out.println("Ingrese el RUT del cliente: ");
		int rut = validadores.validadorRUTRUN();

		System.out.println("Ingrese los Nombres: ");
		String nombres = validadores.validadorCadena5a30();

		System.out.println("Ingrese los Apellidos: ");
		String apellidos = validadores.validadorCadena5a30();

		long telefono = validadores.validadorTelefono();
		System.out.println("Ingrese el tipo de AFP: ");

		String afp = validadores.validadorAfp();
		String sistemaSalud = validadores.validadorSistemaSalud();

		System.out.println("Ingrese la Dirección ");
		String direccion = validadores.validadorDireccion();

		System.out.println("Ingrese la Comuna: ");
		String comuna = validadores.validadorComuna();

		int edad = validadores.validadorEdadIngresada();

		Cliente nuevoCliente = new Cliente(nombre, fechaNacimiento, run, rut, nombres, apellidos, telefono, afp,
				sistemaSalud, direccion, comuna, edad);

		contenedor.almacenarCliente(nuevoCliente);

		System.out.println("Cliente agregado exitosamente.");

	}

}