package sprintFinal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Validadores {

	// ----------------------------- Declaraciones útiles Globales //
	// ----------------------------- //

	Scanner leer = new Scanner(System.in);
	private DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

	// ----------------------------- Refactorización -----------------------------//

	// Método genérico para validar la longitud de una cadena

	private String validadorCadena(int minLength, int maxLength, String mensajeError) {
		while (true) {
			String input = leer.nextLine();
			if (input.length() >= minLength && input.length() <= maxLength) {
				return input;
			} else {
				System.out.println(mensajeError);
			}
		}
	}

	public String validadorCadena10a50() {
		return validadorCadena(10, 50, "La longitud debe ser entre 10 y 50 caracteres.");
	}

	public String validadorCadena5a30() {
		return validadorCadena(5, 30, "La longitud debe ser entre 5 y 30 caracteres");
	}

	public String validadorCadena1a100() {
		return validadorCadena(1, 100, "La longitud debe ser entre 1 y 100 caracteres");
	}

	public String validadorArea() {
		return validadorCadena(5, 20, "La longitud debe ser entre 5 y 20 caracteres");
	}

	public String validadorDireccion() {
		return validadorCadena(1, 70, "La longitud debe ser entre 1 y 70 caracteres.");
	}

	public LocalDate validadorFecha() {
		while (true) {
			System.out.println("Formato de ingreso de fecha DD/mm/aaa");
			String fechaInput = leer.nextLine();
			try {
				return LocalDate.parse(fechaInput, formatoFecha);
			} catch (DateTimeParseException e) {
				System.out
						.println("Formato de fecha inválido. Por favor, ingrese una fecha en el formato (dd/MM/aaaa)");
			}
		}
	}

	public LocalTime validadorHora() {
		while (true) {
			String horaInput = leer.nextLine();
			try {
				return LocalTime.parse(horaInput, formatoHora);
			} catch (DateTimeParseException e) {
				System.out.println("Formato de hora inválido. Por favor, ingrese una hora en el formato HH:mm");
			}
		}
	}

	public int validadorEdad() {
		LocalDate fechaNacimiento = validadorFecha();
		LocalDate fechaHoy = LocalDate.now();
		int edad = fechaHoy.getYear() - fechaNacimiento.getYear();

		if (fechaHoy.getMonthValue() < fechaNacimiento.getMonthValue()
				|| (fechaHoy.getMonthValue() == fechaNacimiento.getMonthValue()
						&& fechaHoy.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
			edad--;
		}

		return edad;
	}

	public String validadorAfp() {
		return validadorCadena(4, 30, "La AFP debe contener entre 4 y 30 caracteres.");
	}

	public String validadorComuna() {
		return validadorCadena(1, 50, "La comuna debe contener entre 1 y 50 caracteres.");
	}

	public int validadorCantAsistentes() {
		while (true) {
			System.out.println("Ingrese la cantidad de asistentes: ");
			int cantAsistentes = leer.nextInt();
			leer.nextLine(); // Limpia el buffer
			if (cantAsistentes >= 1 && cantAsistentes <= 100) {
				return cantAsistentes;
			} else {
				System.out.println("La cantidad de asistentes debe estar entre 1 y 100.");
			}
		}
	}

	public String validadorAprobacion() {
		while (true) {
			int aprobacion = leer.nextInt();
			leer.nextLine(); // Limpia el buffer
			switch (aprobacion) {
			case 1:
				return "Sin problemas";
			case 2:
				return "Con observaciones";
			case 3:
				return "No aprueba";
			default:
				System.out.println("Opción inválida. Seleccione 1, 2, o 3.");
			}
		}
	}

	public String validadorSistemaSalud() {
		while (true) {
			System.out.println("Ingrese el sistema de salud: 1 para Fonasa, 2 para Isapre");
			int opcion = leer.nextInt();
			leer.nextLine(); // Limpia el buffer
			switch (opcion) {
			case 1:
				return "Fonasa";
			case 2:
				return "Isapre";
			default:
				System.out.println("Opción inválida. Debe ser 1 para Fonasa o 2 para Isapre.");
			}
		}
	}

	public int convertirDuracionAMinutos() {
		LocalTime duracion = validadorHora();

		int minutosTotales = duracion.getHour() * 60 + duracion.getMinute();

		return minutosTotales;
	}

	public int validadorRUTRUN() {
		while (true) {
			System.out.println("Formato de ingreso del Run/Rut sin puntos ni digito verificador.");
			int runRut = leer.nextInt();
			leer.nextLine(); // Limpia el buffer

			if (runRut >= 1000000 && runRut <= 99999999) {
				return runRut;
			} else {
				System.out.println("El valor ingresado es incorrecto.");
				System.out.println(
						"Debe ser un valor entre 1.000.000 y 99.999.999 (sin puntos, ni guión ni dígito verificador).");
			}
		}
	}

	public int validadorID() {
		while (true) {
			int id = leer.nextInt();
			leer.nextLine(); // Limpia el buffer

			if (id > 0) {
				return id;
			} else {
				System.out.println("El valor ingresado es incorrecto.");
				System.out.println("El ID ingresado debe ser un número positivo con al menos 1 dígito.");
			}
		}
	}

	public long validadorTelefono() {
		while (true) {
			System.out.print("Ingrese el teléfono (formato: 56912345678): ");
			long telefono = leer.nextLong();
			leer.nextLine(); // Limpiar el buffer

			if (telefono >= 10000000000L && telefono <= 99999999999L) {
				return telefono;
			} else {
				System.out.println("Teléfono inválido, por favor ingresarlo de nuevo.");
				System.out.println("Formato de ingreso 56912345678");
			}
		}
	}

	public int validadorEdadIngresada() {
		while (true) {
			System.out.println("Ingrese la edad: ");
			int edadIngresada = leer.nextInt();
			leer.nextLine();

			if (edadIngresada < 0 || edadIngresada > 150) {
				System.out.println("El valor ingresado no es correcto");
				System.out.println("Debe ingresar una edad entre 0 y 150 años.");

			} else {

				return edadIngresada;
			}
		}
	}

	public String validadorDias() {
		while (true) {
			System.out.print("Ingrese un día de la semana (de lunes a domingo): ");
			String dia = leer.nextLine().trim().toLowerCase();

			switch (dia) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "miércoles":
			case "jueves":
			case "viernes":
			case "sabado":
			case "sábado":
			case "domingo":
				return dia.substring(0, 1).toUpperCase() + dia.substring(1);
			default:
				System.out.println("El día ingresado está fuera de rango.");
				System.out.println("Debe ingresar el nombre del día, de lunes a domingo.");
			}
		}
	}

}
