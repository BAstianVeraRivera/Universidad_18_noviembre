import java.util.ArrayList;

public class Departamento {
	private String nombreDepto;
	private ArrayList<CarreraUniversitaria> carreras = new ArrayList<CarreraUniversitaria>();
	private ArrayList<Profesor> profesor = new ArrayList<Profesor>();
	private ArrayList<Administrativo> administrativo = new ArrayList<Administrativo>();

	public String getNombreDepto() {
		return this.nombreDepto;
	}

	public void setNombreDepto(String nombreDepto) {
		this.nombreDepto = nombreDepto;
	}
}