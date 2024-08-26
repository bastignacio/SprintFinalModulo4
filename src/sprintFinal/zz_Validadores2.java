package sprintFinal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class zz_Validadores2 {

	// ----------------------------- Declaraciones utiles Globales	// ----------------------------- //

	Boolean verificador = false;
	Scanner leer = new Scanner(System.in);
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

	// ----------------------------- Refactorización -----------------------------
	// ----------------------------- Refactorización -----------------------------
	// ----------------------------- Refactorización -----------------------------


	public String validadorCadena10a50() {

		while (!verificador) {

			String cadena10a50c = leer.nextLine();

			if (cadena10a50c.length() < 10 || cadena10a50c.length() > 50) {
				System.out.println("Error, el valor ingresado está fuera de parametros.");
				System.out.println("La longitud debe ser entre 10 a 50 caracteres.");
			} else {
				verificador = true;
				return cadena10a50c;
			}

		}

		return null;
	}

	public LocalDate validadorFechaFormato() {

		while (!verificador) {

			String fechaNEW = leer.nextLine();

			try {
				LocalDate fecha = LocalDate.parse(fechaNEW, formatoFecha);
				verificador = true;
				return fecha;

			} catch (DateTimeParseException e) {
				// Manejar la excepción si la fecha es inválida
				System.out.println("Fecha inválida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.");
			}
		}
		return null;
	}

	public LocalTime validadorHoraFormato() {

		while (!verificador) {

			String horaNEW = leer.nextLine();

			try {
				LocalTime hora = LocalTime.parse(horaNEW, formatoHora);
				verificador = true;
				return hora;

			} catch (DateTimeParseException e) {
				// Manejar la excepción si la fecha es inválida
				System.out.println("Formato de hora inválido. \nPor favor ingrese una hora en el formato HH:mm");
			}
		}

		return null;
	}

	public int validadorRUTRUN() {

		while (!verificador) {

			int RunRut = leer.nextInt();
			leer.nextLine();

			if (RunRut < 999999 || RunRut > 100000000) {

				System.out.println("El valor ingresado es incorrecto.");
				System.out.println(
						"Debe ser un valor entre 1.000.000 y 100.000.000 (sin puntos, ni guión ni digito verificador).");

			} else {
				verificador = true;
				return RunRut;
			}
		}

		return 999;
	}

	public String validadorCadena0a100() {

		while (!verificador) {

			String cadena0a100 = leer.nextLine();

			if (cadena0a100.length() < 0 || cadena0a100.length() > 100) {
				System.out.println("Error, el valor ingresado está fuera de parametros.");
				System.out.println("La longitud debe ser entre 1 a 100 caracteres.");

			} else {
				verificador = true;
				return cadena0a100;
			}
		}
		return null;
	}

	public int validadorID() {

		while (!verificador) {

			int id = leer.nextInt();
			leer.nextLine();

			String idStr = String.valueOf(id);

			if (idStr.length() < 0) {
				System.out.println("Error, el valor ingresado está fuera de parametros.");
				System.out.println("El identificador debe tener a lo menos 1 caracter.");
			} else {
				verificador = true;
				return id;
			}
		}
		return 999;
	}

	public String validadorCadena5a30() {

		String cadena5a30 = leer.nextLine();

		if (cadena5a30.length() < 5 || cadena5a30.length() > 30) {
			System.out.println("Error, el valor ingresado está fuera de parametros.");
			System.out.println("La longitud debe ser entre 5 a 30 caracteres.");
		} else {
			verificador = true;
			return cadena5a30;
		}

		return null;
	}

	public long validadorTelefono() {

		while (!verificador) {

			long telefono = leer.nextLong();

			if (telefono < 9999999999L || telefono > 100000000000L) {

				System.out.println("Teléfono inválido, por favor ingresarlo de nuevo.");
				System.out.println("Formato de ingreso 56912345678");

			} else {

				verificador = true;
				return telefono;
			}

		}
		return 0;
	}

	public String validadorSistemaSalud() {

		String sistemaSalud = null;

		while (!verificador) {

			int sistemaSaludInt = leer.nextInt();
			leer.nextLine();

			if (sistemaSaludInt < 0 || sistemaSaludInt > 2) {
				System.out.println("El valor ingresado no es correcto");
				System.out.println("Debe ingresar 1 (Fonasa) o 2 (Isapre)");

			} else {

				switch (sistemaSaludInt) {
				case 1:
					sistemaSalud = "Fonasa";
					break;
				case 2:
					sistemaSalud = "Isapre";
					break;
				}

				return sistemaSalud;
			}
		}
		return null;
	}

	public String validadorDias() {

		while (!verificador) {

			String dia = leer.nextLine();

			if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") || dia.equalsIgnoreCase("miercoles")
					|| dia.equalsIgnoreCase("jueves") || dia.equalsIgnoreCase("viernes")
					|| dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo")) {

				verificador = true;
				return dia;

			} else {
				System.out.println("El día ingresado está fuera de rango");
				System.out.println("Debe ingresar el nombre del día, de lunes a domingo.");
			}
		}
		return null;
	}

	public String validadorCadena0a70() {

		while (!verificador) {

			String cadena0a70 = leer.nextLine();

			if (cadena0a70.length() < 1 || cadena0a70.length() > 70) {
				System.out.println("Error, el valor ingresado está fuera de parametros.");
				System.out.println("La longitud debe ser entre 1 a 70 caracteres.");
			} else {
				verificador = true;
				return cadena0a70;
			}
		}
		return null;
	}

	public String validadorArea() {

		while (!verificador) {

			String area = leer.nextLine();

			if (area.length() < 5 || area.length() > 20) {
				System.out.println("Error, el valor ingresado está fuera de parametros.");
				System.out.println("La longitud debe ser entre 5 a 20 caracteres.");
			} else {
				verificador = true;
				return area;
			}
		}
		return null;
	}

	public int validadorEdad() {

		int edad = leer.nextInt();
		leer.nextLine();

		if (edad < 0 || edad > 150) {
			System.out.println("El valor ingresado no es correcto");
			System.out.println("Debe ingresar una edad entre 0 y 150 años.");

		} else {

			verificador = true;
			return edad;

		}

		return 999;
	}

	public String validadorAfp() {

		while (!verificador) {

			String afp = leer.nextLine();

			if (afp.length() < 4 || afp.length() > 30) {
				System.out.println("la AFP está fuera de los parámetros permitidos.");
				System.out.println("Debe ser contener entre 3 a 30 caracteres.");

			} else {
				verificador = true;
				return afp;
			}
		}

		return null;
	}

	public String validadorComuna() {

		while (!verificador) {

			String comuna = leer.nextLine();

			if (comuna.length() < 1 || comuna.length() > 50) {
				System.out.println("La comuna está fuera de los parámetros permitidos");
				System.out.println("Debe ser contener máximo 50 caracteres.");

			} else {
				verificador = true;
				return comuna;
			}

		}
		return null;
	}

	public int validadorCantAsistentes() {

		while (!verificador) {

			int cantAsistentes = leer.nextInt();
			leer.nextLine();

			if (cantAsistentes < 0 || cantAsistentes > 100) {
				System.out.println("Valor ingresado incorrecto.");
				System.out.println("La cantidad de asistentes debe estar entre 1 y 100.");
			} else {
				verificador = true;
				return cantAsistentes;
			}
		}
		return 999;
	}

	public String validadorAprobacion() {

		String aprobacionTexto = null;

		while (!verificador) {

			int aprobacion = leer.nextInt();
			leer.nextLine();

			if (aprobacion == 1 || aprobacion == 2 || aprobacion == 3) {

				switch (aprobacion) {
				case 1:
					aprobacionTexto = "Sin problemas";
					break;
				case 2:
					aprobacionTexto = "Con observaciones";
					break;
				case 3:
					aprobacionTexto = "No aprueba";
					break;
				}

				verificador = true;
				return aprobacionTexto;

			}
		}
		return null;
	}

}
