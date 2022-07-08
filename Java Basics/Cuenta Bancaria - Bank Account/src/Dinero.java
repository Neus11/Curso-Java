
public abstract class Dinero {
	
	public double getDinero() {
		return dinero;	
	}
	
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract String getDescription();
	
	
	protected double dinero;
	protected String description;
}

class Gasto extends Dinero {	
	public Gasto(double gasto, String description) {
		this.dinero = gasto;
		this.description = description;
	}
	
	@Override
	public String getDescription() {
		return null;
	}
	
	@Override
	public String toString(){
	    return "Gasto descripcion " + this.description + ". Importe: " + this.dinero;
	  }
	
}

class Ingreso extends Dinero {
	public Ingreso(double ingreso, String description) {
		this.dinero = ingreso;
		this.description = description;
	}
	
	@Override
	public String toString(){
	    return "Ingreso concepto " + this.description + " Importe total: " + this.dinero;
	  }

	@Override
	public String getDescription() {
		return null;
	}
	
}