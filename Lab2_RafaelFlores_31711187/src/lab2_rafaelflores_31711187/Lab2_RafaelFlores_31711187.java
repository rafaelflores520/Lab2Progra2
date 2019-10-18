/*
    Rafael Flores - Lab 2
 */
package lab2_rafaelflores_31711187;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab2_RafaelFlores_31711187 {
    public static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean log = false;
        ArrayList<Universidad> registro = new ArrayList<>();
        int pos;
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
                        registro.add(Agregar());
                        break;
                    case 2:
                        if (registro.isEmpty()) {
                            System.out.println("No hay nada que mostrar!");
                        }else{
                            Listar(registro);
                            System.out.println("Ingrese la posición a eliminar: ");
                            pos = read.nextInt();
                            if (pos < 0 || pos > registro.size() - 1) {
                                System.out.println("Abortando! Debe ingresar una posición válida");
                            } else {
                                Eliminar(registro, pos);
                            }
                        }
                        break;
                    case 3:
                        if (!log) {
                            System.out.println("Ingrese su usuario: ");
                            String user = read.next();
                            System.out.println("Ingrese su contraseña: ");
                            String pass = read.next();
                            if (user.equals("leobanegas") && pass.equals("99")) {
                                System.out.println("Bienvenido a la Sistema de Gestión de Universidades Leonardo!");
                            } else {
                                System.out.println("Su usuario o contraseña son incorrectos!");
                            }
                            log = true;
                        }else{
                            System.out.println("Usted ya está logueado!!!");
                        }
                        break;
                    case 4:
                        if (registro.isEmpty()) {
                            System.out.println("No hay nada que mostrar!");
                        }else{
                            System.out.println("Algo");
                        }
                        break;
                    case 5:
                        if (registro.isEmpty()) {
                            System.out.println("No hay nada que mostrar!");
                        }else{
                            Listar(registro);
                        }
                        break;
                    case 6:
                        if (registro.isEmpty()) {
                            System.out.println("No hay nada que mostrar!");
                        }else{
                            Listar(registro);
                            System.out.println("Ingrese la posición a modificar: ");
                            pos = read.nextInt();
                            if (pos < 0 || pos > registro.size() - 1) {
                                System.out.println("Abortando! Debe ingresar una posición válida");
                            } else {
                                System.out.println("Ingrese el número de lo que desea modificar:"
                                        + "\n\t 1. Nombre de la Universida"
                                        + "\n\t 2. Nombre del Rector"
                                        + "\n\t 3. Sucursal"
                                        + "\n\t 4. Año de Creación"
                                        + "\n\t 5. Número de Maestros"
                                        + "\n\t 6. Numero de Estudiantes");
                                int modOp = read.nextInt();
                                Modificar(registro, pos, modOp);
                                System.out.println("Su Modificación fue exitosa!");
                            }
                        }
                        break;
                    case 7:
                        if (registro.isEmpty()) {
                            System.out.println("No hay nada que mostrar!");
                        }else{
                            System.out.println("Algo");
                        }
                        break;
                    case 8:
                        if (registro.isEmpty()) {
                            System.out.println("No hay nada que mostrar!");
                        }else{
                            System.out.println("Algo");
                        }
                        break;
                }
            }
        }
    }
    
    public static Universidad Agregar(){
        Universidad u = new Universidad();
        System.out.println("Ingrese el nombre de la universidad: ");
        u.setNombre(read.next());
        System.out.println("Ingrese el nombre del rector de la universidad: ");
        u.setNombreRector(read.next());
        System.out.println("Ingrese la sucursal de la universidad: ");
        u.setSucursal(read.next());
        int nums;
        do {            
            System.out.println("Ingrese el año de creación de la Universidad: ");
            nums = read.nextInt();
            if (nums > 2019) {
                System.out.println("Debe ingresar menor que el año actual!");
            }else{
                u.setAñoCreacion(nums);
            }
        } while (nums > 2019);
        do {            
            System.out.println("Ingrese el número de maestros en la Universidad: ");
            nums = read.nextInt();
            if (nums < 1) {
                System.out.println("Debe existir al menos un maestro!");
            }else{
                u.setNumMaestro(nums);
            }
            
        } while (nums < 1);
        do {            
            System.out.println("Ingrese el número de estudiantes en la Universidad: ");
            nums = read.nextInt();
            if (nums < 1) {
                System.out.println("Debe existir al menos un estudiante!");
            }else{
                u.setNumEstudiante(nums);
            }
        } while (nums < 1);
        byte flag = 0;
        do {            
            System.out.println("Ingrese el nivel de la Universidad: "
                    + "\n\t1. Privada"
                    + "\n\t2. Pública");
            nums = read.nextInt();
            if (nums < 1 || nums > 2) {
                System.out.println("Debe escoger entre las opciones existentes!");
            }else{
                if (nums == 1) {
                    u.setNivel("Privada");
                }else{
                    u.setNivel("Publica");
                }
                flag = 1;
            }
        } while (flag == 0);
        u.AddCosto();
        return u;
    }
    
    public static void Listar(ArrayList<Universidad> temp){
        System.out.println("Listando Universidades...");
        System.out.println("+------+-----------+-----------+----------+-------+-------------+----------------+---------+----------------------+");
        System.out.println("| Pos. | Nombre U. | Nombre R. | Sucursal | Año C.| N. Maestros | N. Estudiantes |  Costo  |         Nivel        |");
        System.out.println("+------+-----------+-----------+----------+-------+-------------+----------------+---------+----------------------+");
        for (int i = 0; i < temp.size(); i++) {
            System.out.print("|  "+i+"   "+temp.get(i).toString()+"\n");
            System.out.print("+------+-----------+-----------+----------+-------+-------------+----------------+---------+----------------------+\n");
        }
    }
    
    public static void Eliminar(ArrayList<Universidad> temp, int pos){
        temp.remove(pos);
        System.out.println("El registro se elimino con éxito!");
    }
    
    public static void Modificar(ArrayList<Universidad> temp, int pos, int op){
        switch(op){
            case 1:
                System.out.println("Ingrese el nuevo Nombre de la Universidad");
                temp.get(pos).setNombre(read.next());
                break;
            case 2:
                System.out.println("Ingrese el nuevo nombre del Rector de la Universidad");
                temp.get(pos).setNombreRector(read.next());
                break;
            case 3:
                System.out.println("Ingrese la nueva Sucursal de la Universidad");
                temp.get(pos).setSucursal(read.next());
                break;
            case 4:
                System.out.println("Ingrese el nuevo Año de creación de la Universidad");
                temp.get(pos).setAñoCreacion(read.nextInt());
                break;
            case 5:
                System.out.println("Ingrese la nueva cantidad de Maestros de la Universidad");
                temp.get(pos).setNumMaestro(read.nextInt());
                break;
            case 6:
                System.out.println("Ingrese la nueva cantidad de Alumnos de la Universidad");
                temp.get(pos).setNumEstudiante(read.nextInt());
                break;
        }
    }
    
}
