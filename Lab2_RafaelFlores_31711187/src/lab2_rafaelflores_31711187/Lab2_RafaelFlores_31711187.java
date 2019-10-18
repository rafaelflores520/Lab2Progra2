/*
    Rafael Flores - Lab 2
 */
package lab2_rafaelflores_31711187;
import java.util.Scanner;

public class Lab2_RafaelFlores_31711187 {
    public static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean log = false;
        while (true) {            
            System.out.println("¡Bienvenido!");
            System.out.println("Ingrese la opción de su elección:"
                    + "\n\t 1. Crear Universidad"
                    + "\n\t 2. Eliminar Universidad"
                    + "\n\t 3. Log In"
                    + "\n\t 4. Ascender Universidad"
                    + "\n\t 5. Listar Universidad y su Sucursal"
                    + "\n\t 6. Modificar"
                    + "\n\t 7. Descender Universidad"
                    + "\n\t 8. Random"
                    + "\n\t 0. Salir");
            int op = read.nextInt();
            if (op == 0) {
                System.exit(0);
            }
            if (!log && (op != 3)) {
                System.out.println("Debe logearse primero, antes de usar el progrma");
            }else{
                switch(op){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        if (!log) {
                            System.out.println("Ingrese su usuario: ");
                            String user = read.next();
                            System.out.println("Ingrese su contraseña: ");
                            String pass = read.next();
                            if (user.equals("leobanegas") && pass.equals("99")) {
                                System.out.println("Bienvenido a la Sistema de Gestión de Uniersidades Leonardo!");
                            } else {
                                System.out.println("Su usuario o contraseña son incorrectos!");
                            }
                            log = true;
                        }else{
                            System.out.println("Usted ya está logueado!!!");
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                }
            }
        }
    }
    
}
