/*
 * import java.util.Scanner;
 * 
 * public class Principal {
 * 
 * public static void main(String[] args) { Contenedor contenedor = new
 * Contenedor(); Scanner scanner = new Scanner(System.in); int opcion;
 * 
 * do { System.out.println("Menú Principal:");
 * System.out.println("1. Almacenar cliente");
 * System.out.println("2. Almacenar profesional");
 * System.out.println("3. Almacenar administrativo");
 * System.out.println("4. Almacenar capacitación");
 * System.out.println("5. Eliminar usuario por RUN");
 * System.out.println("6. Listar usuarios");
 * System.out.println("7. Listar usuarios por tipo");
 * System.out.println("8. Listar capacitaciones");
 * System.out.println("9. Salir"); System.out.print("Seleccione una opción: ");
 * opcion = scanner.nextInt(); scanner.nextLine(); // Limpiar el buffer
 * 
 * switch (opcion) { case 1: // Lógica para almacenar un cliente // Cliente
 * cliente = new Cliente(...); // contenedor.almacenarCliente(cliente); break;
 * case 2: // Lógica para almacenar un profesional // Profesional profesional =
 * new Profesional(...); // contenedor.almacenarProfesional(profesional); break;
 * case 3: // Lógica para almacenar un administrativo // Administrativo
 * administrativo = new Administrativo(...); //
 * contenedor.almacenarAdministrativo(administrativo); break; case 4: // Lógica
 * para almacenar una capacitación // Capacitacion capacitacion = new
 * Capacitacion(...); // contenedor.almacenarCapacitacion(capacitacion); break;
 * case 5: System.out.print("Ingrese el RUN del usuario a eliminar: "); String
 * run = scanner.nextLine(); contenedor.eliminarUsuario(run); break; case 6:
 * contenedor.listarUsuarios(); break; case 7: System.out.
 * println("Ingrese el tipo de usuario: 1. Cliente, 2. Profesional, 3. Administrativo"
 * ); int tipo = scanner.nextInt(); if (tipo == 1) {
 * contenedor.listarUsuariosPorTipo(Cliente.class); } else if (tipo == 2) {
 * contenedor.listarUsuariosPorTipo(Profesional.class); } else if (tipo == 3) {
 * contenedor.listarUsuariosPorTipo(Administrativo.class); } break; case 8:
 * contenedor.listarCapacitaciones(); break; case 9:
 * System.out.println("Saliendo del programa..."); break; default:
 * System.out.println("Opción incorrecta. Intente nuevamente."); break; }
 * 
 * } while (opcion != 9);
 * 
 * scanner.close(); } }
 */