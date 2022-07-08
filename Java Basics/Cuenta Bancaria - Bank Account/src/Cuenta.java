import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	public Cuenta(Usuario usuarioCuenta) {
		this.usuarioCuenta = usuarioCuenta;
		this.saldo = 0;
		this.gastos = new ArrayList<Gasto>();
		this.ingresos = new ArrayList<Ingreso>();
			
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Usuario getUsuarioCuenta() {
		return usuarioCuenta;
	}
	
	public void setUsuarioCuenta(Usuario usuarioCuenta) {
		this.usuarioCuenta = usuarioCuenta;
	}
	
	public double addIngresos(String description, double cantidad) {
		
		Ingreso nuevoIngreso = new Ingreso(cantidad, description);
		this.ingresos.add(nuevoIngreso);
		this.saldo = this.saldo+cantidad;
		return saldo;
	}
	
	
	public List<Ingreso> getIngresos(){
		return ingresos;
	}
	
	public List<Gasto> getGastos(){
		return gastos;
	}
	
	public double addGastos(String description, double cantidad) {
		try{ 
        
            this.saldo = this.saldo-cantidad;
             
            if(this.getSaldo()<0){ 
                throw  new  GastoException();
            }

        }catch(GastoException e){
   
            return -1;
        }
        Gasto nuevoGasto = new Gasto(cantidad,description);

        gastos.add(nuevoGasto);
        return saldo;

	}
	

	@Override
	
	public String toString() {
		return "Hola " + this.usuarioCuenta.getNombre() + ", el saldo de tu "
				+ "cuenta es " + this.saldo;
	}
	
	private double saldo;
	private Usuario usuarioCuenta;
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;
}

class Usuario {
	public Usuario() {
		this.nombre = "";
		this.dni = "";
		this.edad = 0;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return dni;
	}

	public boolean setDNI(String dni) {
		
		if(dni.matches("^[0-9]{8}[a-zA-Z]$")|| dni.matches("^[0-9]{8}[-][a-zA-Z]$")) {
			this.dni = dni;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	private String nombre;
	private int edad;
	private String dni;
}


class GastoException {
	private String error = "";
	public GastoException(){
		this.error = "No se puede agregar el gasto ya que el saldo es menos que "
				+ "el importe del gasto, o su saldo es cero euros.";
	}
		public String getMessage() {
			return error;
		}
	}
	
