import java.util.ArrayList;

public class Universidad {
	private String nombreUniversidad;
	private String direccionUniversidad;
	private String tipoUniversidad;
	private ArrayList<Facultad> facultades = new ArrayList<Facultad>();
	private ArrayList<Trabajadores> trabajadores = new ArrayList<Trabajadores>();

	public String getNombreUniversidad() {
		return this.nombreUniversidad;
	}

	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}

	public String getDireccionUniversidad() {
		return this.direccionUniversidad;
	}

	public void setDireccionUniversidad(String direccionUniversidad) {
		this.direccionUniversidad = direccionUniversidad;
	}

	public String getTipoUniversidad() {
		return this.tipoUniversidad;
	}

	public void setTipoUniversidad(String tipoUniversidad) {
		this.tipoUniversidad = tipoUniversidad;
	}
	public ArrayList<Profesor> buscarProfesor(String nombreProfesor){
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		for(Trabajadores trabajador:this.trabajadores){
			if(trabajador.getTipo().equals("Profesor")){
				if(trabajador.getNombreTrabajador().equals(nombreProfesor)){
					profesores.add((Profesor) trabajador);
				}
				return profesores;
			}
		}
		return null;
	}
}