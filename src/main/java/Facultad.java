import java.util.ArrayList;

public class Facultad {
	private String nombreFacultad;
	private String ubicacionFacultad;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public String getNombreFacultad() {
		return this.nombreFacultad;
	}

	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}

	public String getUbicacionFacultad() {
		return this.ubicacionFacultad;
	}

	public void setUbicacionFacultad(String ubicacionFacultad) {
		this.ubicacionFacultad = ubicacionFacultad;
	}
}