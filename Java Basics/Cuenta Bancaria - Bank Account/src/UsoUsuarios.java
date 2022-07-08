import java.util.Scanner;

public class UsoUsuarios {
	
	private static final Scanner entrada = new Scanner(System.in);
	
	private static Usuario nuevoUsuario = new Usuario();
	private static String nombreUsuario = "";
	private static String edad = "";
	private static byte edadNum = -1;
	private static String dni = "";
	private static boolean usuarioOk = false;
	
	private static void pedirDatos() {
		usuarioOk = false;
		
		do {
			System.out.println("Introduce el nombre del usuario");
			nombreUsuario = entrada.nextLine().toUpperCase();
		} while (nombreUsuario.isEmpty());
			nuevoUsuario.setNombre(nombreUsuario);
		do {
			System.out.println("Introduce la edad del usuario");
			edad = entrada.nextLine();
			try {
				edadNum = Byte.parseByte(edad);
				nuevoUsuario.setEdad(edadNum);
			} catch (NumberFormatException e) {
				System.out.println("La edad númerica y mayor que cero");
				}
			} while (edad.isEmpty() || edadNum <= 0);
		
		do {
			System.out.println("Introduce el DNI del usuario");
			dni = entrada.nextLine().toUpperCase();
			
			if(nuevoUsuario.setDNI(dni)) {
				nuevoUsuario.setDNI(dni);
			} else {
				System.out.println("El DNI no es correcto " + "Vuelva a introducirlo");
			}
		} while(dni.isEmpty() || nuevoUsuario.setDNI(dni) == false);
		usuarioOk = true;
	}
	
	private static String opcion = "";
	private static byte numeroOpcion = -1;
	
	private static void mostrarMenu() {
		
	
		System.out.println("Realiza una nueva acción");
		System.out.println("1 Introduce un nuevo gasto");
		System.out.println("2 Introduce un nuevo ingreso");
		System.out.println("3 Mostrar gasto");
		System.out.println("4 Mostrar ingreso");
		System.out.println("5 Mostrar saldo");
		System.out.println("0 Salir");
	
		opcion = entrada.nextLine();
		numeroOpcion = Byte.parseByte(opcion);

}
	
	private static Cuenta nuevaCuenta = null;
	private static String importe = "";
	private static double importeTotal = 0;
	private static String descripcion = "";
	
	
	private static void introducirGastos() {
		importe = "";
		descripcion = "";
		importeTotal = 0;
		
		System.out.println("Introduce el concepto del gasto: ");
		descripcion = entrada.nextLine();
		
		System.out.print("Introduce el importe del gasto: ");
        importe = entrada.nextLine();
        
        importeTotal=Double.parseDouble(importe);
        
        
        	if(nuevaCuenta.getSaldo() < importeTotal || nuevaCuenta.getSaldo() == 0){
        
        		System.out.println("Debes realizar primero un ingreso para "
                    + "registrar un gasto");
        	}
        	else{
        		nuevaCuenta.addGastos(descripcion, importeTotal);
 
        		System.out.println("Gasto registrado correctamente.");  
        }
    }
	
	private static void introducirIngresos() {
		importe = "";
		descripcion = "";
		importeTotal = 0;
		
		System.out.print("Introduce la descripcion ");
        descripcion = entrada.nextLine();
        
		System.out.print("Introduce la cantidad ");
        importe = entrada.nextLine();
        
        importeTotal=Double.parseDouble(importe);
        
        nuevaCuenta.addIngresos(descripcion, importeTotal);
        System.out.println("Ingreso registrado correctamente");
	}
	
	private static void mostrarGastos() {
		for(int x=0;x < nuevaCuenta.getGastos().size(); x++){
            System.out.println(nuevaCuenta.getGastos().get(x).toString());
		}
	}
	
	private static void mostrarIngresos() {
		for(int x=0;x < nuevaCuenta.getIngresos().size(); x++){
            System.out.println(nuevaCuenta.getIngresos().get(x).toString());
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 do {
			 pedirDatos();
		 
		    } while(usuarioOk=false);
	     
	     nuevaCuenta = new Cuenta(nuevoUsuario);
		
		do {
			mostrarMenu();
			
		switch (numeroOpcion) {
		case 0:
			System.out.println("Programa finalizado");
			break;
		case 1:
			introducirGastos();
			break;
		case 2:
			introducirIngresos();
			break;
		case 3:
			mostrarGastos();
			break;
		case 4:
			mostrarIngresos();
			break;
		 case 5: 
             System.out.println(nuevaCuenta.toString());
             break;
		default:
			System.out.println("Introduce el valor correcto");
			break;
		}
		} while (numeroOpcion != 0);
		
		
		entrada.close();
	}

}
