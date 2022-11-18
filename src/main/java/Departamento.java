import java.util.ArrayList;

public class Departamento {
	private String nombreDepto;
	public ArrayList<CarreraUniversitaria> carreras = new ArrayList<CarreraUniversitaria>();
	public ArrayList<Profesor> profesor = new ArrayList<Profesor>();
	public ArrayList<Administrativo> administrativo = new ArrayList<Administrativo>();

	public String getNombreDepto() {
		return this.nombreDepto;
	}

	public void setNombreDepto(String nombreDepto) {
		this.nombreDepto = nombreDepto;
	}
}